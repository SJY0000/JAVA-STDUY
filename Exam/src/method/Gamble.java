package method;

import java.util.Random;

public class Gamble {

	public static void main(String[] args) {
		// 어떤 게임이 있다. 이 게임은 주사위를 던져 나오는 눈의 수 만큼 달러를 획득한다.
		// 주사위를 총 3번 던져 얻은 달러, 이를 환전한 결과를 출력하시오

		// Math.random() 1과 6사이의 숫자를 반환하는 dice() 메소드를 구현할 것
		// 1달러의 환율은 1082.25108원으로 한다.
		int[] dice = {1, 2, 3, 4, 5, 6}; 
	
		double dollar = 0;
		double change = 1082.25108;
		double choice = 0;
		
		for (int i = 0; i < 3; i++) {
		Random random = new Random();
		choice = dice[random.nextInt(dice.length)];
		dollar = dollar + choice;
		}
		double Won = dollar * change;
		System.out.printf("획득 금액 : $%.2f(%.0f원)", dollar, Won);
		
		 
		
		
		

	}
}