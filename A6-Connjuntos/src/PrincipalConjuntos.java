public class PrincipalConjuntos {
    public static void main(String[] args) {
        int [] A = {20,30,40,50};
        int [] B = {32,41,30,40,20};
        int dup = 0;
        /*
        A + B = {2,3,4,5,3,4,5,6,7} >> 3, 4, 5
        A U B = { 2,3,4,5,6,7 }  >> Como calculo este tamaño
         */
        // Recorremos los elementos de A
        for (int i = 0; i < A.length; i++) {
            // System.out.println("A["+i + "] = " + A[i]);
            // Recorremos los elementos de B
            for (int j = 0; j < B.length; j++) {
                // System.out.println("  - B["+j + "] = " + B[j]);
                if ( A[i] == B[j] ){
                    dup++;
                }
            }
        }
        int tamUnion = A.length + B.length - dup;
        System.out.println("Hay "+dup+" duplicado(s).");
        System.out.println("La union tiene "+tamUnion+"elementos");
        // imprimir B

        int [] union = new int[tamUnion];
        for (int i = 0; i < A.length; i++) {
            union[i] = A[i];
            System.out.println(union[i]);
        }
        //int [] A = {20,30,40,50};
        //int [] B = {32,41,30,40,20};
        for (int j = 0; j < union.length; j++) {
            for (int k = 0; k < B.length; k++) {
                if( union[j] != B[k] ){
                    union[j+A.length] = B[k];
                }
            }
        }

        for (int i = 0; i < union.length; i++) {
            System.out.println("union["+i+"] = "+union[i]);
        }
    }
}