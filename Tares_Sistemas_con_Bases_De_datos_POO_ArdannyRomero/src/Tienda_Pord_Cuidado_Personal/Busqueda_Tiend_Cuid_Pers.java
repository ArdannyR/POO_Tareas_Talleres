package Tienda_Pord_Cuidado_Personal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Busqueda_Tiend_Cuid_Pers extends JFrame{
    private JPanel search_panel;

    private JTextField codigo_producto_txtfld;
    private JButton buscarButton;
    private JButton irARegistrarButton;

    public Busqueda_Tiend_Cuid_Pers(){
        setTitle("Tienda");
        setContentPane(search_panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,150);
        setLocationRelativeTo(null);
        setVisible(true);

        irARegistrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Registro_Tiend_Cuid_Pers();
            }
        });


        buscarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigoProducto = codigo_producto_txtfld.getText();

                if (codigoProducto.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Por favor, ingrese un código de producto.", "Campo Vacío", JOptionPane.WARNING_MESSAGE);
                    return;
                }

                // Usamos el método que se conecta a la base de datos
                Producto productoEncontrado = buscarProductoPorCodigo(codigoProducto);

                if (productoEncontrado != null) {
                    // Si se encuentra, mostramos la información completa.
                    JOptionPane.showMessageDialog(null, productoEncontrado.getInfoCompleta(), "Producto Encontrado", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    // Si no, mostramos un error.
                    JOptionPane.showMessageDialog(null, "No se encontró ningún producto con el código: " + codigoProducto, "Búsqueda Fallida", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
    }

    private Producto buscarProductoPorCodigo(String codigo) {
        // La consulta SQL para buscar en la tabla PRODUCTO
        String sql = "SELECT * FROM PRODUCTO WHERE codigo_producto = ?";

        // Usamos la clase de conexión flexible que creamos
        try (Connection conn = DatabaseConnection_Tienda_Pord_Personales.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            if (conn == null) return null; // Si la conexión falla, no continuamos.

            pstmt.setString(1, codigo); // Asignamos el código a la consulta

            try (ResultSet rs = pstmt.executeQuery()) {
                // Si la consulta devuelve un resultado...
                if (rs.next()) {
                    // ...creamos un objeto Producto con los datos de la fila encontrada.
                    return new Producto(
                            rs.getString("codigo_producto"),
                            rs.getString("nombre"),
                            rs.getString("descripcion"),
                            rs.getBigDecimal("precio"),
                            rs.getInt("cantidad"),
                            rs.getString("categoria")
                    );
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al buscar el producto: " + ex.getMessage());
            ex.printStackTrace();
        }
        // Si no se encuentra el producto o hay un error, devolvemos null.
        return null;
    }
}
