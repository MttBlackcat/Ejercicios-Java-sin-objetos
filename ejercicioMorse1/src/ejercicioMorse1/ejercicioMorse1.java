package ejercicioMorse1;

import java.util.HashMap;
import java.util.Scanner;

public class ejercicioMorse1 {

	/*
	 * 8 .- Realizar un programa Java que lea por teclado un carácter char y escriba
	 * en pantalla su código Morse o un "*" en caso de que no sea un carácter
	 * valido.
	 * 
	 * A .- B -... C -.-. D -.. E . F ..-. G --. H .... I .. J .--- K -.- L .-.. M
	 * -- N -. O --- P .--. Q --.- R .-. S ... T - U ..- V ...- W .-- X _..- Y -.--
	 * Z --.. 0 ----- 1 .---- 2 ..--- 3 ...-- 4 ....- 5 ..... 6 -.... 7 --... 8
	 * ---.. 9 ----. '.' .-.-.- ',' --..-- Ñ --.--
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char input = charscanner(scanner, "introduce el caracter");
		
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
		
		String exit = map.getOrDefault(input, "*");
		System.out.println(exit);
		
/*
		switch (input) {
		case 'A':
			System.out.print(".-");
			break;
		case 'B':
			System.out.print("-...");
			break;
		case 'C':
			System.out.print("-.-.");
			break;
		case 'D':
			System.out.print("-..");
			break;
		case 'E':
			System.out.print(".");
			break;
		case 'F':
			System.out.print("..-.");
			break;
		case 'G':
			System.out.print("--.");
			break;
		case 'H':
			System.out.print("....");
			break;
		case 'I':
			System.out.print("..");
			break;
		case 'J':
			System.out.print(".---");
			break;
		case 'K':
			System.out.print("-.-");
			break;
		case 'L':
			System.out.print(".-..");
			break;
		case 'M':
			System.out.print("--");
			break;
		case 'N':
			System.out.print("-.");
			break;
		case 'O':
			System.out.print("---");
			break;
		case 'P':
			System.out.print(".--.");
			break;
		case 'Q':
			System.out.print("--.-");
			break;
		case 'R':
			System.out.print(".-.");
			break;
		case 'S':
			System.out.print("...");
			break;
		case 'T':
			System.out.print(".-");
			break;
		case 'U':
			System.out.print("..-");
			break;
		case 'V':
			System.out.print("...-");
			break;
		case 'W':
			System.out.print(".--");
			break;
		case 'X':
			System.out.print("-..-");
			break;
		case 'Y':
			System.out.print("-.--");
			break;
		case 'Z':
			System.out.print("--..");
			break;
		case '0':
			System.out.print("-----");
			break;
		case '1':
			System.out.print(".----");
			break;
		case '2':
			System.out.print("..---");
			break;
		case '3':
			System.out.print("...--");
			break;
		case '4':
			System.out.print("....-");
			break;
		case '5':
			System.out.print(".....");
			break;
		case '6':
			System.out.print("-....");
			break;
		case '7':
			System.out.print("--...");
			break;
		case '8':
			System.out.print("---..");
			break;
		case '9':
			System.out.print("----.");
			break;
		case '.':
			System.out.print(".-.-.-");
			break;
		case ',':
			System.out.print("--..--");
			break;
		case 'Ñ':
			System.out.print("--.--");
			break;
		default:
			System.out.print("*");
			break;
		}
*/
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

		return input;
	}

}
