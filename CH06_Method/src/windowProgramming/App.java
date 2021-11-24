package windowProgramming;

public class App {

	public static void main(String[] args) {
		// window 객체를 생성
		// set 메소드로 값을 입력하고 get메소드로 값을 출력
		// 설정 윈도우 창의 가로길이 300 세로길이 600
		// 현재 보이도록 true, top 200, left 400
		
		Window window = new Window();
		
		window.setwidth(300);
		window.setheight(600);
		window.setisVisible(true);
		window.settop(200);
		window.setleft(400);
		
		System.out.println("가로길이 : " + window.getwidth());
		System.out.println("세로길이 : " + window.getheight());
		System.out.println("현재보임 : " + window.getisVisible());
		System.out.println("위치 top : " + window.gettop());
		System.out.println("위치 left : " + window.getleft());
		

	}

}
