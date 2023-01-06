public class PrincipalConjuntos {
    // A = { 2,3,7,5,6 } >> tamA = 5
    // B = { 4,5,7 } >> tamB = 3
    // tamUnion = tamA + TamB >>>>>> tamUnion = 8 ???????
    // union = { 2,3,4,5,6,7 } tamUnion = 6

    public static int[] unir(int[] A, int[] B){
        int dup = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {
                if (A[i] == B[j])
                    dup++;
            }
        }
        int[] union = new int [ A.length + B.length - dup ];
        // COPIAR LOS ELEMENTOS DE A EN UNION
        for (int i = 0; i < A.length; i++) {
            union[i] = A[i];
        }
        // COPIAR LOS ELEMENTOS DE B EN UNION AUQ AUN NO ESTAN EN UNION
        int cont = 0;
        for (int i = 0; i < B.length; i++) {
            if (!existe(B[i],union)) {
                union[cont + A.length] = B[i];
                cont++;
            }
        }

        return union;
    }

    public static Boolean existe(int elem, int[] conj){
        Boolean flag = false;
        for (int i = 0; i < conj.length; i++) {
            if(conj[i] == elem)
                flag = true;
        }
        return flag;
    }

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
                int[] union = unir(A, B);
                mostrarConjunto("Union",union);
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