import org.w3c.dom.ls.LSOutput;

import javax.lang.model.type.UnionType;

public class PrincipalConjuntos {

    public static int[] intersectar(int[] a, int[] b){
//        int[] interseccion = new int[a.length + b.length];
        int tamInterseccion = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    tamInterseccion++;
                }
            }
        }

        int[] interseccion = new int[tamInterseccion];

        int cont=0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    interseccion[cont] = a[i]; // b[j]
                    cont++;
                }
            }
        }

        return interseccion;
    }

    // A = { 2,3,4,5 }          length = 4
    // B = { 4,5,8 }            length = 3
    // tamUnion = a.lenght + b.lenght = 4 + 3
    // union = { 2,3,4,5,8 }    lenght = 5 = a.lenght + b.lenght - dup
    // interseccion = { 4,5 }   lenght = 2 = a.lenght + b.lenght - union.length
    //                          lenght = 2 = a.lenght + b.lenght - ( a.lenght + b.lenght - dup )
    //                          lenght = 2 = a.lenght + b.lenght - a.lenght - b.lenght + dup
    //                          lenght = 2 = a.lenght + b.lenght - a.lenght - b.lenght + dup
    //                          lenght = 2 = dup
    public static int[] unir(int[] a, int[] b){
        int dup = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j])
                    dup++;
            }
        }

        int tamUnion = a.length + b.length - dup;
        int[] union = new int[tamUnion];

        // Copiar elmentos de A en union
        for (int i = 0; i < a.length; i++) {
            union[i] = a[i];
        }
        // A = { 2,3,4,5 } ; B = { 4,5,8 } ; union = { 2,3,4,5, 8 }
        // Copiar elementos de B en la union, solo si no estan ya.
        int cont = 0;
        for (int i = 0; i < b.length; i++) {
            if( !existe(b[i], union) ){
                union[a.length + cont] = b[i];
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
        int opcion = 0;
        do {
            opcion = menu();
            switch ( opcion ){
                case 0:
                    scan.escribirLn("Adios ...");
                    break;
                case 1:
                    scan.escribirLn("Vamos a UNIR los conjuntos");
                    mostrarConjunto(nombre1,A);
                    mostrarConjunto(nombre2,B);
                    mostrarConjunto("Union",unir(A,B));
                    break;
                case 2:
                    scan.escribirLn("Vamos a INTERSECTAR los conjuntos");
                    mostrarConjunto(nombre1,A);
                    mostrarConjunto(nombre2,B);
                    mostrarConjunto("Interseccion",intersectar(A,B));
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
                    tam1 = scan.leerEntero("Tamaño de "+nombre1);
                    A = leerConjunto(nombre1,tam1);
                    mostrarConjunto(nombre1,A);

                    tam2 = scan.leerEntero("Tamaño de " + nombre2);
                    B = leerConjunto(nombre2,tam2);
                    mostrarConjunto(nombre2,B);
                    break;
                default:
                    scan.escribirLn("Opcion fuera de rango (0 - 5)");
                    break;
            }
        } while (opcion != 0);
    }
}

