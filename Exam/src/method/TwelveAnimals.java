package method;

import java.util.Scanner;

public class TwelveAnimals {

	public static void main(String[] args) {
		// μΆμ?°?? ?°λ₯? 12κ°μ? ?λ¬Όμ ? λ₯? μΆλ ₯??λ‘? printAnimal()λ©μ?λ₯? ??±?κ³?
		// μΆλ ₯ ??? κ°μ? κ²°κ³Όλ₯? ?»?Ό??€.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("μΆμ??λ₯? ?? ₯?΄μ£ΌμΈ?. : ");
		printAnimal(scanner.nextInt());
		scanner.close();

	}

	private static void printAnimal(int birthYear) {
		String animal = "";
		switch (birthYear % 12) {
		case 0 : animal = "??­?΄"; break;
		case 1 : animal = "?­"; break;
		case 2 : animal = "κ°?"; break;
		case 3 : animal = "?Όμ§?"; break;
		case 4 : animal = "μ₯?"; break;
		case 5 : animal = "?"; break;
		case 6 : animal = "?Έ??΄"; break;
		case 7 : animal = "? ?Ό"; break;
		case 8 : animal = "?©"; break;
		case 9 : animal = "λ±?"; break;
		case 10 : animal = "λ§?"; break;
		case 11 : animal = "?"; break;
		
		default : animal = "ERROR!"; break;
		
		}
		System.out.printf("%d? => %s? \n", birthYear, animal);
		
	}

}
