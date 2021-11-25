package hang;

import java.util.Random;

public class RandomWord {
	private String str = "solution administration secretary addition criticism republic proposal independence disaster importance celebration initiative manufacturer procedure imagination entertainment property response elevator reputation supermarket community replacement agreement quantity interaction currency relationship analysis direction conclusion maintenance association suggestion introduction information shopping chocolate director consequence departure strategy marriage leadership hospital psychology discussion presence attitude collection";
	private String[] words = str.split(" ");

	private String selectWord;
	private char[] characters;
	Random random = new Random();

	public RandomWord() {
		selectWord = words[random.nextInt(words.length)];
		characters = new char[selectWord.length()];

	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("");
		for (char c : characters) {
			sb.append(c == '\u0000' ? "_" : c);
			sb.append(' ');
		}
		System.out.println(selectWord);
		return sb.toString();
	}

	public boolean addGuess(char c) {
		for (int i = 0; i < selectWord.length(); i++) {
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
				return true;
			}
		}
		return false;
	}

	public boolean isCompleted() {
		for (char c : characters) {
			if (c == '\u0000') {
				return false;
			}
		}
		return true;
	}
}
