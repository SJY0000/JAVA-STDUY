package exam1;

public interface App {
	public static void main(String[] args) {
		// 1. 메뉴 객체 만들기 2. display() 메소드 사용해서 메뉴 출력하기
		
		Menu menu = new Menu();
		System.out.println("메뉴를 선택:");
//		System.out.println(menu.play[1]);
		menu.display();
//		menu.display2();
	}
}
