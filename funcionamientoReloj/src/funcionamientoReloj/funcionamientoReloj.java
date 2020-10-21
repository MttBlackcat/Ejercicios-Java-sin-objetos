package funcionamientoReloj;

import java.util.Scanner;

/*1 .- Simulación del funcionamiento de un reloj
Realizar un programa en Java (Hora) que lea por teclado los datos de un determinado momento 
(hora, minuto, segundo) y, nos calcule y escriba en pantalla los
datos transcurrido un segundo. Ejemplo: Introduces 23/59/59 Imprime 00:00:00
*/

public class funcionamientoReloj {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		int hour, minute, second;
		
		hour = hourscan(scanner, "Introduce la hora:");
		minute = hexascan(scanner, "Introduce el minuto");
		second = hexascan(scanner, "Introduce el segundo");
		
		second++;
		while (second == 60) {
			second = 0;
			minute++;			
		}
		while (minute == 60) {
			minute = 0;
			hour++;			
		}
		while (hour == 24) {
			hour = 0;
		}
		
		System.out.println(hour+":"+minute+":"+second);

	}
	
	public static int hexascan(Scanner scanner, String mensaje) {

		System.out.println(mensaje);

		int input = 0;
		do {
			try {
				input = scanner.nextInt();
			} catch (Exception e) {
				input = -1;
				scanner.next();
			}
			if (input < 0 || input > 59) {
				System.out.println("Debe introducir un número entre 0 y 59");
			}
		} while (input < 0 || input > 59);

		return input;
	}
	
	public static int hourscan(Scanner scanner, String mensaje) {

		System.out.println(mensaje);

		int input = 0;
		do {
			try {
				input = scanner.nextInt();
			} catch (Exception e) {
				input = -1;
				scanner.next();
			}
			if (input < 0 || input > 23) {
				System.out.println("Debe introducir un número entre 0 y 24");
			}
		} while (input < 0 || input > 23);

		return input;
	}

}
