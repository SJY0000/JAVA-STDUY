package main;

import java.util.ArrayList;
import java.util.Scanner;

public class Shop {
	private boolean isRunning = true;
	private ArrayList<User> users = new ArrayList<>();
	private String id;
	private String password;
	Scanner scanner = new Scanner(System.in);

	public Shop() {
		users.add(new User("admin", "1234"));
		users.add(new User("asd", "1234"));
	}

	public void run() {
		do {
			display();

		} while (isRunning);
	}

	private void Menu() {
		System.out.println("여기는 메뉴");
		System.out.println("1. 전자제품");
		System.out.println("2. 가구");
		System.out.println("3. 의류");
		System.out.println("4. 식품");
		System.out.println("5. 기타");

		String choice = scanner.nextLine();

		switch (choice) {
		case "1":

			break;

		default:
			break;
		}
	}

	public void display() {
		System.out.println("다잡아쇼핑몰");
		System.out.println("============");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("0. 종료");
		System.out.println("============");
		System.out.print("무엇을 하실지 선택해주세요. : ");

		String enter = scanner.nextLine();

		switch (enter) {
		case "1":
			Login();
			break;
		case "2":
			Regist();
			break;
		case "0":
			System.out.println("프로그램을 종료합니다.");
			isRunning = false;
			break;
		default:
			System.out.print("잘못된 입력입니다. 다시 입력해 주세요 \n\n");
			break;
		}
	}

	private void End() {
		isRunning = false;
	}

	private void Regist() {
		System.out.println("회원가입을 진행합니다.");
		System.out.println("===================");

		CheckId();
		System.out.println("중복되지 않은 id입니다.");

		CheckPw();

		System.out.println("회원가입을 감사합니다.");
		users.add(new User(id, password));

		System.out.println("Enter를 입력하시면 메뉴로 이동합니다.");

		scanner.nextLine();

		Menu();
	}

	private void Login() {
		int index = 0;
		boolean isExist = true;
		int count = 0;

		while (isExist) {
			System.out.print("id를 입력해주세요.");
			id = scanner.next();
			for (int i = 0; i < users.size(); i++) {
				if (!(id.equals(users.get(i).getId()))) {
				} else if (id.equals(users.get(i).getId())) {
					System.out.println("존재하는 id입니다.");
					index = i;
					isExist = false;
				}
			}
		}
		while (true) {
			System.out.println("password를 입력해주세요.");
			password = scanner.next();
			if (!(password.equals(users.get(index).getPassword()))) {
				System.out.println("잘못된 비밀번호 입니다. 틀린 횟수 " + ++count);
			}else {
				break;
			}
			if (count == 5) {
				System.out.println("비밀번호 5회 오류로 첫 화면으로 돌아갑나디.");	
				System.out.println("Enter를 눌러주세요.");
				
				scanner.nextLine();
				scanner.nextLine();
				display();
				break;
			}

		}

		System.out.println("Enter를 입력하면 메뉴로 이동합니다.");
		scanner.nextLine();
		scanner.nextLine();

		Menu();

	}

	private String CheckId() {
		boolean check = true;

		while (check) {
			System.out.print("등록할 id를 입력해주세요 : ");
			id = scanner.next();
			scanner.nextLine();

			for (int i = 0; i < users.size(); i++) {
				if (id.equals(users.get(i).getId())) {
					System.out.println("중복된 id입니다.");
					CheckId();
				}
			}
			break;
		}

		return id;
	}

	private String CheckPw() {
		while (true) {
			System.out.print("password를 입력해주세요. : ");
			password = scanner.nextLine();

			System.out.print("password를 동일하게 입력해주세요. : ");
			String pwc = scanner.nextLine();

			if (password.trim().isEmpty() || pwc.trim().isEmpty()) {
				System.out.println("password에 공백이 있습니다. 다시 입력해주세요.");
			} else if (!(password.equals(pwc))) {
				System.out.println("password가 다릅니다.");

			} else
				break;

		}
		return password;
	}
}
