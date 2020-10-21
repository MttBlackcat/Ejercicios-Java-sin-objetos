package transcursoDias;

import java.util.Scanner;

/*12 .- Escribir un programa Java que lea desde el teclado como datos de entrada la fecha
de imposición de un capital en un banco (dia1, mes1, anio1) y la
fecha de retirada del mismo (dia2, mes2, anio2) y, calcule y escriba 
en pantalla el número total de días que dicho capital ha estado depositado en el banco.
  */

public class transcursoDias {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int dia1, dia2, mes1, mes2, anio1, anio2;
		do {
			dia1 = daysscanner(scanner, "Introduce el día del ingreso");
			mes1 = monthsscanner(scanner, "Introduce el mes del ingreso");
			anio1 = yearsscanner(scanner, "Introduce el año del ingreso");
			dia2 = daysscanner(scanner, "Introduce el día de la retirada");
			mes2 = monthsscanner(scanner, "Introduce el mes de la retirada");
			anio2 = yearsscanner(scanner, "Introduce el año de la retirada");
			if (anio2 < anio1) {
				System.out.print("El año de retirada no puede ser menor que el de ingreso");
			}
		} while (anio2 < anio1);

		int difdays;

		if (mes1 == mes2 && anio1 == anio2) {
			difdays = dia2 - dia1;

		} else {
			if (mes1 < mes2 && anio1 == anio2) {
				difdays = SumaDias(mes1, anio1) - dia1;
				mes1++;
				while (mes1 < mes2)
					;
				{
					difdays = difdays + SumaDias(mes1, anio1);
					mes1++;
				}
				difdays = difdays + dia2;
			} else {
				difdays = SumaDias(mes1, anio1) - dia1;
				mes1++;
				while (anio1 < anio2 || mes1 < mes2) {
					if (mes1 > 12) {
						mes1 = 1;
						anio1++;
					} else {
						difdays = difdays + SumaDias(mes1, anio1);
						mes1++;
					}
				}
				difdays = difdays + dia2;

			}
		}
		System.out.print("El capital ha estado depositado " + difdays + " días en el Banco");

	}

	public static int daysscanner(Scanner scanner, String mensaje) {

		System.out.println(mensaje);

		int input = 0;
		do {
			try {
				input = scanner.nextInt();
			} catch (Exception e) {
				input = -1;
				scanner.next();
			}
			if (input < 0 || input > 31) {
				System.out.println("El día debe estar comprendido entre 1 y 31");
			}
		} while (input < 0 || input > 31);

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
				System.out.println("El mes debe estar comprendido entre 1 y 12");
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

	public static int SumaDias(int mes, int anio) {
		int dias = 0;

		switch (mes) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			dias = 30;
			break;
		case 4: case 6: case 9: case 11:
			dias = 30;
			break;
		case 2:
			if ((anio % 4 == 0) || (anio % 400 != 0) || anio % 100 == 0) {
				dias = 29;
			} else {
				dias = 28;
			}
			break;
		default:
			System.out.println("El número del mes debe ser lógico en el calendario");
		}

		return dias;
	}

}
