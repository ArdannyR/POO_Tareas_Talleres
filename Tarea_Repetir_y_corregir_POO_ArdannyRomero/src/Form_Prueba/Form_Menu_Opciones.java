package Form_Prueba;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_Menu_Opciones extends JFrame{
    private JPanel panel_menu_opc;

    private JButton registroButton;
    private JButton ventasButton;
    private JButton verProductosButton;

    // Variable para almacenar el producto que viene de Form_Registro
    private Prodcuto productoRegistrado;

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
                // Se pasa la instancia actual de 'this' al formulario de registro
                new Form_Registro(Form_Menu_Opciones.this);
            }
        });
        ventasButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Se comprueba si existe un producto registrado
                if (productoRegistrado != null) {
                    dispose();
                    // Se abre Form_Ventas y se le pasa el producto
                    new Form_Ventas(productoRegistrado);
                } else {
                    // Si no hay producto, se notifica al usuario
                    JOptionPane.showMessageDialog(null, "Primero debe registrar un producto.");
                }
            }
        });
    }
    // Método "setter" para que Form_Registro pueda pasar el producto
    public void setProductoRegistrado(Prodcuto producto) {
        this.productoRegistrado = producto;
    }
}
