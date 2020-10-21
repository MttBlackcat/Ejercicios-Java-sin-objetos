package calculoFactorial;

import java.util.Scanner;

/* 13 .- Escribir un programa Java que lea por teclado el valor de un número entero y 
 * positivo n,
y escriba en pantalla el valor correspondiente a su factorial.
Se puede hacer con buble o con funcion recursiva.
NOTA: se sabe que el factorial de un número es:
n! = n * (n-1)*(n-2)* [...] *2*1
n! = n*(n-1)
*/

public class calculoFactorial {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int inputnumber, factorial;
		inputnumber = intscanner(scanner, "Introduce el número para calcular su factorial");

		factorial = inputnumber;

		do {
			factorial = factorial * (inputnumber - 1);
			inputnumber--;
		} while (inputnumber >= 2);

		System.out.println("El factorial del número introducido es: " + factorial);

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
