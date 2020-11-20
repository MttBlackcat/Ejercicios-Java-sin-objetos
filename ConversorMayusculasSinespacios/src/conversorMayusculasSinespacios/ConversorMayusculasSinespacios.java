package conversorMayusculasSinespacios;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ConversorMayusculasSinespacios {

	public static void main(String[] args) {
		
		
		
		
		try (
			FileReader fr = new FileReader(
					"C:\\Users\\Mítico\\Desktop\\Java\\Workspace\\FileWriter&FileReader\\Documento_accesible");
				FileWriter fw = new FileWriter(
						"C:\\Users\\Mítico\\Desktop\\Java\\Workspace\\FileWriter&FileReader\\Documento_accesible2")) {
				
			
			
			int readed;
			String resultado = "";
		
			while ((readed = fr.read()) != -1) {
				
				if (readed >= 97 && readed <= 122) {
					resultado += ((char) (readed - 32));
				} else if (readed != 32){
					resultado += (char) readed;
				} 
				
			}
			
			fw.write(resultado);


			fr.close();

	
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("No puede imprimirse el contenido del archivo");
		}


	}

}
