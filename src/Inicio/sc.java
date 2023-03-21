package Inicio;

import java.util.Scanner;

public class sc {
	public static int getInt(String mensaje) {
		Scanner lector = null;
		Boolean flagEntero = true;
		int entero = 0;
		do {
			try {
				lector = new Scanner(System.in);
				System.out.print(mensaje);
				entero = lector.nextInt();
				flagEntero = false;
			} catch (Exception e) {
				System.out.println("Error: Debe ingresar un entero válido: ");
				flagEntero = true;
			}
		} while (flagEntero);
		return entero;
	}

	public static double getReal(String mensaje) {
		Scanner lector = null;
		Boolean flagReal = true;
		double real = 0;
		do {
			try {
				System.out.print(mensaje);
				lector = new Scanner(System.in);
				real = lector.nextDouble();
				flagReal = false;
			} catch (Exception e) {
				System.out.println("Error: Debe ingresar un valor real: ");
				flagReal = true;
				System.out.println("Intentelo nuevamente... ");
			}
		} while (flagReal);
		return real;
	}

	@SuppressWarnings("resource")
	public static String getText(String mensaje) {
		System.out.print(mensaje);
		Scanner lector = new Scanner(System.in); 
		String texto = lector.nextLine();
		return texto;
	}

	public static void write(String texto) {
		System.out.print(texto);
	}

	public static void writeln(String texto) {
		System.out.println(texto);
	}
}