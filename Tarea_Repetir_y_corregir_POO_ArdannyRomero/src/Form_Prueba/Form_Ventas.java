package Form_Prueba;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_Ventas extends JFrame{
    private JPanel panel_ventas;
    
    private JLabel nombre_lab;
    private JLabel precio_u_lab;
    
    private JTextField cod_txtfld_s;
    private JButton buscarButton;
    private JButton calcularButton;
    private JButton regresarButton;

    private Form_Menu_Opciones menuOpciones;

    public Form_Ventas(Prodcuto prodcuto, Form_Menu_Opciones menu) {
        this.menuOpciones = menu;

        setTitle("Ventas");
        setContentPane(panel_ventas);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(425,200);
        setLocationRelativeTo(null);
        setVisible(true);
        
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cod_de_producto = cod_txtfld_s.getText();
                if (cod_de_producto.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Por favor ingrese un codigo a buscar");
                } else if (prodcuto  != null && cod_de_producto.equals(prodcuto .getCodigo())) {
                    JOptionPane.showMessageDialog(null, "Producto encontrado: " + prodcuto.getNombre() + "\nStock disponible: " + prodcuto.getStock());
                    nombre_lab.setText(prodcuto.getNombre());
                    String precio_txt = String.valueOf(prodcuto.getPrecio_unitario());
                    precio_u_lab.setText(precio_txt);
                } else {
                    JOptionPane.showMessageDialog(null, "El código del producto no coincide o no hay producto cargado.");
                }
            }
        });
        calcularButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String cantidad_txt = JOptionPane.showInputDialog("Ingrese una cantidad a comprar del producto");
                    Integer cantidad = Integer.valueOf(cantidad_txt);
                    String cod_de_producto = cod_txtfld_s.getText();
                    if (cod_de_producto.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null,"Por favor ingrese un codigo a buscar");
                    } else if (prodcuto  != null && cod_de_producto.equals(prodcuto .getCodigo())) {
                        if (cantidad > prodcuto.getStock()) {
                            JOptionPane.showMessageDialog(null,"Stock fuera de rango");
                        }
                        else {
                            Double subtotal = prodcuto.getPrecio_unitario() * cantidad;
                            Double iva = subtotal * 0.12;
                            Double total = subtotal * 1.12;
                            String mensaje = String.format("Subtotal: %.2f \nIva: %.2f \nTotal: %.2f", subtotal, iva, total);
                            prodcuto.setStock(prodcuto.getStock()-cantidad);
                            JOptionPane.showMessageDialog(null,mensaje);
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "El código del producto no coincide o no hay producto cargado.");
                    }
                } catch (Exception p){
                    JOptionPane.showMessageDialog(null,"Hay un error en los datos ingresados");
                }
            }
        });
        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 1. Devuelve el producto (con el stock ya actualizado) al menú
                menuOpciones.setProductoRegistrado(prodcuto);
                // 2. Muestra nuevamente el menú
                menuOpciones.setVisible(true);
                // 3. Cierra la ventana actual de ventas
                dispose();
            }
        });
    }
}
