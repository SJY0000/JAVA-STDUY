package Application;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// Switch문 문자열 입력
		System.out.print("계속 진행하시겠습니까? (y / n) : ");
		String option = scanner.nextLine();

		switch (option) {
		// switch문의 option 값이 0일 때
		case "y":
			System.out.println("계속 진행합니다.");
			break; // case 하나 마다 break문 필수사용
		case "n":
			System.out.println("종료합니다.");
			break; // case 값이 1일 때 실행

		// else와 같음 위의 case에 해당하는 것이 없을경우 실행
		default:
			System.out.println("잘못된 입력입니다.ㅛ");
			break;
		}

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
		case 1:
			System.out.println("헬로우");
			break;
		case 2:
			System.out.println("안녕 ?");
			break;
		case 3:
			System.out.println("종료합니다 ...");
			break;
		case 10000:
			System.out.println("이스터 에그를 발견했습니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}

	}

}
