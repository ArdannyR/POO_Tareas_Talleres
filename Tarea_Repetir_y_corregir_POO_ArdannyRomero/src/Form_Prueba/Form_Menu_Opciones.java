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
                    new Form_Ventas(productoRegistrado, Form_Menu_Opciones.this);
                } else {
                    // Si no hay producto, se notifica al usuario
                    JOptionPane.showMessageDialog(null, "Primero debe registrar un producto.");
                }
            }
        });
        verProductosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (productoRegistrado != null) {
                    String infoProducto = String.format("--- Información del Producto ---\nCódigo: %s\nNombre: %s\nDetalle: %s\nPrecio: $%.2f\nStock disponible: %d",
                            productoRegistrado.getCodigo(), productoRegistrado.getNombre(), productoRegistrado.getDetalle(), productoRegistrado.getPrecio_unitario(), productoRegistrado.getStock());
                    JOptionPane.showMessageDialog(null, infoProducto, "Datos del Producto", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Aún no se ha registrado ningún producto.", "Sin Producto", JOptionPane.WARNING_MESSAGE);
                }
            }
        });
    }
    // Método "setter" para que Form_Registro pueda pasar el producto
    public void setProductoRegistrado(Prodcuto producto) {
        this.productoRegistrado = producto;
    }
}
