package Form_Simulador_Bancario.Forms;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login_Form extends JFrame{ // extends JFram para llamada externa
    private JPanel Login_panel;

    private JTextField userd_fld;

    private JPasswordField password_fld;

    private JButton ingresarButton;

    private JLabel title_lab;
    private JLabel User_lab;
    private JLabel Passw_lab;
    private JLabel response_lab;

    public Login_Form(){
        setTitle("Simulador Bancario Interactivo");
        setVisible(true);
        setSize(400,200);
        // pack();
        setLocationRelativeTo(null); // esta ya no me manda la ventana a una equina
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(Login_panel);

        ingresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String usuario = userd_fld.getText();
                    String contraseña = new String(password_fld.getPassword()); // las passwords se manejan de froma difrente a un txt comun

                    if (usuario.equals("cliente123") && contraseña.equals("clave456")) {
                        setVisible(false);
                        new Banco_Form();
                    } else if (usuario.trim().isEmpty() || contraseña.trim().isEmpty()) {
                        response_lab.setText("Existen campos vacíos");
                    } else {
                        response_lab.setText("Usuario o contraseña erróneas");
                    }
                } catch (Exception p) {
                    response_lab.setText(String.format("Error inesperado: %s", p.getMessage()));
                }
                // el try and catch no creo que era necesario pero lo puse para ir proactcando su funcionamiento
            }
        });
    }
}
