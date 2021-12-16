package application;

import java.util.Scanner;

public class Hangman {
	private boolean running = true; // 게임을 계속 진행, false이면 중지

	// 프로그램을 실행하는 런 메소드
	public void run() {
		do {
			displayWord(); // 화면에 단어표시
			getUserInput(); // 데이터를 입력받음
			checkUserInput(); // 맞는 지 체크 (전부 맞으면 running = false)
		} while (running);
	}

	private RandomWord word = new RandomWord(); // 출력

	private void displayWord() {
//		System.out.println("화면에 단어 표시");
		System.out.println(word.toString()); // 출력
	}

	private Scanner scanner = new Scanner(System.in);

	private void getUserInput() {
//		System.out.println("철자하나 입력");
		// 입력받은 한 문자 입력 요구
		// 입력받은 문자열에서 한 문자를 뽑아서
		// RandomWord 객체에 전달( addGuess(문자) 메소드를 만들자
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine(); // 입력받은 문자열을 guess에 저장
		// 단어에서 입력받은 문자가 있는지 확인해서 처리한다. (단어는 RandomWord 객체 words를 사용)
//		word.addGuess(guess.charAt(0)); // 첫번째 문자를 입력
		lastGuess = guess.charAt(0);

	}

	private void checkUserInput() {
//		System.out.println("맞는지 체크");
		// 유저가 단어를 다 맞췄는지 체크해서 게임을 종료
		// 게임 종료 확인을 하는 메소드 isCompleted를 RandomWord 클래스에 만들기
		boolean isCorrect = word.addGuess(lastGuess);
		remainTries++;
		if (isCorrect) {
			if (word.isCompleted()) {
				System.out.println("잘 맞췄어요!");
				System.out.println("시도횟수 : " + remainTries);
				System.out.println("남은횟수 : " + chance);
				System.out.println("정답은 : " + word.toString());
				running = false;
			}
		} else {
			
			if (remainTries == chance) {
				System.out.println("Game Over!");
				running = false;
			}
		}

	}

	private int remainTries = 0;
	private int chance = 100;
	private char lastGuess;

	/**
	 * Scanner를 닫는 메소드
	 */
	public void close() {
		scanner.close();

	}
}
