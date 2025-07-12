package Sistema_Hospitalario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Busqueda_Form_SistHosp extends JFrame{
    private JPanel search_panel;

    private JTextField cedula_pac_txtfld;
    private JButton irARegistrarButton;
    private JButton buscarButton;

    public Busqueda_Form_SistHosp(){
        setTitle("Sistema Hospitalario");
        setContentPane(search_panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,150);
        setLocationRelativeTo(null);
        setVisible(true);

        irARegistrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Registro_Form_SistHosp();
            }
        });


        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cedula = cedula_pac_txtfld.getText();

                // Validamos que el campo de cédula no esté vacío
                if (cedula.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número de cédula.", "Campo Vacío", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Llamamos al método que busca en la base de datos
                Paciente pacienteEncontrado = buscarPacientePorCedula(cedula);

                if (pacienteEncontrado != null) {
                    // Si el paciente se encontró, mostramos su información completa
                    JOptionPane.showMessageDialog(null, pacienteEncontrado.getInfoCompleta(), "Paciente Encontrado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // Si no se encontró, informamos al usuario
                    JOptionPane.showMessageDialog(null, "No se encontró ningún paciente con la cédula: " + cedula, "Búsqueda Fallida", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private Paciente buscarPacientePorCedula(String cedula) {
        String sql = "SELECT * FROM paciente WHERE cedula = ?";

        try (Connection conn = DatabaseConnection_Sistema_Hospitalario.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            if (conn == null) return null;

            pstmt.setString(1, cedula);

            try (ResultSet rs = pstmt.executeQuery()) {
                // Si encontramos un resultado...
                if (rs.next()) {
                    // ...creamos un nuevo objeto Paciente con los datos de la base de datos.
                    return new Paciente(
                            rs.getString("cedula"),
                            rs.getInt("n_historial_clinico"),
                            rs.getString("nombre"),
                            rs.getString("apellido"),
                            rs.getString("telefono"),
                            rs.getInt("edad"),
                            rs.getString("descripcion_enfermedad")
                    );
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar paciente: " + ex.getMessage());
            ex.printStackTrace();
        }
        // Si no se encontró nada o hubo un error, devolvemos null.
        return null;
    }
}
