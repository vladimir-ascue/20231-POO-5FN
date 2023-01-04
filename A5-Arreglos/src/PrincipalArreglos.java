public class PrincipalArreglos {
    public static void main(String[] args) throws Exception {
        // Arreglos: Una variable, varios datos
        // Tamaño fijo
        // Un solo tipo de dato en un arreglo

        // Declaracion y asignacion de valores de un arreglo de tamño 6
        // La asignación de valores de un arreglo mediante la notacion con "{ }" solamente se puede usar al momento de su declaración
        String[] profesores; // Declaracion simple
        profesores = new String[5];

        String[] alumnos = {"Vladimir", "Ilich", "Agueda", "Jessica", "Helena", "Massiel"};
        // Los indices de posicion de los valores del arreglo se numeran contando a partir del 0
        // Indices           0           1        2         3          4         5
       
        // Se accede a cada posicion del arreglo usando los indices comprendidos entre 0 y el tamaño-1 del arreglo
        // Para conocer el tamaño de un arreglo podemos usar la propiedad length que devuelve un valor entero
        // indiceMayor = tamaño - 1 || tamaño = indiceMayor + 1

        scan.escribirLinea("Arreglo con los valores iniciales:");
        // Iterator se abrevia con i
        for (int i = 0 ; i < alumnos.length ; i++){
            scan.escribirLinea(" - " + alumnos[i]);
        }

        // Asignacion individual de valores
        // Para nuestro caso:
        //   Tamaño del arreglo 6
        //   Indices 0, 1, 2, 3, 4, 5
        alumnos[0] = "Platon";
        alumnos[1] = "Aristoteles";
        alumnos[2] = "Pitagoras";
        alumnos[3] = "Socrates";
        alumnos[4] = "Descartes";
        alumnos[5] = "Plotino";

        scan.escribirLinea("Arreglo con los valores modificados:");
        // i++ Es el incremento de uno en uno
        for (int i = 0 ; i < alumnos.length ; i++){
            scan.escribirLinea(" - " + alumnos[i]);
        }

        scan.escribirLinea("Cambiaremos los nombres otra vez");
        for(int i = 0; i < alumnos.length; i++){
            scan.escribir("alumnos["+i+"]=");
            alumnos[i] = scan.LeerTexto("");
        }

        for (int i = 0 ; i < alumnos.length ; i++){
            scan.escribirLinea(" - " + alumnos[i]);
        }
        scan.escribirLinea("Respuesta a la pregunta de Ruben");
        scan.escribirLinea("¿Y que hago si quiero incrementar de 2 en 2?");
        // a += b >> a = a + b
        for(int i = 10; i >= 0; i-=2){
            scan.escribirLinea("i = " + i);
        }
    }
}
