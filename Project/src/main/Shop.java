package main;

import java.util.ArrayList;
import java.util.Scanner;

import product.Cloth;
import product.Electronic;
import product.Etc;
import product.EveryThing;
import product.Food;
import product.Funiture;

public class Shop {
	private boolean isRunning = true;
	private ArrayList<User> users = new ArrayList<>();
	private String id;
	private String password;
	Scanner scanner = new Scanner(System.in);
	
	// 물품 배열 공간 만들기
	EveryThing[] electronicProduct = new EveryThing[5];
	EveryThing[] funitureProduct = new EveryThing[5];
	EveryThing[] clothProduct = new EveryThing[5];
	EveryThing[] foodProduct = new EveryThing[5];
	EveryThing[] etcProduct = new EveryThing[5];
	
	// 장바구니
	ArrayList<EveryThing> cart = new ArrayList<>();
	
	
	// 관리자 계정 및 중복확인용 계정 설정
	public Shop() {
		users.add(new User("admin", "1234"));
		users.add(new User("asd", "1234"));
	}

	// 프로그램 실행
	public void run() {
		do {
			display();

		} while (isRunning);
	}

	// 카테고리메뉴화면 출력 및 데이터 입력
	private void Menu() {
		insertEveryThing(); 		// 카테고리 물품데이터 등록	
		
		System.out.println("여기는 메뉴");
		System.out.println("1. 전자제품");
		System.out.println("2. 가구");
		System.out.println("3. 의류");
		System.out.println("4. 식품");
		System.out.println("5. 기타");
		System.out.println("00번 입력시 프로그램이 종료됩니다.");

		String choice = scanner.nextLine();

		switch (choice) {
		case "1": selectProduct(electronicProduct); break;
		case "2": selectProduct(funitureProduct); break;
		case "3": selectProduct(clothProduct); break;
		case "4": selectProduct(foodProduct); break;
		case "5": selectProduct(etcProduct); break;
		case "00": End();
		
		default: System.out.println("잘못된 입력입니다. 다시 입력해주세요."); break;
		}
	}

