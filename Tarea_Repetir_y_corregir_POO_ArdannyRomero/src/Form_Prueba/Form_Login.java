package Form_Prueba;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_Login extends JFrame{
    private JPanel login_panel;

    private JPasswordField password_passfld;
    private JTextField user_txtfld;
    private JButton ingresarButton;

    public Form_Login(){
        setTitle("Login");
        setContentPane(login_panel);
        setSize(400,175);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = user_txtfld.getText();
                String clave = new String(password_passfld.getPassword());

                try {
                    if (usuario.trim().isEmpty() || clave.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null,"Por favor, complete todos los parametros");
                    } else if (usuario.equals("romero") && clave.equals("esfot123")) {
                        dispose();
                        new Form_Menu_Opciones();
                    }
                    else {
                        JOptionPane.showMessageDialog(null, "Datos incorrectos");
                    }
                } catch (Exception p) {
                    JOptionPane.showMessageDialog(null,"Error inesperado en los datos");
                }
            }
        });
    }
}
