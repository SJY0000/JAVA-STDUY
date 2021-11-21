package Application;

import java.util.Scanner;

public class CheckPassLimit {

	public static void main(String[] args) {
		// 패스워드가 틀리더라도 3번 입력할 수 있는 기회를 준다.
		// 패스워드가 맞으면 '접속 승인'출력하고 반복문을 빠져나옴
		// 패스워드 3회 틀릴시 '접속거부'

		Scanner scanner = new Scanner(System.in);
		final String USER_PASSWORD = "hello";
		

//		for (int i = 0; i < 3; i++) {
//			System.out.print("Enter password > ");
//			String password = scanner.nextLine();
//
//			if (password.equals(USER_PASSWORD)) {
//				System.out.println("접속승인");
//				break;
//			} else {
//				System.out.println("비밀번호가 틀렸습니다.");
//			}
//
//		}
//		scanner.close();
		
	
		int count = 0;
		do {
			count++;
			System.out.print("Enter password > ");
			String password = scanner.nextLine();
			if (password.equals(USER_PASSWORD)) {
				System.out.println("접속승인");
				break;
			}
			System.out.printf("비밀번호를 %d번 틀렸습니다.\n", count);
		}
		while (!(count == 3));
		scanner.close();
	}

}
