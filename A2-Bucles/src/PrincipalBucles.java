import java.util.Scanner;

public class PrincipalBucles {
    public static int leerEntero(String mensaje){
        int entero = 0;
        Scanner teclado;
        Boolean flag = true;
        do {
            try { // Intentar
                escribir(" "+mensaje+": ");
                teclado = new Scanner(System.in);
                entero = teclado.nextInt();
                flag = false;
            } catch(Exception e) {
                escribirLinea(">>Error<< El dato ingresado no es un número.\n Intentelo nuevamente.");
            }
        } while ( flag );
        return entero;
    }

    public static void escribirLinea(String mensaje){
        System.out.println(mensaje);
    }

    public static void escribir(String mensaje){
        System.out.print(mensaje);
    }
    public static void main(String[] args) {
        int iterador = 0;
        int limite = 10;

        do{
            escribirLinea("Iteador = " + iterador);
            iterador++;
        } while( iterador < limite );

        int iterador2 = 0;
        int limite2 = 10;

        Boolean flag = iterador2 < limite2;

        do{
            escribirLinea("Iteador2 = " + iterador2);
            iterador2++;
            if(iterador2 == limite2)
                flag = !flag;
        } while( flag );


        int talla = leerEntero("Ingrese su talla");
        escribirLinea("Su talla es: " + talla + "Felicidades.");

    }
}




























