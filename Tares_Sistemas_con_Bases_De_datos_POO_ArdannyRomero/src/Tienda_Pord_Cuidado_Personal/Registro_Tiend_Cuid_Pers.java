package Tienda_Pord_Cuidado_Personal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Registro_Tiend_Cuid_Pers extends JFrame {
    private JPanel register_panel;

    private JTextField cod_pord_txtfld;
    private JTextField nombre_txtfld;
    private JTextField precio_txtfld;
    private JTextField cantidad_txtfld;
    private JTextField categoria_txtfld;
    private JTextArea descripcion_txtarea;
    private JButton registrarButton;
    private JButton irABuscarButton;
    private JButton salirButton;

    public Registro_Tiend_Cuid_Pers() {
        setTitle("Tienda");
        setContentPane(register_panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,300);
        setLocationRelativeTo(null);
        setVisible(true);

        irABuscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Busqueda_Tiend_Cuid_Pers();
            }
        });

        registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // 1. Recolectamos los datos de los campos del formulario
                    String codigo = cod_pord_txtfld.getText();
                    String nombre = nombre_txtfld.getText();
                    String descripcion = descripcion_txtarea.getText();
                    // Usamos BigDecimal para manejar precios y evitar errores de precisión
                    BigDecimal precio = new BigDecimal(precio_txtfld.getText());
                    int cantidad = Integer.parseInt(cantidad_txtfld.getText());
                    String categoria = categoria_txtfld.getText();

                    // 2. Validamos que los campos obligatorios no estén vacíos
                    if (codigo.trim().isEmpty() || nombre.trim().isEmpty() || precio_txtfld.getText().trim().isEmpty() || cantidad_txtfld.getText().trim().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "Código, Nombre, Precio y Cantidad son campos obligatorios.", "Campos Requeridos", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                    // 3. Creamos un objeto Producto con los datos del formulario
                    Producto nuevoProducto = new Producto(codigo, nombre, descripcion, precio, cantidad, categoria);

                    // 4. Llamamos al método para registrar en la BD
                    if (registrarProducto(nuevoProducto)) {
                        JOptionPane.showMessageDialog(null, "Producto registrado exitosamente.", "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
                        limpiarCampos(); // Limpiamos los campos para el siguiente registro
                    } else {
                        JOptionPane.showMessageDialog(null, "Error al registrar el producto.\nEl código de producto podría ya existir.", "Error de Registro", JOptionPane.ERROR_MESSAGE);
                    }

                } catch (NumberFormatException ex) {
                    // Este error ocurre si el usuario escribe texto en campos numéricos
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un número válido para el precio y la cantidad.", "Error de Formato", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        salirButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Login_Form_Tiend_Cuid_Pers();
            }
        });
    }

    private boolean registrarProducto(Producto producto) {
        String sql = "INSERT INTO PRODUCTO (codigo_producto, nombre, descripcion, precio, cantidad, categoria) VALUES (?, ?, ?, ?, ?, ?)";

        // Usamos la conexión flexible, especificando el nombre de la BD de la tienda
        try (Connection conn = DatabaseConnection_Tienda_Pord_Personales.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            if (conn == null) return false;

            // Asignamos los valores del objeto Producto a la consulta SQL
            pstmt.setString(1, producto.getCodigoProducto());
            pstmt.setString(2, producto.getNombre());
            pstmt.setString(3, producto.getDescripcion());
            pstmt.setBigDecimal(4, producto.getPrecio());
            pstmt.setInt(5, producto.getCantidad());
            pstmt.setString(6, producto.getCategoria());

            // executeUpdate() devuelve el número de filas afectadas.
            int filasAfectadas = pstmt.executeUpdate();
            return filasAfectadas > 0;

        } catch (SQLException ex) {
            // Este error es común si intentas insertar un 'codigo_producto' que ya existe (PRIMARY KEY)
            System.out.println("Error al registrar el producto en la BD: " + ex.getMessage());
            ex.printStackTrace();
            return false;
        }
    }

    private void limpiarCampos() {
        cod_pord_txtfld.setText("");
        nombre_txtfld.setText("");
        descripcion_txtarea.setText("");
        precio_txtfld.setText("");
        cantidad_txtfld.setText("");
        categoria_txtfld.setText("");
    }
}
