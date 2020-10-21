package numeroImpares;

import java.util.Scanner;

/* 
 * 14 .- Escribir un programa Java que lea por teclado el valor de un número entero
 *  y positivo n, y escriba en pantalla cuántos número hay entre 1 y n que estén
formados sólo por cifras impares. NOTA? (2n - 1)
*/

public class numerosImpares {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int inputnumber, impar;
		inputnumber = intscanner(scanner, "Introduce el número para mostrar los impares que contiene desde cero");

		impar = 1;
		
		do {
			System.out.print(impar + ", ");
			impar = impar + 2;
			inputnumber = inputnumber - 2;
		} while (inputnumber >= 2);


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
				System.out.println("Debe introducir un número");
			}
		} while (input < 0 || input > Integer.MAX_VALUE);

		return input;
	}

}
