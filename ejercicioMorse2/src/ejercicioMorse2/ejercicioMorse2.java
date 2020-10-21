package ejercicioMorse2;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicioMorse2 {

	/*
	 * 9 .- Escribir un programa Java que lea por teclado por teclado una cadena de
	 * carazteres (String) con una palabra y escriba en la pantalla su código morse
	 * (Separando cada letra por un espacio blanco)
	 */

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input = Stringscanner(scanner, "Introduce la palabra");
		int inputlenght = input.length();
		
		HashMap<Character, String> map = new HashMap<>();
		map.put('A', ".-");
		map.put('B', "-...");
		map.put('C', "-.-.");
		map.put('D', "-..");
		map.put('E', ".");
		map.put('F', "..-.");
		map.put('G', "--.");
		map.put('H', "....");
		map.put('I', "..");
		map.put('J', ".---");
		map.put('K', "--");
		map.put('L', "-.");
		map.put('M', "--");
		map.put('N', "-.");
		map.put('O', "---");
		map.put('P', ".--.");
		map.put('Q', "--.-");
		map.put('R', ".-.");
		map.put('S', "...");
		map.put('T', "-");
		map.put('U', "..-");
		map.put('V', "...-");
		map.put('W', ".--");
		map.put('X', "-..-");
		map.put('Y', "-.--");
		map.put('Z', "--..");
		map.put('0', "-----");
		map.put('1', ".----");
		map.put('2', "..---");
		map.put('3', "...--");
		map.put('4', "....-");
		map.put('5', ".....");
		map.put('6', "-....");
		map.put('7', "--...");
		map.put('8', "---..");
		map.put('9', "----.");
		map.put('.', ".-.-.-");
		map.put(',', "--..--");
		map.put('Ñ', "--.--");
		map.put(' ', " ");
		map.getOrDefault(input, "*");
		
		int position = 0;
		char charposition;
	
		do {
			charposition = input.charAt(position);
			String exit = map.getOrDefault(charposition, "*");
					System.out.print(exit + " ");
					position ++;
			
		} while (position != inputlenght);
		
	

	}

	public static String Stringscanner(Scanner scanner, String mensaje) {

		System.out.println(mensaje);
		String input = scanner.nextLine();
		return input;
	}

}
