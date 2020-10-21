package desgloseMoneda;


import java.util.Scanner;

/*
 5 .- Desglose de Moneda

Realizar un programa en Java (Desglose) que lea por teclado una determinada cantidad de 
dinero en euros y escriba en pantalla el desglose mínimo de
moneda, es decir, debe calcular cuál es la menor cantidad de 
billetes y monedas en las que se puede desglosar esa cantidad.


 */

public class desgloseMoneda {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int input;
		int billete500, billete200, billete100, billete50, billete20, billete10, billete5, euro2, euro1, centimo50,
				centimo20, centimo10, centimo5, centimo2;
		input = cashscanner(scanner, "Introduzca la cantidad a desglosar (Separa los céntimos con una coma)");

		billete500 = resto(input, 50000, "500€");
		billete200 = resto(billete500, 20000, "200€");
		billete100 = resto(billete200, 10000, "100€");
		billete50 = resto(billete100, 5000, "50€"); 
		billete20 = resto(billete50, 2000, "20€");
		billete10 = resto(billete20, 1000, "10€");
		billete5 = resto(billete10, 500, "5€");
		euro2  = resto(billete5, 200, "2€");
		euro1 = resto(euro2, 100, "1€");
		centimo50 = resto(euro1, 50, "50 céntimos");
		centimo20  = resto(centimo50, 20, "20 céntimos");
		centimo10  = resto(centimo20, 10, "10 céntimos");
		centimo5  = resto(centimo10, 5, "5 céntimos");
		centimo2  = resto(centimo5, 2, "2 céntimos");
		resto(centimo2, 1, "1 céntimos");
		
		
		
		
		
		
	/*
	 *  EL CÓDIGO DE DEBAJO ES UNA BASURA QUE NO FUNCIONA POR EL FORMATO DEL PRINT
	 * 
		billete500 = input / 50000;
		int resto500 = input % 50000;
		billete200 = resto500 / 20000;
		int resto200 = resto500 % 20000;
		billete100 = resto200 / 10000;
		int resto100 = resto200 % 10000;
		billete50 = resto100 / 5000;
		int resto50 = resto100 % 5000;
		billete20 = resto50 / 2000;
		int resto20 = resto50 % 2000;
		billete10 = resto20 / 1000;
		int resto10 = resto50 % 1000;
		billete5 = resto10 / 500;
		int resto5 = resto10 % 500;
		euro2 = resto5 / 200;
		int resto2 = resto5 % 200;
		euro1 = resto2 / 100;
		int resto1 = resto2 % 100;
		centimo50 = resto1 / 50;
		int resto50c = resto1 % 50;
		centimo20 = resto50c / 20;
		int resto20c = resto50c % 20;
		centimo10 = resto20c / 10;
		int resto10c = resto20c % 10;
		centimo5 = resto10c / 5;
		int resto5c = resto10c % 5;
		centimo2 = resto5c / 2;
		int resto2c = resto5c % 2;
		centimo1 = resto2c;
		

		System.out.printf(
				"Billetes de 500: " + "%s" + "%n" + "Billetes de 200: " + "%s" + "%n" + "Billetes de 200: " + "%s"
						+ "%n" + "Billetes de 100: " + "%s" + "%n" + "Billetes de 50: " + "%s" + "%n"
						+ "Billetes de 20: " + "%s" + "%n" + "Billetes de 10: " + "%s" + "%n" + "Billetes de 5: " + "%s"
						+ "%n" + "Monedas de 2€: " + "%s" + "%n" + "Monedas de 1€: " + "%s" + "%n"
						+ "Monedas de 50 céntimos: " + "%s" + "%n" + "Monedas de 20 céntimos: " + "%s" + "%n"
						+ "Monedas de 10 céntimos: " + "%s" + "%n" + "Monedas de 5 céntimos: " + "%s" + "%n"
						+ "Monedas de 2 céntimos: " + "%s" + "%n" + "Monedas de 1 céntimos: " + "%s",
				billete500, billete200, billete100, billete50, billete20, billete10, billete5, euro2, euro1, centimo50,
				centimo20, centimo10, centimo5, centimo2, centimo1);
*/
	}
	
	public static int resto (int resto, int divisor, String moneda) {
		
		int cantidad;
		cantidad = resto / divisor;
		resto = resto % divisor;
		
		if (cantidad > 0) {
			System.out.println(cantidad + " de " + moneda);
		}
		
		return resto;
	}

	public static int cashscanner(Scanner scanner, String mensaje) {

		System.out.println(mensaje);

		int input = 0;
		double test = 0;

		do {
			try {
				test = scanner.nextDouble();
			} catch (Exception e) {
				test = -1;
				scanner.next();
			}
			if (test < 0 || test > Double.MAX_VALUE) {
				System.out.println("Debe introducir un número");
			}
		} while (test < 0 || test > Double.MAX_VALUE);

		int output = (int) (test * 100);

		input = output;

		return input;
	}

}
