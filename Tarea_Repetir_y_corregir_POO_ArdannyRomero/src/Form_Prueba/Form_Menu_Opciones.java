package Form_Prueba;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_Menu_Opciones extends JFrame{
    private JPanel panel_menu_opc;

    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductosButton;

    public Form_Menu_Opciones(){
        setTitle("Menu de Opciones");
        setContentPane(panel_menu_opc);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,175);
        setLocationRelativeTo(null);
        setVisible(true);

        registroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Form_Registro();
            }
        });
        ventasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Form_Ventas(Prodcuto producto);
            }
        });
    }
}
