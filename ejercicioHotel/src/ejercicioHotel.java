import java.util.Scanner;

public class ejercicioHotel {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int kme, kms, recorrido;
		double tarifa = 0, tarifainicial, impuesto;
		double total;

		char vehiculo = charscanner(scanner, "Introduce la letra del tipo de vehículo");
		kme = intscanner(scanner, "Introduce el kilometro de entrada");
		kms = intscanner(scanner, "Introduce el kilometro de salida");
		if (kme <= kms) {
			recorrido = kms - kme;
		} else {
			recorrido = kme - kms;
		}

		switch (vehiculo) {
		case 'C':
			tarifainicial = 1.5;
			impuesto = 0.2;
			tarifa = calculotarifa(recorrido, tarifainicial, impuesto);
			break;
		case 'A':
			tarifainicial = 1.5;
			impuesto = 0.2;
			tarifa = calculotarifa(recorrido, tarifainicial, impuesto);
			break;
		case 'T':
			tarifainicial = 1.5;
			impuesto = 0;
			tarifa = calculotarifa(recorrido, tarifainicial, impuesto);

			break;
		case 'M':
			tarifainicial = 0.75;
			impuesto = 0;
			tarifa = calculotarifa(recorrido, tarifainicial, impuesto);

			break;
		default:
			System.out.println("La letra introducida no es válida");

			break;

		}
		if (tarifa > 12) {
			tarifa = 12;
		}
		total = tarifa + (tarifa * 0.1);
		System.out.printf("Vehiculo: %s%nTarifa: %.2f%nTotal IVA incluido: %.2f", vehiculo, tarifa, total);
		scanner.close();

	}

	public static double calculotarifa(int recorrido, double tarifainicial, double impuesto) {
		double tarifa = 0;
		if (recorrido <= 50) {
			tarifa = tarifainicial + (tarifainicial * impuesto);
			if (recorrido > 50 && recorrido <= 100) {
				tarifa = tarifainicial + 1 + (tarifainicial * impuesto);
				if (recorrido > 100 && recorrido <= 300) {
					tarifa = tarifainicial + 1 + (tarifainicial * impuesto) + ((recorrido - 100) * 0.02);
				} else {
					tarifa = tarifainicial + 1 + (tarifainicial * impuesto) + ((recorrido - 100) * 0.02)
							+ ((recorrido - 300) * 0.01);
				}
			}

		}
		return tarifa;

	}

	public static char charscanner(Scanner scanner, String mensaje) {

		System.out.println(mensaje);
		String entrada;
		entrada = scanner.nextLine();
		int entradalong = entrada.length();
		char input = entrada.charAt(0);

		if (entradalong > 1) {
			System.out.println("Debe introducir tan solo un carazter.");
			System.out.println(mensaje);
			entrada = scanner.nextLine();
		}

		boolean pass;

		do {
			pass = true;

			switch (input) {
			case 'C':
				pass = true;
				break;
			case 'A':
				pass = true;
				break;
			case 'M':
				pass = true;
				break;
			case 'T':
				pass = true;
				break;
			default:
				pass = false;
				System.out.println("El carazter introducido no es válido");
				System.out.println(mensaje);
				entrada = scanner.nextLine();
				input = entrada.charAt(0);

				break;

			}
		} while (pass = false);

		return input;
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
