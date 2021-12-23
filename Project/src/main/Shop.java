package main;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import product.Cloth;
import product.Electronic;
import product.Etc;
import product.EveryThing;
import product.Food;
import product.Funiture;

public class Shop {
	private boolean Start = true;					// 프로그램 시작
	private ArrayList<User> users = new ArrayList<>(); // 계정정보를 저장하는 배열
	int[] lucky = new int[101];					// 행운의 번호 저장 배열
	private String id;				// ID
	private String password;		// PASSWORD
	private int Count = 0;			// 수량체크
	private int number = 0;			// try catch문에 사용
	private int total = 0;			// 총 구매한 금액

	Scanner scanner = new Scanner(System.in);
	Random random = new Random();
	
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
		users.add(new User("admin", "1234")); // 관리자 계정
		users.add(new User("asd", "1234")); // 중복확인용 계정
	}

	// 프로그램 실행
	public void run() {
		do {
			insertEveryThing(); 
			display();
		} while (Start);
	}

	// 초기메뉴화면 출력
	public void display() {
		System.out.println("    다판다쇼핑몰");
		System.out.println("   ==========");
		System.out.println("  ‖ 1. 로그인  ‖");
		System.out.println(" ‖  2. 회원가입  ‖");
		System.out.println("‖  00. 종료      ‖");
		System.out.println("=================");
		System.out.print("무엇을 하실지 선택해주세요. : ");
		
		String enter = scanner.nextLine();
		
		try {
			number = Integer.parseInt(enter);
		} catch (NumberFormatException e) {
			System.out.println("\n숫자만 입력해주세요. \n");
			System.out.println("ENTER를 누르시면 이전페이지로 이동합니다.");
			
			scanner.nextLine();
			
			display();
		}
		switch (number) {
		case 1: Login(); break;
		case 2: Regist(); break;
		case 00: System.out.println("프로그램을 종료합니다."); 
				End(); break;
		default:
			System.out.print("\n잘못된 입력입니다. 다시 입력해 주세요 \n\n"); break;
		}
	}
	
	// 카테고리메뉴화면 출력 및 데이터 입력
	private void Menu() {
		System.out.println("-----메뉴-----");
		System.out.println("1. 전자제품");
		System.out.println("2. 가구");
		System.out.println("3. 의류");
		System.out.println("4. 식품");
		System.out.println("5. 기타");
		System.out.println("9. 장바구니");
		System.out.println("============================");
		System.out.println("00번 입력시 프로그램이 종료됩니다.");
		System.out.println("============================");
		
		System.out.print("메뉴의 번호를 입력해주세요 : ");
		String choice = scanner.nextLine();
		try {
			number = Integer.parseInt(choice);
		} catch (NumberFormatException e) {
			System.out.println("\n숫자만 입력해주세요. \n");
			Menu();
		}

		switch (number) {
		case 1: selectProduct(electronicProduct); break;
		case 2: selectProduct(funitureProduct); break;
		case 3: selectProduct(clothProduct); break;
		case 4: selectProduct(foodProduct); break;
		case 5: selectProduct(etcProduct); break;
		case 9: cart(); break;
		case 00: End(); break;
		
		default: System.out.println("\n잘못된 입력입니다. 다시 입력해주세요.\n"); 
					Menu(); break;
		}
	}


	// 프로그램 종료문
	private void End() {
		System.exit(0);
	}

	// 회원가입
	private void Regist() {
		System.out.println("\n회원가입을 진행합니다.");
		System.out.println("===================");

		CheckId();
		System.out.println("중복되지 않은 id입니다.");

		CheckPw();

		System.out.println("회원가입을 감사합니다.");
		users.add(new User(id, password));

		System.out.println("Enter를 입력하시면 로그인창으로 이동합니다.");

		scanner.nextLine();

		Login();
	}

	// 로그인
	private void Login() {
		int index = 0;
		boolean isExist = true;
		int count = 0;

		while (isExist) {
			System.out.print("Id : ");
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
			System.out.print("Password : ");
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
				display(); break;
			}
		}
		if (id.equals(users.get(0).getId())) {
			System.out.println("\n관리자 계정으로 접속하셨습니다.");
			System.out.println("ENTER를 누르시면 관리모드로 이동합니다.");
			scanner.nextLine();
			scanner.nextLine();
			controll();
		}		
		System.out.println("로그인 성공!\n");
		System.out.println("Enter를 입력하면 메뉴로 이동합니다.");
		
		scanner.nextLine();
		scanner.nextLine();

		Menu();
	}
	
	// 관리자 계정으로 로그인시
	private void controll() {
		System.out.println("---관리모드선택---");
		System.out.println("1. 유저관리모드");
		System.out.println("2. 상품관리모드");
		System.out.println("0. 첫 화면으로 돌아가기");
		System.out.println("======================");
		System.out.print("무엇을 하실지 입력해주세요 : ");
		
		String choice = scanner.nextLine();
		
		
		try {
			number = Integer.parseInt(choice);
		} catch (NumberFormatException e) {
			System.out.println("\n숫자만 입력해주세요.");
			System.out.println("ENTER를 누르시면 이전페이지로 이동합니다.");
			
			scanner.nextLine();
			
			controll();
		}
		
		switch (number) {
		case 0: display(); break;
		case 1: userManage(); break;
		case 2: ProductManage(); break;
		default: System.out.println("잘못입력하셨습니다."); 
					controll(); break;
		}
		
	}

	// 상품관리모드에서 선택하는 메소드
	private void ProductManage() {
		System.out.println("----상품 관리모드----");
		System.out.println("==========================");
		System.out.println("1. 가격 및 재고 수정");
		System.out.println("2. 판매 현황");
		System.out.println("0. 이전페이지로 이동하기");
		System.out.println("==========================");
		System.out.print("하실 업무를 선택해주세요 : ");
		
		String choice = scanner.nextLine();
		
		try {
			number = Integer.parseInt(choice);
		} catch (NumberFormatException e) {
			System.out.println("\n숫자만 입력해주세요.");
			System.out.println("ENTER를 누르시면 이전페이지로 이동합니다.");
			
			scanner.nextLine();
			
			ProductManage();
		}
		switch (number) {
		case 1 : change(); break;
		case 2 : saleStatus(); break;
		case 0 : controll(); break;
		default: System.out.println("잘못된 입력을 하셨습니다."); 
					ProductManage(); break;
		} 
	}

	// 카테고리 별 상품들을 수정하기위해서 선택하는 메소드
	private void change() {		
		System.out.println("========가격 및 재고 수정========");
		System.out.println("1. 전자제품");
		System.out.println("2. 가구");
		System.out.println("3. 의류");
		System.out.println("4. 식품");
		System.out.println("5. 기타");
		System.out.println("0. 이전페이지로 돌아가기");
		System.out.println("====================");
		System.out.print("수정할 카테고리를 선택해주세요 : ");
		
		String choice = scanner.nextLine();
		
		try {
			number = Integer.parseInt(choice);
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력해주세요.");
			
			System.out.println("Enter를 입력하시면 이전페이지로 이동합니다.");
			
			scanner.nextLine();
			
			change();
		}
		
		switch (number) {
		case 1 : changeProduct(electronicProduct); break;
		case 2 : changeProduct(funitureProduct); break;
		case 3 : changeProduct(clothProduct); break;
		case 4 : changeProduct(foodProduct); break;
		case 5 : changeProduct(etcProduct); break;
		case 0 : ProductManage(); break;
		default: System.out.println("잘못된 입력입니다. 다시 입력해주세요."); break;
		}
	}

	// 판매된 상품들에 대한 정보가 있는 메소드
	private void saleStatus() {
		int total = 0;
		
		System.out.println("-------현재 판매 현황-------");
		for (int i = 0; i < cart.size(); i++) {
			System.out.printf("카테고리 : %s, 상품명 : %s, 가격 : %d , 남은재고 : %d \n", cart.get(i).getCategory(), cart.get(i).getProduct(), cart.get(i).getPrice(), cart.get(i).getStock());
			total += cart.get(i).getPrice();
		}
		System.out.println("=========================================================================================");
		System.out.printf("총 판매 수량은 : %d개, 판매 된 총 금액은 : %d \n\n", Count, total);
		
		System.out.println("Enter를 누르시면 이전페이지로 돌아갑니다.");
		
		scanner.nextLine();
		
		ProductManage();
		
	}

	// 선택된 카테고리의 상품의 가격 및 재고를 수정할 수 있는 메소드
	private void changeProduct(EveryThing[] everything) {
		int price;
		int stock;
		int check = 0;
		String index;
		String choice;
		
		System.out.println(everything[0].getCategory() +" 카테고리를 선택하셨습니다. \n");
				
		for (int i = 0; i < everything.length; i++) {
					System.out.printf("상품번호 : "+ (i + 1) + ", 상품명 : %s, 가격 : %d, 재고 : %d\n", everything[i].getProduct(), everything[i].getPrice(), everything[i].getStock());	
		}
		System.out.println("==============================================================================================================");
		System.out.print("수정할 상품번호를 입력해주세요 : ");
		index = scanner.nextLine();
		
		try {
			check = Integer.parseInt(index);
		} catch (NumberFormatException e) {
			System.out.println("\n상품번호를 제대로 입력해주세요.");
			System.out.println("ENTER를 입력하시면 이전페이지로 이동합니다.");
			
			scanner.nextLine();
			
			changeProduct(everything);
		}
				
		System.out.println("1. 가격, 2. 재고");
		System.out.print(" 수정할 부분을 선택해주세요 : ");
		choice = scanner.nextLine();
		
		try {
			number = Integer.parseInt(choice);
		} catch (NumberFormatException e) {
			System.out.println("\n숫자만 입력해주세요.");
			System.out.println("ENTER를 입력하시면 이전페이지로 이동합니다.");
			
			scanner.nextLine();
			
			changeProduct(everything);
		}
				
		if (number == 1) {
			System.out.print("수정할 가격을 입력해주세요 : ");
			price = scanner.nextInt();
			scanner.nextLine();
			everything[check -1].setPrice(price); 
					
			} else if (number == 2) {
					System.out.print("수정할 재고를 입력해주세요 : ");
					stock = scanner.nextInt();
					scanner.nextLine();
					everything[check -1].setStock(stock); 
				} else {
						System.out.println("\n잘못된 입력입니다. 다시 입력해주세요.\n");
						System.out.println("ENTER를 입력하시면 이전페이지로 이동합니다.");
						
						scanner.nextLine();
						
						changeProduct(everything); 
				}
	
	}
	// 가입한 회원들의 대한 정보와 유저삭제를 할 수 있는 메소드
	private void userManage() {
		
		
		for (int i = 0; i < users.size(); i++) {
			String pw = replace(users.get(i).getPassword());
			System.out.printf("UserNumber : %d, ID = %s, PassWord = %s, 가입한 날짜 : %s \n", users.get(i).getNumber(), users.get(i).getId(), pw, users.get(i).getDate());
			total++;
		}
		System.out.println("==========================================================================");
		System.out.printf("회원 수 : %d \n", total);
		
		System.out.println("0. 이전페이지");
		System.out.println("1. 유저삭제");
		System.out.println("=============");
		System.out.print("무엇을 하시겠습니까? : ");
		
		String choice = scanner.nextLine();
		
		try {
			number = Integer.parseInt(choice);
		} catch (NumberFormatException e) {
			System.out.println("\n숫자를 입력해주세요.");
			
			System.out.println("Enter를 입력하시면 이전페이지로 이동합니다.");
			
			scanner.nextLine();
			
			userManage();
		}
		
		switch (number) {
			case 0 : System.out.println("ENTER를 입력하시면 이전페이지로 돌아갑니다.");
				
				 scanner.nextLine();
				
				 controll(); break;
			case 1 : System.out.print("삭제하실 UserNumber를 입력해주세요 : ");
					String index = scanner.nextLine();
					try {
						number = Integer.parseInt(index);
					} catch (NumberFormatException e) {
						System.out.println("숫자만 입력해주세요.");
						System.out.println("ENTER를 누시면 이전페이지로 이동합니다.");
					
						scanner.nextLine();
					
						controll();
					}
					if (number == 1) {
						System.out.println("\n관리자 계정은 삭제하실수 없습니다.");
						System.out.println("관리모드 선택창으로 돌아갑니다. \n");
				
						controll();
					}
					users.remove(number-1).setCount(number-1);;		// 삭제된 User넘버 앞으로 떙기기
				
					System.out.println("삭제완료!");
					System.out.println("ENTER를 누르면 이전페이지로 돌아갑니다.");
				
					scanner.nextLine();
				
					userManage(); break;
				default: System.out.println("잘못된 입력입니다. 다시 입력해주세요."); 
					userManage(); break;
		}	
	}
	

	// 비밀번호 *로 대체하기
	private String replace(String password) {
		int pwd = password.length(); 
		String returnpwd = "";
		
		for (int i = 0; i < pwd; i++) {
			returnpwd += "*";
		}
		return returnpwd;
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
			
			String select = scanner.nextLine();
			try {
				number = Integer.parseInt(select);
			} catch (NumberFormatException e) {
				System.out.println("숫자만 입력해주세요.");
			}		

			if (number == 0) { cart();
			} else if (number > 0) {
				try {
					insertCart(everything[number-1]); 				
				} catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("\n없는 상품번호 입니다.\n");
					System.out.println("ENTER를 입력하시면 이전페이지로 돌아갑니다.");
					
					scanner.nextLine();
					
					selectProduct(everything);
				}
			} else {
				System.out.println("잘못된 입력입니다.");
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
			Count++;
			
			System.out.printf("상품명 : %s, 가격 : %d원, 남은 재고 : %d 제품이 장바구니에 담겼습니다.\n\n", everything.getProduct(), everything.getPrice(), everything.getStock());
		}
		
	}

	// 선택한 상품들 출력 및 금액계산
	private void cart() {
		System.out.println("===================장바구니에 담긴 상품===================");
		for (int i = 0; i < cart.size(); i++) {
			total += cart.get(i).getPrice();
			System.out.printf("카테고리 : %s, 상품명 : %s, 가격 : %d\n", cart.get(i).getCategory(), cart.get(i).getProduct(), cart.get(i).getPrice());
		}
		System.out.println("====================================================");
		System.out.printf("총 금액은 %d 원입니다.\n\n", total);
		System.out.println("50이하, 50 ~ 200만원, 200만원 초과 구매시 행운의 번호 당첨 확률이 쉬워집니다.");
		System.out.println("현재 확률 " + luckylevel(total));
		System.out.println("(n 선택시 카테고리 선택창으로 돌아갑니다.)");
		System.out.print("결제를 진행하시겠습니까? y/n ");
		
		String choice = scanner.nextLine();
		
		switch (choice) {
			case "y": Purchase(total); break;
			case "n": Menu(); break;
			
			default: System.out.println("잘못된 입력입니다. 다시 입력해주세요. \n"); 
					cart();	break;
			}	
	}


	// 장바구니에 담긴 상품들을 구매하는 메소드
	private void Purchase(int total) {
		System.out.println(" =================================");
		System.out.printf("★☆총 액 %d원 입니다. 결제하시겠습니까?☆★\n", total);
		System.out.println(" =================================");
		System.out.println("0. 결제취소");
		System.out.println("1. 결제");
		System.out.print("무엇을 하실지 입력해주세요 : ");
		
		String recipe = scanner.nextLine();
		
		try {
			number = Integer.parseInt(recipe);
		} catch (NumberFormatException e) {
			System.out.println("숫자만 입력해주세요. \n");
			Purchase(total);
		}
		
		switch (number) {
			case 0 : System.out.println("카테고리 선택 메뉴로 돌아갑니다. ENTER를 입력해주세요.");
					
					scanner.nextLine();
					
					Menu(); break;
			
			case 1 : System.out.println("\n😍😍 구매해주셔서 감사합니다. 😍😍");
					 
					 lucky();
			
					 System.out.println("============================================================");
					 System.out.println("0. 프로그램 종료");
			 		 System.out.println("문자 혹은 다른 숫자 입력 시 첫 화면으로 돌아갑니다.(자동으로 로그아웃 됩니다.)");
			 		 System.out.println("============================================================");
			 		 System.out.print("무엇을 하실지 입력해주세요 : ");
			 		 
			 		 scanner.nextLine();
			 		 String choice = scanner.nextLine();
			 		 
			 		 try { 
						number = Integer.parseInt(choice);
					} catch (NumberFormatException e) {
						System.out.println("ENTER를 입력하시면 첫 화면으로 돌아갑니다.");
						scanner.nextLine();
						
						display();
						
					}
			 		 
			 		 if (number == 0) { 
			 			 System.out.println("프로그램이 종료됩니다.");
			 		 } else {
			 			 System.out.println("ENTER를 입력하시면 첫 화면으로 돌아갑니다.");
			 			 scanner.nextLine();
			 			 
			 			 display();
			 		 }
			 		 

			default: System.out.println("잘못된 입력하셨습니다. 다시 입력해주세요.\n"); 
						System.out.println("ENTER를 입력하시면 이전페이지로 돌아갑니다.");
						scanner.nextLine();
			
						Purchase(total); break;
			
			}	
	}
	// 구매 금액에 따른 행운의 번호 추첨
	private void lucky() {	 
		 int select = 0;
		 int luckyNumber = 0;
		 int count = 0;
		 boolean isRunning = true;
		if (luckylevel(total).equals("1%")) {
			count = 100;
			luckyNumber = random.nextInt(count);  // 100까지 랜덤
			System.out.println("행운의 번호 1 ~ 100 사이의 숫자를 입력해주세요.");
		} else if (luckylevel(total).equals("5%")) {
			count = 50;
			luckyNumber = random.nextInt(count);  // 50까지 랜덤
			System.out.println("행운의 번호 1 ~ 50 사이의 숫자를 입력해주세요.");
		} else if (luckylevel(total).equals("10%")) {
			count = 10;
			luckyNumber = random.nextInt(10);	// 10까지 랜덤
			System.out.println("행운의번호 1 ~ 10 사이의 숫자를 입력해주세요.");
		}
		
		while(isRunning) {
			try {
				System.out.println("행운의 번호 " + luckyNumber);		// 행운의 번호
				System.out.print("행운의 번호를 입력해 주세요!! : "); 
				
				String selectLucky = scanner.nextLine();
				
				System.out.println("");
				
				select = Integer.parseInt(selectLucky);
				
				if (select == 0) {
					System.out.println("없는 번호입니다. 다시 입력해주세요");
				} else if (select == luckyNumber) {
					System.out.println("🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊🎊");
					System.out.println("축하드립니다. 행운의 번호에 당첨되셨습니다.");
					System.out.println("당첨상품은 구매하신 물품과 같이 배송됩니다.");
					System.out.println("ENTER를 입력해주세요.");
					
					isRunning = false;
					scanner.nextLine(); 
				} else if (select > count) {
					System.out.println("범위를 벗어난 번호입니다.");
				}
				else {
					System.out.println("안타깝게도 당첨이 되지 않으셨습니다.");
					System.out.println("다음 구매기회를 노려주세요!!");
					System.out.println("ENTER를 입력해주세요.");
					
					isRunning = false;
					scanner.nextLine();
				}
				
			} catch (Exception e) {
				System.out.println("잘못 입력하셨습니다. 입력해주세요.");
			}
		}
	}

	// 구매 금액에 따른 행운의 번호 확률 고지
	private String luckylevel(int total) {
		String result = "";
		if (total <= 500000) {
			result = "1%";
		} else if (total <= 2000000) {
			result = "5%";
		} else {
			result = "10%";
		}
		return result;
	}

}

