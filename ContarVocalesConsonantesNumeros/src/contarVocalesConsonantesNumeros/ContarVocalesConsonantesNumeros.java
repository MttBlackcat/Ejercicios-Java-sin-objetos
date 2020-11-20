package contarVocalesConsonantesNumeros;

import java.io.FileReader;
import java.io.IOException;

public class ContarVocalesConsonantesNumeros {

	public static void main(String[] args) {
		int contadorVocales = 0;
		int contadorConsonantes = 0;
		int contadorNumeros = 0;
		int vocales[] = {65, 69, 73, 79, 85};
		boolean esVocal;

		int readed;

		try {
			FileReader fr = new FileReader(
					"C:\\Users\\Mítico\\Desktop\\Java\\Workspace\\FileWriter&FileReader\\Documento_accesible");
		
			while ((readed = fr.read()) != -1) {

				if (readed >= 48 && readed <= 57) {
					contadorNumeros++;

				} else if ((readed >= 65 && readed <= 90) || (readed >= 97 && readed <= 122)) {

					esVocal = false;
					for (int i = 0; i < vocales.length && !esVocal; i++) {
						if (readed == vocales[i] || (readed == (vocales[i]+32))) {
							esVocal = true;
						}
					}

					if (esVocal) {
						contadorVocales++;
					} else {
						contadorConsonantes++;
					}

				}

			}
			fr.close();

	
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("No puede imprimirse el contenido del archivo");
		}

		System.out.printf("Total de número en el documento: " + contadorNumeros + "%n");
		System.out.printf("Total de vocales en el documento: " + contadorVocales + "%n");
		System.out.printf("Total de consonantes en el documento: " + contadorConsonantes + "%n");

	}

}
