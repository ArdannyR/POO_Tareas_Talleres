package Tienda_Pord_Cuidado_Personal;

import java.math.BigDecimal;

public class Producto {
    private String codigoProducto;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private int cantidad;
    private String categoria;

    public Producto(String codigoProducto, String nombre, String descripcion, BigDecimal precio, int cantidad, String categoria) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getCodigoProducto() { return codigoProducto; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public BigDecimal getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public String getCategoria() { return categoria; }

    public String getInfoCompleta() {
        return String.format(
                "--- Detalle del Producto ---\n" +
                        "Código: %s\n" +
                        "Nombre: %s\n" +
                        "Categoría: %s\n" +
                        "Descripción: %s\n" +
                        "Precio: $%.2f\n" +
                        "Stock: %d unidades",
                codigoProducto, nombre, categoria, descripcion, precio, cantidad
        );
    }
}