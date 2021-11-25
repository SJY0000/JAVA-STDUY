package hang;

import java.util.Scanner;

public class Hang {

	private boolean running = true;

	RandomWord word = new RandomWord();
	Scanner scanner = new Scanner(System.in);

	public void run() {
		do {
			displayWord();
			getInUserinput();
			checkUserInput();
		} while (running);
	}

	private void displayWord() {
		System.out.println(word.toString());
	}

	private void getInUserinput() {
		System.out.print("하나의 문자 입력 : ");
		String guess = scanner.nextLine();
		word.addGuess(guess.charAt(0));
	}

	private void checkUserInput() {

		if (word.isCompleted()) {
			System.out.println("잘 맞췄어요!");
			System.out.println("정답은 " + word.toString());
			running = false;
		}
	}

	public void close() {
		scanner.close();
	}
}
