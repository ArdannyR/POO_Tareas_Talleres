package Sistema_Hospitalario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Login_Form_SistHosp extends JFrame{
    private JPanel login_panel;

    private JTextField user_txtfld;
    private JPasswordField password_passfld;
    private JButton ingresarButton;

    public Login_Form_SistHosp(){
        setTitle("Sistema Hospitalario");
        setContentPane(login_panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,150);
        setLocationRelativeTo(null);
        setVisible(true);

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = user_txtfld.getText();
                String clave = new String(password_passfld.getPassword());

                if (usuario.trim().isEmpty() || clave.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese su usuario y contraseña.");
                } else if (validarUsuario(usuario, clave)) {
                    JOptionPane.showMessageDialog(null, "¡Login exitoso! Bienvenido al sistema.");
                    setVisible(false);
                    new Busqueda_Form_SistHosp();
                } else {
                    JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrectos.");
                }
            }
        });
    }

    // Este método se conecta a tu MySQL y verifica si el usuario y la contraseña existen.
    private boolean validarUsuario(String username, String password) {
        // Esta es la instrucción SQL. Busca en la tabla "usuario" una fila
        // donde la columna "username" y "password" coincidan con lo que se ingresó.
        String sql = "SELECT * FROM usuario WHERE username = ? AND password = ?";
        try (Connection conn = DatabaseConnection_Sistema_Hospitalario.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            if (conn == null) {
                return false;
            }
            // Aquí se asignan los valores de los campos de texto a la consulta SQL de forma segura
            pstmt.setString(1, username); // El primer "?" se reemplaza por el usuario
            pstmt.setString(2, password); // El segundo "?" se reemplaza por la contraseña
            // Se ejecuta la consulta en la base de datos
            try (ResultSet rs = pstmt.executeQuery()) {
                // rs.next() devuelve "true" si la base de datos encontró al menos una fila que coincide.
                // Si no encuentra ninguna, devuelve "false".
                return rs.next();
            }
        } catch (SQLException ex) {
            System.out.println("Error al validar el usuario: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }

}
