package application;

import java.util.Scanner;

public class Problem2 {

	public static void main(String[] args) {
		// 상품 가격 152,365원을 지불하기 위해 필요한 최소 지폐장수는 아래와 같다.(천원 미만 가격은 할인 됨)
		// 5만원 x 3장
		// 1만원 x 0장
		// 5천원 x 0장
		// 1천원 x 2장
		// 이를 계산 하는 프로그램을 작성하고, 출력 예와 같은 결과를 만드시오.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("가격을 입력해주세요. : ");
		int price = scanner.nextInt();
		scanner.close();
		
		int oman = price / 50000;
		int man = (price - (oman * 50000)) / 10000;
		int ochun = (price - (oman * 50000 + man * 10000)) / 5000;
		int chun = (price - (oman * 50000 + man * 10000 + ochun * 5000)) / 1000;
		
		int discounted = price - (oman * 50000 + man * 10000 + ochun * 5000 + chun * 1000);
		
		int totalcnt = oman + man + ochun + chun;
		
		System.out.printf("5만원 x %d\n", oman);
		System.out.printf("1만원 x %d\n", man);
		System.out.printf("5천원 x %d\n", ochun);
		System.out.printf("1천원 x %d\n", chun);
		System.out.println("===============");
		System.out.printf("총 장수 : %d장\n", totalcnt);
		System.out.printf("금액 : %d\n", price - discounted);
		System.out.printf("할인 : %d\n", discounted);
		
		

	}

}
