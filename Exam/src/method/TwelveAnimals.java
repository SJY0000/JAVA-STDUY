package method;

import java.util.Scanner;

public class TwelveAnimals {

	public static void main(String[] args) {
		// Ï∂úÏÉù?ó∞?èÑ?óê ?î∞Î•? 12Í∞ÑÏ? ?èôÎ¨ºÏùò ?ù†Î•? Ï∂úÎ†•?ïò?èÑÎ°? printAnimal()Î©îÏÜå?ìúÎ•? ?ôÑ?Ñ±?ïòÍ≥?
		// Ï∂úÎ†• ?òà?? Í∞ôÏ? Í≤∞Í≥ºÎ•? ?ñª?úº?ãú?ò§.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("Ï∂úÏÉù?ÖÑ?èÑÎ•? ?ûÖ?†•?ï¥Ï£ºÏÑ∏?öî. : ");
		printAnimal(scanner.nextInt());
		scanner.close();

	}

	private static void printAnimal(int birthYear) {
		String animal = "";
		switch (birthYear % 12) {
		case 0 : animal = "?õê?à≠?ù¥"; break;
		case 1 : animal = "?ã≠"; break;
		case 2 : animal = "Í∞?"; break;
		case 3 : animal = "?èºÏß?"; break;
		case 4 : animal = "Ï•?"; break;
		case 5 : animal = "?Üå"; break;
		case 6 : animal = "?ò∏?ûë?ù¥"; break;
		case 7 : animal = "?Ü†?Åº"; break;
		case 8 : animal = "?ö©"; break;
		case 9 : animal = "Î±?"; break;
		case 10 : animal = "Îß?"; break;
		case 11 : animal = "?ñë"; break;
		
		default : animal = "ERROR!"; break;
		
		}
		System.out.printf("%d?ÖÑ => %s?ù†\n", birthYear, animal);
		
	}

}
