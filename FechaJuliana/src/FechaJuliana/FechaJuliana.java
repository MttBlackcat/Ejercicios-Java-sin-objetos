package FechaJuliana;

import java.util.Scanner;

public class FechaJuliana {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int option, numdia, año, diasfebrero, fechadia, fechames;
		
		option = scannerS(scanner, "Introduce 1 si quieres convertir una fecha juliana en convencional %nIntroduce 2 si quieres convertir una fecha convencional en fecha juliana");
		
		switch (option) {
		case 1:
	
		numdia = scanner(scanner, "Introduce el día");
		año = yearsscanner(scanner, "Introduce el año");
		
		if ((año % 4 == 0) || año % 100 == 0) {
			if (año % 400 == 0) {
				diasfebrero = 28;
			} else {
				diasfebrero = 29;
			}
		}else {
			diasfebrero = 29;
		}
		
		fechames = 1;
		if (numdia > 31) {
			numdia = numdia - 31;
			fechames++;
		}
		if (numdia > diasfebrero) {
			numdia = numdia - diasfebrero;
			fechames++;
		}
		if (numdia > 31 ) {
			numdia = numdia - 31;
			fechames++;
		}
		if (numdia > 30) {
			numdia = numdia - 30;
			fechames++;
		}
		if (numdia > 31 ) {
			numdia = numdia - 31;
			fechames++;
		}
		if (numdia > 30) { 
			numdia = numdia - 30;
			fechames++;
		}
		if (numdia > 31 ) {
			numdia = numdia - 31;
			fechames++;
		}
		if (numdia > 31 ) {
			numdia = numdia - 31;
			fechames++;
		}
		if (numdia > 30) { 
			numdia = numdia - 30;
			fechames++;
		}
		if (numdia > 31 ) {
			numdia = numdia - 31;
			fechames++;	
		}
		if (numdia > 30) { 
			numdia = numdia - 30;
			fechames++;
		}
	
		fechadia = numdia;
		
		System.out.println("La fecha es: " + fechadia + "/" + fechames + "/" + año);
		break;
		//-------------------------------------------------------------
		case 2:
		int inputday, inputmonth, inputyear, dias;

		inputyear = yearsscanner(scanner, "Introduce el año");
		inputmonth = monthsscanner(scanner, "Introduce el mes");
		dias = SumaDias(inputmonth, inputyear);
		inputday = daysscanner(scanner, dias, "Introduce el día");
		if (inputday > dias) {
			System.out.println("Error de fecha: No hay tantos días en ese mes");
		}
		if ((inputyear % 4 == 0) || inputyear % 100 == 0) {
			if (inputyear % 400 == 0) {
				diasfebrero = 28;
			} else {
				diasfebrero = 29;
			}
		}else {
			diasfebrero = 29;
		}
		
		if (inputmonth > 1) {
			inputday = inputday + 31;
		}
		if (inputmonth > 2) {
			inputday = inputday + diasfebrero;
		}
		if (inputmonth > 3) {
			inputday = inputday + 31;
		}
		if (inputmonth > 4) {
			inputday = inputday + 30;
		}
		if (inputmonth > 5) {
			inputday = inputday + 31;
		}
		if (inputmonth > 6) {
			inputday = inputday + 30;
		}
		if (inputmonth > 7) {
			inputday = inputday + 31;
		}
		if (inputmonth > 8) {
			inputday = inputday + 31;
		}
		if (inputmonth > 9) {
			inputday = inputday + 30;
		}
		if (inputmonth > 10) {
			inputday = inputday + 31;
		}
		if (inputmonth > 11) {
			inputday = inputday + 30;
		}
		
		System.out.println("La fecha juliana es :" + inputday + "/" + inputyear);
break;

default:
	System.out.println("La cifra introducida no es una opción");
		}
		
	}
	
	public static int scannerS(Scanner scanner, String mensaje) {

		System.out.printf(mensaje);

		int input = 0;
		do {
			try {
				input = scanner.nextInt();
			} catch (Exception e) {
				input = -1;
				scanner.next();
			}
			if (input < 0 || input > 2) {
				System.out.println("Debe introducir 1 o 2");
			}
		} while (input < 0 || input > 2);

		return input;
	}
	
	public static int scanner(Scanner scanner, String mensaje) {

		System.out.printf(mensaje);

		int input = 0;
		do {
			try {
				input = scanner.nextInt();
			} catch (Exception e) {
				input = -1;
				scanner.next();
			}
			if (input < 0 || input > 365) {
				System.out.println("Debe introducir un número entre 1 y 365");
			}
		} while (input < 0 || input > 365);

		return input;
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
				System.out.println("Error de fecha: La fecha no pertenece a un meses del año");
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
			dias = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			dias = 30;
			break;
		case 2:
			if ((anio % 4 == 0) || anio % 100 == 0) {
				if (anio % 400 == 0) {
					dias = 28;
				} else {
					dias = 29;
				}
			}
			break;
		default:
			System.out.println("Error de fecha: La fecha no pertenece a un meses del año");
		}

		return dias;
	}

}


