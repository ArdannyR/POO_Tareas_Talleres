import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form3_TestCompras {
    private JComboBox comboBox1;
    private JPanel panel_1;
    private JLabel title_lab;
    private JLabel cantidad_lab;
    private JLabel resumen_lab;
    private JTextField textField1;
    private JButton PagarButton;
    private JButton limpiarButton;
    private JTable resumen;

    public Form3_TestCompras() {
        // Configura modelo de tabla si aún no tiene columnas
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Producto");
        model.addColumn("Cantidad");
        model.addColumn("Precio Unitario");
        model.addColumn("Subtotal");
        model.addColumn("IVA (15%)");
        model.addColumn("Descuento (20%)");
        model.addColumn("Total");
        resumen.setModel(model);

        PagarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item = comboBox1.getSelectedItem().toString();
                String[] partes = item.split("→");

                if (partes.length < 2) {
                    JOptionPane.showMessageDialog(panel_1, "El formato del producto no es válido.");
                    return;
                }
                String nombreProducto = partes[0].trim();
                String precioTexto = partes[1].replace("$", "").trim();

                double precioUnitario = Double.parseDouble(precioTexto);
                int cantidad = Integer.parseInt(textField1.getText());

                double subtotal = precioUnitario * cantidad;
                double iva = subtotal * 0.15;
                double descuento = subtotal * 0.20;
                double total = subtotal + iva - descuento;

                model.addRow(new Object[]{
                        nombreProducto,
                        cantidad,
                        String.format("$%.2f", precioUnitario),
                        String.format("$%.2f", subtotal),
                        String.format("$%.2f", iva),
                        String.format("-$%.2f", descuento),
                        String.format("$%.2f", total)
                });
            }
        });

        limpiarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setText("");
                comboBox1.setSelectedIndex(0);
                model.setRowCount(0);
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Test Compras");
        frame.setContentPane(new Form3_TestCompras().panel_1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
