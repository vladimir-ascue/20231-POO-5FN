import java.util.Date;

public class CVenta {
    private int idVenta;  // Index de la lista
    private String tipoDocumento; // Factura | Boleta de Venta
    private String nroDocumento; // 001-02564
    private Date fechaVenta; //
    private String idVendedor;  //
    private String idCliente;  // dni Cliente
    private double precioTotal; // Suma de precios unitarios  Detalle
    private double igv; // se calcula
    private double descuento; // Suma de descuentos unitarios o descuento global
    private String estado; // Activo | Inactivo >>> nueva | cancelada | anulada | por pagar

    public CVenta(int idVenta, String tipoDocumento, String nroDocumento, Date fechaVenta, String idVendedor, String idCliente, double precioTotal, double igv, double descuento, String estado) {
        this.idVenta = idVenta;
        this.tipoDocumento = tipoDocumento;
        this.nroDocumento = nroDocumento;
        this.fechaVenta = fechaVenta;
        this.idVendedor = idVendedor;
        this.idCliente = idCliente;
        this.precioTotal = precioTotal;
        this.igv = igv;
        this.descuento = descuento;
        this.estado = estado;

    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getNroDocumento() {
        return nroDocumento;
    }

    public void setNroDocumento(String nroDocumento) {
        this.nroDocumento = nroDocumento;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public String getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(String idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public double getIgv() {
        return igv;
    }

    public void setIgv(double igv) {
        this.igv = igv;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void mostrarLista(){
        System.out.println("- idVenta: "+this.idVenta);
        System.out.println("- tipoDocumento: "+this.tipoDocumento);
        System.out.println("- nroDocumento: "+this.nroDocumento);
        System.out.println("- fechaVenta: "+this.fechaVenta);
        System.out.println("- idVendedor: "+this.idVendedor);
        System.out.println("- idCliente: "+this.idCliente);
        System.out.println("- precioTotal: "+this.precioTotal);
        System.out.println("- igv: "+this.igv);
        System.out.println("- descuento: "+this.descuento);
        System.out.println("- estado: "+this.estado);
    }
//    private int idVenta;  // Index de la lista
//    private String tipoDocumento; // Factura | Boleta de Venta
//    private String nroDocumento; // 001-02564
//    private Date fechaVenta; //
//    private String idVendedor;  //
//    private String idCliente;  // dni Cliente
//    private double precioTotal; // Suma de precios unitarios  Detalle
//    private double igv; // se calcula
//    private double descuento; // Suma de descuentos unitarios o descuento global
//    private String estado; //

}
