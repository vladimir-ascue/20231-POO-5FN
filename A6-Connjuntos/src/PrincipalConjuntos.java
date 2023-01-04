public class PrincipalConjuntos {
    public static int menu(){
        scan.escribirLn("#########       MENU PRINCIPAL      #########");
        scan.escribirLn("######### OPERACIONES CON CONJUNTOS #########");
        scan.escribirLn("0- Salir");
        scan.escribirLn("1- Union");
        scan.escribirLn("2- Interseccion");
        scan.escribirLn("3- Diferencia");
        scan.escribirLn("4- Diferencia Simétrica");
        scan.escribirLn("5- Cambiar conjuntos");
        return scan.leerEntero(">> Ingrese una opcion (0 - 5)");
    }
    public static int[] leerConjunto(String nombre, int tam){
        int[] a = new int[tam];
        for (int i = 0; i < a.length; i++) {
            a[i] = scan.leerEntero(nombre+"["+i+"]");
        }
        return a;
    }

    public static void mostrarConjunto(String nombre, int[] conj){
        scan.escribir(nombre+" = { ");
        for (int i = 0; i < conj.length; i++) {
            if ( i == conj.length-1 )
                scan.escribir(conj[i]+"");
            else
                scan.escribir(conj[i] + ", ");
        }
        scan.escribirLn(" }");
    }
    public static void main(String[] args) {
        scan.escribirLn("######### OPERACIONES CON CONJUNTOS #########");
        String nombre1 = scan.leertexto("Nombre de primer Conjunto");
        int tam1 = scan.leerEntero("Tamaño de "+nombre1);
        int[] A = leerConjunto(nombre1,tam1);
        mostrarConjunto(nombre1,A);

        String nombre2 = scan.leertexto("Nombre de segundo Conjunto");
        int tam2 = scan.leerEntero("Tamaño de "+nombre2);
        int[] B = leerConjunto(nombre2,tam2);
        int opcion = menu();
        switch ( opcion ){
            case 0:
                scan.escribirLn("Adios ...");
                break;
            case 1:
                scan.escribirLn("Vamos a UNIR los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                break;
            case 2:
                scan.escribirLn("Vamos a INTERSECTAR los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                break;
            case 3:
                scan.escribirLn("Vamos a hallar la DIFERENCIA de los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                break;
            case 4:
                scan.escribirLn("Vamos a hallar la DIFERENCIA SIMÉTRICA de los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                break;
            case 5:
                scan.escribirLn("Vamos a CAMBIAR los conjuntos");
                mostrarConjunto(nombre1,A);
                mostrarConjunto(nombre2,B);
                break;
            default:
                scan.escribirLn("Opcion fuera de rango (0 - 5)");
                break;
        }
    }
}