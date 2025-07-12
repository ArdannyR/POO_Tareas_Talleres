package Sistema_Hospitalario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registro_Form_SistHosp extends JFrame{
    private JPanel register_panel;

    private JTextField cedula_txtfld;
    private JTextField num_historial_clinico_txtfld;
    private JTextField nombre_txtfld;
    private JTextField apellido_txtfld;
    private JTextField telefono_txtfld;
    private JTextField edad_txtfld;
    private JTextArea descrip_enfermedad_txtarea;
    private JButton irABuscarButton;
    private JButton registrarButton;

    public Registro_Form_SistHosp(){
        setTitle("Sistema Hospitalario");
        setContentPane(register_panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setLocationRelativeTo(null);
        setVisible(true);

        irABuscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Busqueda_Form_SistHosp();
            }
        });


        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String cedula = cedula_txtfld.getText();
                    int nHistorial = Integer.parseInt(num_historial_clinico_txtfld.getText());
                    String nombre = nombre_txtfld.getText();
                    String apellido = apellido_txtfld.getText();
                    String telefono = telefono_txtfld.getText();
                    int edad = Integer.parseInt(edad_txtfld.getText());
                    String descripcion = descrip_enfermedad_txtarea.getText();

                    if (cedula.trim().isEmpty() || nombre.trim().isEmpty() || apellido.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Cédula, nombre y apellido son campos obligatorios.", "Campos Requeridos", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    // Creamos un objeto Paciente con los datos del formulario
                    Paciente nuevoPaciente = new Paciente(cedula, nHistorial, nombre, apellido, telefono, edad, descripcion);

                    // Llamamos al método para registrar en la BD
                    if (registrarPaciente(nuevoPaciente)) {
                        JOptionPane.showMessageDialog(null, "Paciente registrado exitosamente.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
                        limpiarCampos(); // Limpiamos los campos después de registrar
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al registrar el paciente.\nLa cédula podría ya existir o hubo un problema con la base de datos.", "Error de Registro", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (NumberFormatException ex) {
                    // Este error ocurre si el usuario escribe texto en campos numéricos (edad, historial)
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para la edad y el historial clínico.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private boolean registrarPaciente(Paciente paciente) {
        // Instrucción SQL para insertar un nuevo registro en la tabla 'paciente'
        String sql = "INSERT INTO paciente (cedula, n_historial_clinico, nombre, apellido, telefono, edad, descripcion_enfermedad) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            if (conn == null) return false;

            // Asignamos los valores del objeto Paciente a la consulta SQL
            pstmt.setString(1, paciente.getCedula());
            pstmt.setInt(2, paciente.getnHistorialClinico());
            pstmt.setString(3, paciente.getNombre());
            pstmt.setString(4, paciente.getApellido());
            pstmt.setString(5, paciente.getTelefono());
            pstmt.setInt(6, paciente.getEdad());
            pstmt.setString(7, paciente.getDescripcionEnfermedad());

            // executeUpdate() devuelve el número de filas afectadas. Si es mayor a 0, la inserción fue exitosa.
            int filasAfectadas = pstmt.executeUpdate();
            return filasAfectadas > 0;

        } catch (SQLException ex) {
            System.out.println("Error al registrar paciente: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }

    private void limpiarCampos() {
        cedula_txtfld.setText("");
        num_historial_clinico_txtfld.setText("");
        nombre_txtfld.setText("");
        apellido_txtfld.setText("");
        telefono_txtfld.setText("");
        edad_txtfld.setText("");
        descrip_enfermedad_txtarea.setText("");
    }
}