	// 초기메뉴화면 출력
	public void display() {
		System.out.println("다잡아쇼핑몰");
		System.out.println("============");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("00. 종료");
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
		case "00":
			System.out.println("프로그램을 종료합니다.");
			End();
			break;
		default:
			System.out.print("잘못된 입력입니다. 다시 입력해 주세요 \n\n");
			break;
		}
	}

	// 프로그램 종료문
	private void End() {
		isRunning = false;
	}

	// 회원가입
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

	// 로그인
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

	// 아이디 중복확인
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

	// 비밀번호 2번 체크
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
	
	// 카테고리 물품 데이터
	private void insertEveryThing() {
		electronicProduct[0] = new Electronic("전자제품", "SAMSUNG TV", 1236000, 10);
		electronicProduct[1] = new Electronic("전자제품", "LG 스타일러", 1120000, 8);
		electronicProduct[2] = new Electronic("전자제품", "위니아 세탁기", 890000, 15);
		electronicProduct[3] = new Electronic("전자제품", "바디프렌즈 안마의자", 1080000, 5);
		electronicProduct[4] = new Electronic("전자제품", "SAMSUNG 비스포크", 1546000, 4);
		
		funitureProduct[0] = new Funiture("가구", "동서가구 프리미엄장농", 620000, 12);
		funitureProduct[1] = new Funiture("가구", "동서가구 침대", 220000, 10);
		funitureProduct[2] = new Funiture("가구", "이케아 수납장", 60000, 28);
		funitureProduct[3] = new Funiture("가구", "이케아 책상", 120000, 16);
		funitureProduct[4] = new Funiture("가구", "한샘 리클라이너쇼파", 980000, 3);
		
		clothProduct[0] = new Cloth("의류", "아디다스 체육복(사계절)", 86000, 33);
		clothProduct[1] = new Cloth("의류", "디스커버리 롱패딩", 286000, 26);
		clothProduct[2] = new Cloth("의류", "아디다스 패딩", 186000, 22);
		clothProduct[3] = new Cloth("의류", "반팔티 4+1", 20000, 80);
		clothProduct[4] = new Cloth("의류", "나이키 긴팔티셔츠", 53000, 53);
		
		foodProduct[0] = new Food("식품", "족발 밀키트", 18000, 80);
		foodProduct[1] = new Food("식품", "신선한 샐러드", 4000, 64);
		foodProduct[2] = new Food("식품", "돼지고기 1kg", 4800, 32);
		foodProduct[3] = new Food("식품", "생수 12병", 6000, 932);
		foodProduct[4] = new Food("식품", "진라면 매운맛 5봉", 4000, 894);
		
		etcProduct[0] = new Etc("기타", "핸드폰 케이스", 16000, 56);
		etcProduct[1] = new Etc("기타", "휴지 24롤", 10000, 100);
		etcProduct[2] = new Etc("기타", "물티슈", 1000, 1000);
		etcProduct[3] = new Etc("기타", "AAA건전지", 1400, 890);
		etcProduct[4] = new Etc("기타", "멀티탭", 8000, 400);
	}
	
	// 카테고리별 제품 출력 후 선택한 제품 장바구니 이동
	private void selectProduct(EveryThing[] everything) {
		System.out.println("여기는 " + everything[0].getCategory() + "카테고리 입니다." );
		
		for (int i = 0; i < everything.length; i++) {
			System.out.printf("상품번호 : "+ (i + 1) + ",상품명 : %s, 가격 : %d, 재고 : %d\n", everything[i].getProduct(), everything[i].getPrice(), everything[i].getStock());	
			}
			
		System.out.println("==========================");
		
		while(true) {
			System.out.println("(0번 선택시 장바구니로 이동합니다.)");
			System.out.print("구매하실 상품번호를 입력해주세요 : ");
			
			int select = scanner.nextInt();
			
			if (select == 0) {
				System.out.println("ENTER를 입력하시면 장바구니로 이동합니다.");
				scanner.nextLine();
				cart();
			} else if (select > 0) {
				insertCart(everything[select -1]); 
			} else {
				System.out.println("잘못된 입력입니다. 카테고리 선택창으로 돌아갑니다.");	
				Menu();
			}	
		}
		
	}

	// 장바구니에 넣기
	private void insertCart(EveryThing everything) {
		if (everything.getStock() == 0) {
			System.out.println("죄송합니다. 물품 재고가 전부 소진되었습니다.");
		} else {
			cart.add(everything);
			everything.changeStock();
			
			System.out.printf("상품명 : %s, 가격 : %d원, 남은 재고 : %d 제품이 장바구니에 담겼습니다.\n\n", everything.getProduct(), everything.getPrice(), everything.getStock());
		}
		
	}

	// 선택한 상품들 출력 및 금액계산
	private void cart() {
		int total = 0;
		
		for (int i = 0; i < cart.size(); i++) {
			total += cart.get(i).getPrice();
			System.out.printf("카테고리 : %s, 상품명 : %s, 가격 : %d\n", cart.get(i).getCategory(), cart.get(i).getProduct(), cart.get(i).getPrice());
		}
		System.out.println("==============================================");
		System.out.printf("총 금액은 %d 원입니다.\n", total);
		System.out.println("(n 선택시 카테고리선택창으로 돌아갑니다.) ");
		System.out.print("결제를 진행하시겠습니까? y/n");
		
		String choice = scanner.nextLine();
		
		while(true) {
			switch (choice) {
			case "y": Purchase(); break;
			case "n": Menu(); break;
			
			default: System.out.println("잘못된 입력입니다. 다시 입력해주세요."); break;
			}	
		}
		
		
		
		
		
	}

	private void Purchase() {
		// TODO Auto-generated method stub
		
	}
	
	
}
