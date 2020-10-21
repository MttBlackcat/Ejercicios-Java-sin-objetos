package ejercicioBisiestos;

import java.util.Scanner;

/* 11 .- Escribir un programa Java que lea desde teclado como datos de entrada un n�mero
 *  entero y positivo correspondiente e un a�o y nos indique si es 
bisiesto o no. NOTA: Se sabe que un a�o es bisiesto si es m�ltiplo 
de 4 excepto los a�os m�ltiplos de 4 que, adem�s, son m�ltiplos de 100 pero no de 400
*/
public class ejercicioBisiestos {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int inputyear;
		inputyear = intscanner(scanner, "Introduce el a�o a comprobar");

		if (inputyear % 4 == 0) {
			if (inputyear % 100 == 0) {
				if (inputyear % 400 != 0) {
					System.out.println("El a�o es bisiesto");

				} else {
					System.out.println("El a�o no es bisiesto");
				}
			} else {
				System.out.println("El a�o es bisiesto");
			}

		} else {
			System.out.println("El a�o no es bisiesto");
		}

	}

	public static int intscanner(Scanner scanner, String mensaje) {

		System.out.println(mensaje);

		int input = 0;
		do {
			try {
				input = scanner.nextInt();
			} catch (Exception e) {
				input = -1;
				scanner.next();
			}
			if (input < 0 || input > Integer.MAX_VALUE) {
				System.out.println("Debe introducir un n�mero");
			}
		} while (input < 0 || input > Integer.MAX_VALUE);

		return input;
	}

}
