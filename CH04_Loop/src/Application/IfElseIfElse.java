package Application;

import java.util.Scanner;

public class IfElseIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 스캐너
		Scanner scanner = new Scanner(System.in);

		// If 조건문
		System.out.print("사과의 갯수는? ");
		int apples = scanner.nextInt();
		System.out.print("바나나의 갯수는? ");
		int bananas = scanner.nextInt();
		scanner.close();// 스캐너 종료(더이상 안쓸 때)

		// if의 조건이 참일 경우에 {}안의 명령문을 실행한다.
		if (apples > bananas) {
			System.out.println("사과가 바나나보다 많음");
		} else if (apples < bananas) { // 또 다른 조건은 else if(조건)을 사용한다. (중복 사용가능)
			System.out.println("바나나가 사과보다 많음");
		} else {// 위의 if문의 조건이 false일 경우
			System.out.println("사과와 바나나의 개수가 같음");
		}
		System.out.println("프로그램 종료");

	}

}
