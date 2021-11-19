package Application;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// do while은 처음 한번은 조건과 상관없이 실행됨
		// while의 조건 값이 true이면 반복실행 false면 종료
		/*
		int count = 0;

		System.out.println("do while 반복문");

		do {
			System.out.println("카운트 : " + count);
		} while (count++ < 5);
		*/
		final String USER_PASSWORD = "hello";
		Scanner scanner = new Scanner(System.in);
		String password = ""; // 문자열 선언과 초기값을 공백(null)
		do {
			System.out.print("비밀번호를 입력 > ");
			password = scanner.nextLine(); 
		}
		while (!password.equals(USER_PASSWORD)); // !true는 false이고 !false는 true
		scanner.close();
		System.out.println("접속 승인");
	
	}

}
