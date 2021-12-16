package application;

import java.util.Random;

public class RandomWord {
	// 스페이스바로 띄워진 단어들을 문자열로 str에 저장
	private String str = "solution administration secretary addition criticism republic proposal independence disaster importance celebration initiative manufacturer procedure imagination entertainment property response elevator reputation supermarket community replacement agreement quantity interaction currency relationship analysis direction conclusion maintenance association suggestion introduction information shopping chocolate director consequence departure strategy marriage leadership hospital psychology discussion presence attitude collection";
	private String[] words = str.split(" "); // 문자열을 스페이스로 잘라서 배열에 단어로 입력

	private String selectWord; // 랜덤으로 선택된 단어
	private char[] characters; // 문자 배열 선언(철자를 맞추면 저장)

	private Random random = new Random();

	public RandomWord() {
		// 생성자에 랜덤 단어를 선택

		selectWord = words[random.nextInt(words.length)];
		characters = new char[selectWord.length()]; // 선택단어의 길이만큼 문자배열 크기로 생성

	}

	public void getWords() { // 현재 words배열에 있는 전체 단어를 출력
		for (String w : words) {
			System.out.println(w);
		}
	}

	public String toString() {
		// 단어를 _로 출력한다
//		String text = "";
		StringBuilder sb = new StringBuilder();
		sb.append("");
//		characters[3] = 'x';
		for (char c : characters) {
			sb.append(c == '\u0000' ? '_' : c); // 못 맞추면 _, 맞추면 c
			sb.append(' ');
//			c = c == '\u0000' ? '_' : c;
//			sb.append(c);
			
			// if (c == '\u0000') { // 문자('')의 초기값, 문자형의 null값, 문자형의 값이 없을 경우 값 란 의미는 아직 맞추지
			// 못한 문자
////			text += '_';
//			sb.append('_');
//		}
//		else {
////			text += c; // 맞춘 문자일 경우 그대로 집어넣는다
//			sb.append(c);

//		}
//		text += ' '; // 철자를 한칸씩 스페이스바
		}
//		System.out.println(selectWord); // 정답출력 (테스트)
		return sb.toString(); // 선택된 랜덤 단어를 가져옴
	}

	public boolean addGuess(char c) {
		// 넘어온 문자를 검사해서 선택 단어에 있으면 characters 배열에 저장
		for (int i = 0; i < selectWord.length(); i++) { // 단어 길이 만큰 반복
			if (c == selectWord.charAt(i)) {
				characters[i] = c;
				
			}
		}
		
		return true;

	}

	public boolean isCompleted() {
		// 철자를 다 맞췄는지 체크해서 true or false로 리턴
		for (char c : characters) { // 단어 전체 철자 반복 검사
			if(c == '\u0000') {
				return false; // 아직 맞춰야할 문자가 있음
			}
		}
		return true; // 다 맞췄음
	}
}
