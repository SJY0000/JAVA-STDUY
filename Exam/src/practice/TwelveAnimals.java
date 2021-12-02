package practice;

import java.util.Scanner;

public class TwelveAnimals {

	public static void main(String[] args) {
		// 출생연도에 따른 12간지 동물의 띠를 출력하도록 printAnimal()메소드를 완성하고
		// 출력 예와 같은 결과를 얻으시오.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("출생년도를 입력해주세요. : ");
		printAnimal(scanner.nextInt());
		scanner.close();

	}

	private static void printAnimal(int birthYear) {
		String animal = "";
		switch (birthYear % 12) {
		case 0 : animal = "원숭이"; break;
		case 1 : animal = "닭"; break;
		case 2 : animal = "개"; break;
		case 3 : animal = "돼지"; break;
		case 4 : animal = "쥐"; break;
		case 5 : animal = "소"; break;
		case 6 : animal = "호랑이"; break;
		case 7 : animal = "토끼"; break;
		case 8 : animal = "용"; break;
		case 9 : animal = "뱀"; break;
		case 10 : animal = "말"; break;
		case 11 : animal = "양"; break;
		
		default : animal = "ERROR!"; break;
		
		}
		System.out.printf("%d년 => %s띠\n", birthYear, animal);
		
	}

}
