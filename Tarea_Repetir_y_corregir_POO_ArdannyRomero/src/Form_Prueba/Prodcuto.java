package Form_Prueba;

public class Prodcuto { // Al parecer para pasar datos entre forms se usa una clase que conecte ambas
    private String codigo;
    private String nombre;
    private String detalle;
    private double precio_unitario;
    private int stock;

    public Prodcuto(String codigo, String nombre, String detalle, double precio_unitario, int stock){
        this.codigo = codigo;
        this.nombre = nombre;
        this.detalle = detalle;
        this.precio_unitario = precio_unitario;
        this.stock = stock;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public double getPrecio_unitario() {
        return precio_unitario;
    }

    public void setPrecio_unitario(double precio_unitario) {
        this.precio_unitario = precio_unitario;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
