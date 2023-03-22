import java.util.Scanner;

public class CFlor {
    // Atributos - Caracterìstica - Propiedades Objeto real
    private String nombre;
    private String color;
    private String aroma;
    private double precio;
    // MÉTODOS
    // M. Constructores
    // Sobrecarga e metodos Varios metodos con el mismos nombre y diferente coleccion de parametros
    public CFlor(){
        System.out.print("Ingrese el nombre: ");
        this.setNombre(new Scanner(System.in).nextLine());
        System.out.print("Ingrese el Aroma: ");
        this.aroma = new Scanner(System.in).nextLine();
        System.out.print("Ingrese el Color: ");
        this.setColor(new Scanner(System.in).nextLine());
        System.out.print("Ingrese el Precio: ");
        this.setPrecio(new Scanner(System.in).nextInt());
    }
    public CFlor(String nombre, int precio){
        this.nombre = nombre;
        this.color = null;
        this.aroma = null;
        this.precio = precio;
    }

    public CFlor(String nombre, String color, String aroma, double precio) {
        this.nombre = nombre;
        this.color = color;
        this.aroma = aroma;
        this.precio = precio;
    }
    // M. Getters

    public String getNombre() {
        return this.nombre;
    }

    public String getColor() {
        return color;
    }

    public String getAroma() {
        return this.aroma;
    }

    public double getPrecio() {
        return this.precio;
    }

    // M. Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAroma(String aroma) {
        this.aroma = aroma;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    // M. Generales - Funcion - Comportamiento
    public void mostrar(){
        System.out.println("Nombre: "+this.nombre);
        System.out.println("Aroma: "+this.aroma);
        System.out.println("Color: "+this.color);
        System.out.println("Precio: S/ "+this.precio);
    }
}