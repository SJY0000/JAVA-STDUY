package Application;

import java.util.Scanner;

public class Problem4 {

	public static void main(String[] args) {
		// 당신의 지갑에는 만원권 3장, 오천원권 4장, 천원권 7장이 있다. 지폐의 총합을 구하시오.
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("만원권은 ? ");
		int man = scanner.nextInt();
		System.out.print("오천원권은 ? ");
		int ocheon = scanner.nextInt();
		System.out.print("천원권은 ? ");
		int cheon =  scanner.nextInt();
		scanner.close();
		
		int total = (man * 10000) + (ocheon * 5000) + (cheon * 1000);
		
		System.out.println("내 전재산은 ? " + total + "원");
		

	}

}
