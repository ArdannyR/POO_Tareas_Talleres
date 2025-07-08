package Form_Prueba;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form_Registro extends JFrame{
    private JPanel panel_registro;

    private JTextField cod_txtfld;
    private JTextField nombre_txtfld;
    private JTextField detalle_txtfld;
    private JTextField precio_u_txtfld;
    private JTextField stock_txtfld;

    private JButton registrarButton;
    private JButton regresarButton;
    private JButton limpiarButton;

    public Form_Registro(){
        setTitle("Registro");
        setContentPane(panel_registro);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setLocationRelativeTo(null);
        setVisible(true);

        regresarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Form_Menu_Opciones();
            }
        });
        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = cod_txtfld.getText();
                String nombre = nombre_txtfld.getText();
                String detalle = detalle_txtfld.getText();
                String precio_txt = precio_u_txtfld.getText();
                String stock_txt = stock_txtfld.getText();
                try {
                    Double precio = Double.parseDouble(precio_txt);
                    Integer stock = Integer.parseInt(stock_txt);
                    if (codigo.trim().isEmpty() || nombre.trim().isEmpty() || detalle.trim().isEmpty() || precio_txt.trim().isEmpty() || stock_txt.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null,"Por favor, llene todos los cuadros de texto");
                    } else if (precio > 9999.99 || stock > 999.99) {
                        JOptionPane.showMessageDialog(null,"Valores numericos fuera de rango");
                    } else {
                        Prodcuto prodcuto = new Prodcuto(codigo,nombre,detalle,precio,stock);
                        dispose();
                        new Form_Menu_Opciones();
                        JOptionPane.showMessageDialog(null,"Datos registrados con exito!");
                    }
                } catch (Exception p) {
                    JOptionPane.showMessageDialog(null,"Existe un error en los datos");
                }
            }
        });
        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cod_txtfld.setText("");
                nombre_txtfld.setText("");
                detalle_txtfld.setText("");
                precio_u_txtfld.setText("");
                stock_txtfld.setText("");
            }
        });
    }
}
