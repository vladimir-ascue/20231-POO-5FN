// import .... Librerias


import java.util.Scanner;

public class PrincipalModularidad {

    public static int leerEntero(){
        int e = 0;
        Scanner sc = new Scanner(System.in);  // El scanner esta constantemente viendo la actividad del teclado
                                              // Y trabaja de la mano con System (el Sistema) para que observe los
                                              // INgresos de teclado (System.in)

        e = sc.nextInt();                         // COnvertimos lo ingresado por teclado y lo convertimos a Entero

        return e;
    }

    public static int leerEnt(){
        return new Scanner(System.in).nextInt();
    }

    public static int sumar(int num1, int num2){
        int suma = num1 + num2;
        return suma;
    }

    public static int restar(int num1, int num2){
        int dif = num1 - num2;
        return dif;
    }

    public static int multiplicar(int num1, int num2){
        int prod = num1 * num2;
        return prod;
    }

    public static int dividir(int num1, int num2){
        int cos = num1 / num2;
        return cos;
    }

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("###### MENU ######");
            System.out.println("  0- Salir.");
            System.out.println("  1- Sumar.");
            System.out.println("  2- Restar.");
            System.out.println("  3- Multiplicar.");
            System.out.println("  4- Dividir.");
            System.out.print("Ingrese una opción: ");
            opcion = leerEnt();
            System.out.print("Ingrese un numero entero: ");
            int num1 = leerEntero();
            System.out.print("Ingrese otro numero entero: ");
            int num2 = leerEntero();
            switch ( opcion ){
                case 0:
                    System.out.println("Gracias por usar esta triste calculadora. Vuelva pronto");
                    break;
                case 1:
                    System.out.println("La suma de " + num1 + " y " + num2 + " es: " + sumar(num1, num2));
                    break;
                case 2:
                    System.out.println("La diferencia de " + num1 + " y " + num2 + " es: " + restar(num1, num2));
                    break;
                case 3:
                    System.out.println("El producto de " + num1 + " y " + num2 + " es: " + multiplicar(num1, num2));
                    break;
                case 4:
                    System.out.println("El cosiente de " + num1 + " y " + num2 + " es: " + dividir(num1, num2));
                    break;
                default:
                    System.out.println("Esa opcion no es válida.");
                    break;
            }
        } while ( opcion > 0 );
    }
}
