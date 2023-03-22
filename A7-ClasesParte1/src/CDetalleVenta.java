public class CDetalleVenta {
    private int idDetalleVenta;
    private int idVenta;
    private int idProducto; // Es una flor ....
    private int cantidad;
    private double descuento;
    private double precio;

    public CDetalleVenta() {
        this.idDetalleVenta = 0;// index
        this.idVenta = 0;
        this.idProducto = 0;
        this.cantidad = 0;
        this.descuento = 0;
        this.precio = 0;
    }

    public CDetalleVenta(int idDetalleVenta, int idVenta, int idProducto, int cantidad, double descuento, double precio) {
        this.idDetalleVenta = idDetalleVenta;// index
        this.idVenta = idVenta;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.precio = precio;
    }

    public int getIdDetalleVenta() {
        return idDetalleVenta;
    }

    public void setIdDetalleVenta(int idDetalleVenta) {
        this.idDetalleVenta = idDetalleVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrar(){
        System.out.println("idDetalleVenta: "+this.getIdDetalleVenta());
        System.out.println("idVenta: "+this.idVenta);
        System.out.println("idProducto: "+this.idProducto);
        System.out.println("cantidad: "+this.cantidad);
        System.out.println("descuento: "+this.descuento);
        System.out.println("precio: "+this.precio);
    }

    public void mostrarLista(){
        System.out.print("\t"+this.getIdDetalleVenta());
        System.out.print("\t"+this.idVenta);
        System.out.print("\t"+this.idProducto);
        System.out.print("\t"+this.cantidad);
        System.out.print("\t"+this.descuento);
        System.out.println("\t"+this.precio);
    }
}
