import java.util.Scanner;

public class scan {
	public static void escribir(String texto){
		System.out.print(texto);
	}
	public static void escribirLn(String texto){
		System.out.println(texto);
	}

	/* Ejemplito de commit desde la red de khipu */

	public static int leerEntero(String mensaje){
		int entero = 0;
		Boolean flag = true;
		Scanner teclado;
		do {
			escribir("\t"+mensaje+": ");
			teclado = new Scanner(System.in);
			try{
				entero = teclado.nextInt();
				flag = false;
			}catch(Exception e){
				escribirLn("Error: Ese no es un entero válido.");
				escribirLn("Intentalo nuevamente el proximo año.");
			}
		}while (flag);
		return entero;
	}

	public static double leerDecimal(String mensaje){
		double decimal = 0;
		Boolean flag = true;
		Scanner teclado;
		do {
			escribir("\t"+mensaje+": ");
			teclado = new Scanner(System.in);
			try{
				decimal = teclado.nextDouble();
				flag = false;
			}catch(Exception e){
				escribirLn("Error: Ese no es un entero válido.");
				escribirLn("Intentalo nuevamente el proximo año.");
			}
		}while (flag);
		return decimal;
	}

	public static String leertexto(String mensaje){
		String texto = "";
		Scanner teclado;

		escribir("\t"+mensaje+": ");
		teclado = new Scanner(System.in);

		texto = teclado.nextLine();
		return texto;
	}
}