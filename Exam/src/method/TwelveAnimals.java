package method;

import java.util.Scanner;

public class TwelveAnimals {

	public static void main(String[] args) {
		// 출생?��?��?�� ?���? 12간�? ?��물의 ?���? 출력?��?���? printAnimal()메소?���? ?��?��?���?
		// 출력 ?��?? 같�? 결과�? ?��?��?��?��.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("출생?��?���? ?��?��?��주세?��. : ");
		printAnimal(scanner.nextInt());
		scanner.close();

	}

	private static void printAnimal(int birthYear) {
		String animal = "";
		switch (birthYear % 12) {
		case 0 : animal = "?��?��?��"; break;
		case 1 : animal = "?��"; break;
		case 2 : animal = "�?"; break;
		case 3 : animal = "?���?"; break;
		case 4 : animal = "�?"; break;
		case 5 : animal = "?��"; break;
		case 6 : animal = "?��?��?��"; break;
		case 7 : animal = "?��?��"; break;
		case 8 : animal = "?��"; break;
		case 9 : animal = "�?"; break;
		case 10 : animal = "�?"; break;
		case 11 : animal = "?��"; break;
		
		default : animal = "ERROR!"; break;
		
		}
		System.out.printf("%d?�� => %s?��\n", birthYear, animal);
		
	}

}
