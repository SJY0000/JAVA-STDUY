package try_Catch;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// 예외를 처리하는 try-Catch문
		Scanner scanner = new Scanner(System.in);

		System.out.print("숫자를 입력 : ");
		String line = scanner.nextLine();
		scanner.close();
//		System.out.println(line);

		int number = 0;
		boolean isNumber = false;

		try { // 예외가 발생할 수 있는 코드를 적용
			number = Integer.parseInt(line); // 문자열을 정수로 변환
			isNumber = true;
			// Integer는 int를 객체형으로 표현한 것
//			Double.parseDouble(line); // 문자열을 실수로 표현
//			Float.parseFloat(line); // 문자열을 실수로 변환
		} catch (NumberFormatException e) { // 예외 발생 시 프로그램 종료가 아니라 여기로 이동
			// Exception 타입은 어떤 예외든 전부 받아들임
			System.out.println("정수로 변환 할 수 없습니다.");
		}
		if (isNumber) {
			System.out.println("입력한 숫자는 : " + number);
		}

	}

}
