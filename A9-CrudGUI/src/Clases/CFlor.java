package Clases;

import java.util.Date;
import java.util.Scanner;
import conexion.conector;

public class CFlor {
    // ATRIBUTOS - Caracteristicas - Propiedades del objeto de la realidad
    private int idflor = 0;
    private String nombre;
    private String aroma;
    private String color;
    private double precio;
    private int stock = 0;
    private Date fcreacion = null;
    private String estado;

    // MÉTODOS
    // M. contructores
    public CFlor(){
        this.idflor = 0;
        this.nombre=null;
        this.aroma=null;
        this.color=null;
        this.precio=0;
        this.estado = null;
        this.fcreacion = null;
        this.stock = 0;
    }

    public CFlor(String pNombre, String pAroma, String pColor, double pPrecio, int pstock, Date pfcreacion, String pestado){
        nombre = pNombre;
        aroma = pAroma;
        color = pColor;
        precio = pPrecio;
        stock = pstock;
        fcreacion = pfcreacion;
        estado = pestado;
    }

    // M. Getters

    public int getIdflor() {
        return idflor;
    }

    public void setIdflor(int idflor) {
        this.idflor = idflor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAroma() {
        return aroma;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Date getFcreacion() {
        return fcreacion;
    }

    public void setFcreacion(Date fcreacion) {
        this.fcreacion = fcreacion;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // M. Generales - Comportamiento - Función

    public void mostrar(){
        System.out.println(" - Nombre: " + this.getNombre());
        System.out.println(" - Aroma: " + this.getAroma());
        System.out.println(" - Color: " + this.getColor());
        System.out.println(" - Precio: " +this.getPrecio());
    }
    public void mostrarEnLista(){
        // Ejerccio: Corregir el formato (substring) y crear un metodo formatear(String cadena)
        System.out.print(this.getNombre()+"\t");
        System.out.print(this.getAroma()+"\t");
        System.out.print(this.getColor()+"\t");
        System.out.println(this.getPrecio());
    }

    public String formatear(String cadena){
        cadena.substring(0,15); // Devuelve una subcadena que inicia en 0 y termina en 15
        cadena.length(); // Devuleve el tamaño de la cadena (Texto)
        return null;
    }

    public String formateartexto(String a){
        // Tareitas
        return "";
    }
    public void save(){
        conector c = new conector();
        String consulta = "call crearFlor('"
                          + this.nombre+"','"
                          + this.aroma +"','"
                          + this.color + "', "
                          + this.precio + ","
                          + this.stock + ","
                          + "'2023-12-15 12:45:15'" + ", '"
                          + this.estado + "')";
        System.out.println(consulta);
        c.ejecutarProcedimientoSinDatos(consulta);
    }
    public void update(){
        conector c = new conector();
        String consulta = "call actualizarFlor("
                + this.idflor+",'"
                + this.nombre+"','"
                + this.aroma +"','"
                + this.color + "', "
                + this.precio + ","
                + this.stock + ","
                + "'2023-12-15 12:45:15'" + ", '"
                + this.estado + "')";
        System.out.println(consulta);
        //c.ejecutarProcedimientoSinDatos(consulta);
    }
}
