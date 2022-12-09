import java.util.Scanner;

public class PrincipalEstructuraVariables {
    public static int limite; // Declaracion
    public static int iterador = 0; // Declaracion + Asignación

    public static int leerEntero(){
        int entero = 0;
        Scanner teclado = new Scanner(System.in);
        try {
            entero = teclado.nextInt();
        } catch(Exception e) {
            escribir("Error: Ese no es un número, no seas pendejo.");
        }
        return entero;
    }

    public static void escribirLinea(String mensaje){
        System.out.println(mensaje);
    }

    public static void escribir(String mensaje){
        System.out.print(mensaje);
    }

    public static void main(String[] args) {
        limite = 10; // Asignación
        int i;
        for (i = 0; i < limite; i++){
            System.out.println(" i = " + i + "Dentro del bucle");
        }
        System.out.println("i = " + i + "Fuera del bucle"); // i fuera del bucle for , no existe

        System.out.println("Bienvenidos, este es tu primer programa java");

        escribirLinea("#################################3");
        escribir("Ingrese su edad: ");

        escribir("Su edad es: " + leerEntero());
    }
}
