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

    public Form_Ventas(Prodcuto prodcuto) {
        setTitle("Ventas");
        setContentPane(panel_ventas);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,175);
        setLocationRelativeTo(null);
        setVisible(true);
        
        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cod_de_producto = cod_txtfld_s.getText();
                if (cod_de_producto.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null,"Por favor ingrese un codigo a buscar");
                } else if (cod_de_producto.equals()) {
                    
                }
            }
        });
    }
}
