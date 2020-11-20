package fileWriterAndFileReader;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;
import java.util.stream.IntStream;

public class FileWriterAndFileReader {

	public static void main(String[] args) {

		String contenido = "";
		int readed = 0;
		
		try {
			FileWriter fw = new FileWriter(
					"C:\\Users\\Mítico\\Desktop\\Java\\Workspace\\FileWriter&FileReader\\Documento_accesible");
			fw.write("Hola mundo");
			fw.close();

		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("El archivo no a podido ser creado/escrito");
		}

		try {
			FileReader fr = new FileReader(
					"C:\\Users\\Mítico\\Desktop\\Java\\Workspace\\FileWriter&FileReader\\Documento_accesible");
			readed = fr.read();
			while (readed != -1) {			
					contenido += (char)readed;
					readed = fr.read();
				}
			fr.close();
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Archivo no encontrado / no accesible");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("No puede imprimirse el contenido del archivo");
		}

		System.out.printf("Contenido del archivo creado:%n" + contenido);

	}

}
