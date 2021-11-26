package application;

import game.Game;

public class App {

	public static void main(String[] args) {
//		Game game = new Game(); // 클래스 불러오기 할 때 ctrl + space 또는 
//		game.run();						// ctrl + shift + o (여러개 한꺼번에 할 때)game.run();
		
		new Game().run(); // Game의 주소는 모르고 run만 실행이 됨W

	}

}
