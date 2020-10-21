package validacionFecha;

import java.util.Scanner;

public class validacionFecha {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int inputday, inputmonth, inputyear, dias;

		inputyear = yearsscanner(scanner, "Introduce el año");
		inputmonth = monthsscanner(scanner, "Introduce el mes");
		dias = SumaDias(inputmonth, inputyear);
		inputday = daysscanner(scanner, dias, "Introduce el día");
		if (inputday > dias) {
			System.out.println("Error de fecha: No hay tantos días en ese mes");
		}

		System.out.println("La fecha es real, a existido o existirá");

	}

	public static int daysscanner(Scanner scanner, int dias, String mensaje) {

		System.out.println(mensaje);

		int input = 0;
		do {
			try {
				input = scanner.nextInt();
			} catch (Exception e) {
				input = -1;
				scanner.next();
			}
			if (input < 0 || input > dias) {
				System.out.println("Error de fecha: El día debe estar comprendido entre 1 y " + dias);
			}
		} while (input < 0 || input > dias);

		return input;
	}

	public static int monthsscanner(Scanner scanner, String mensaje) {

		System.out.println(mensaje);

		int input = 0;
		do {
			try {
				input = scanner.nextInt();
			} catch (Exception e) {
				input = -1;
				scanner.next();
			}
			if (input < 0 || input > 12) {
				System.out.println("Error de fecha: La fecha no pertenece a un mes del año");
			}
		} while (input < 0 || input > 12);

		return input;
	}

	public static int yearsscanner(Scanner scanner, String mensaje) {

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

	public static int SumaDias(int inputmonth, int inputyear) {
		int dias = 0;

		switch (inputmonth) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		case 2:
			if ((inputyear % 4 == 0) || inputyear % 100 == 0) {
				if (inputyear % 400 == 0) {
					dias = 28;
				} else {
					dias = 29;
				}
			} else {
				dias = 28;
			}
			break;
		default:
			System.out.println("Error de fecha: La fecha no pertenece a un mes del año");
		}

		return dias;
	}

}
