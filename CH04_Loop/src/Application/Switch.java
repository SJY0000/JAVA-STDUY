package Application;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// Switch문
		int option = 0;

		switch (option) {
		// switch문의 option 값이 0일 때
		case 0:
			System.out.println("옵션 0 선택");
			break; // case 하나 마다 break문 필수사용
		case 1:
			System.out.println("옵션 1 선택");
			break; // case 값이 1일 때 실행
		case 10:
			System.out.println("프로그램 종료 ...");
			break; // case 값이 10일 때 실행
		// else와 같음 위의 case에 해당하는 것이 없을경우 실행
		default:
			System.out.println("잘못된 옵션번호");
			break;
		}
		Scanner scanner = new Scanner(System.in);

		System.out.println("\n메뉴");
		System.out.println("===\n");
		System.out.println("1. 프린트 '헬로우'");
		System.out.println("2. 프린트 '안녕 ?'");
		System.out.println("3. 프로그램 종료");

		System.out.print("\n옵션을 선택 > ");

//		if (a == 1) {
//			System.out.println("헬로우");
//		} else if (a == 2) {
//			System.out.println("안녕 ?");
//		} else if (a == 3) {
//			System.out.println("종료합니다 ....");
//		} else if (a == 10000) {
//			System.out.println("이스터 에그를 발견했습니다.");
//		} else {
//			System.out.println("잘못된 입력입니다.");
//		}
		int select = scanner.nextInt();
		scanner.close();
		switch (select) {
		case 1 : System.out.println("헬로우"); break;
		case 2 : System.out.println("안녕 ?"); break;
		case 3 : System.out.println("종료합니다 ..."); break;
		case 10000 : System.out.println("이스터 에그를 발견했습니다."); break;
		default : System.out.println("잘못된 입력입니다."); break;
		}

	}

}
