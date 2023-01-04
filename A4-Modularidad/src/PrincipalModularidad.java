import java.util.Scanner;

public class PrincipalModularidad {

    public static int leerEntero(){
        int e = 0;
        Scanner sc;
        try {
            sc = new Scanner(System.in); // Ingreso de datos del teclado
            e = sc.nextInt();  // Convierte el dato en Entero
        } catch (Exception ex){
            System.out.println("Error: ingrese un numero válido.");
//            ex.printStackTrace();
//            System.out.print(ex.getMessage());
        }
        return e;
    }
    public static String leerTexto(){
        String e = "";
        Scanner sc;
        sc = new Scanner(System.in); // Ingreso de datos del teclado
        e = sc.nextLine();  // Convierte el dato en Entero
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
            System.out.print("  >> Ingrese una opción: ");
            opcion = leerEntero();
            int num1 = 0;
            int num2 = 0;
            if (opcion != 0) {
                System.out.print("Ingrese un numero entero: ");
                num1 = leerEntero();
                System.out.print("Ingrese otro numero entero: ");
                num2 = leerEntero();
                switch ( opcion ){
/*                case 0:
                    System.out.println("Gracias por usar esta triste calculadora. Vuelva pronto");
                    break;*/
                    case 1:
/*                    System.out.print("Ingrese sumado1 entero: ");
                    int num1 = leerEntero();
                    System.out.print("Ingrese sumando2 entero: ");
                    int num2 = leerEntero();*/
                        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + sumar(num1, num2));
                        break;
                    case 2:
/*                    System.out.print("Ingrese minuendo entero: ");
                    int num1 = leerEntero();
                    System.out.print("Ingrese sustraendo entero: ");
                    int num2 = leerEntero();*/
                        System.out.println("La diferencia de " + num1 + " y " + num2 + " es: " + restar(num1, num2));
                        break;
                    case 3:
/*                  System.out.print("Ingrese un numero entero: ");
                    int num1 = leerEntero();
                    System.out.print("Ingrese otro numero entero: ");
                    int num2 = leerEntero(); */
                        System.out.println("El producto de " + num1 + " y " + num2 + " es: " + multiplicar(num1, num2));
                        break;
                    case 4:
/*                  System.out.print("Ingrese un numero entero: ");
                    int num1 = leerEntero();
                    System.out.print("Ingrese otro numero entero: ");
                    int num2 = leerEntero(); */

                        if (num2 == 0){
                            System.out.println("Error: el divisor no puede ser cero (0):");
                            System.out.println("  0- Regresar al menu anterior. ");
                            System.out.println("  1- Inbgresa un nuevo divisor. ");
                            System.out.print("     >> Seleccione una opcion: ");
                            int opcionDivisor = leerEntero();
                            if (opcionDivisor == 0){
                                System.out.println("  Regresando al menu anterior ...");
                            }else{
                                System.out.print("    >> Nuevo divisor: ");
                                num2 = leerEntero();
                                if (num2 == 0){
                                    System.out.println("    Ingresaste cero nuevamente \n Regresando al menu principal...");
                                } else {
                                    System.out.println("El cosiente de " + num1 + " y " + num2 + " es: " + dividir(num1, num2));
                                }
                            }
                        }else{
                            System.out.println("El cosiente de " + num1 + " y " + num2 + " es: " + dividir(num1, num2));
                        }

                        break;
                    case 5:
                        System.out.print("nombre");
                        String nombre = leerTexto();


                            // nombre.compareTo("Vladimir") == 0 >> Retoena un entero
                        if( nombre.equals("Vladimir") ){
                            System.out.println("son iguales");
                        }else{
                            System.out.println("no son iguales");
                        }

                        break;
                    default:
                        System.out.println("Esa opcion no es válida.");
                        break;
                }
            } else {
                System.out.println("Gracias por usar esta triste calculadora. Vuelva pronto");
            }
        } while ( opcion > 0 );
    }
}
