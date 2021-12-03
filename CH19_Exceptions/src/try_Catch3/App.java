package try_Catch3;

import java.util.Scanner;

public class App {
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		// 예외를 처리하는 try-Catch문

		int number = getNumber();
		System.out.println("입력한 숫자는 : " + number);
		scanner.close();

	}

	private static int getNumber() { // 숫자를 입력 받아서 return한다.
		int number = 0;
		boolean isNumber = false;

		// 숫자를 입력 할 때 까지 반복
		do {
			System.out.print("숫자를 입력 : ");
			String line = scanner.nextLine();

			try { // 예외가 발생할 수 있는 코드를 적용
				number = Integer.parseInt(line); // 문자열을 정수로 변환 
				// 문자 입력 받아서 변환하는데 숫자 변환해서 int형이 되도 오류 안생기면 밑의 코드로 진행 아니면 catch 코드로 진행
//				System.out.println(number);
//				System.out.println(isNumber);
				isNumber = true; // 숫자 입력 됨
//				System.out.println(isNumber);
				// Integer는 int를 객체형으로 표현한 것
//			Double.parseDouble(line); // 문자열을 실수로 표현
//			Float.parseFloat(line); // 문자열을 실수로 변환
			} catch (NumberFormatException e) { // 예외 발생 시 프로그램 종료가 아니라 여기로 이동
				// Exception 타입은 어떤 예외든 전부 받아들임
				System.out.println("정수로 변환 할 수 없습니다.");
				System.out.println("다시 입력 해 주세요.");
			}
		} while (!isNumber);

//		System.out.println(line);

		return number;
	}

}
