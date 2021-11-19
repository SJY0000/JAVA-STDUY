package application;

public class LoopArray2 {

	public static void main(String[] args) {
		// 문자열 타입으로 만든 배열

		String[] animals = { "고양이", "개", "펭귄", "사자", "양", "말", "호랑이", "기운은", "콘푸로스트" };
		/*
		 * System.out.println(animals[0]); 
		 * System.out.println(animals[1]);
		 * System.out.println(animals[2]); 
		 * System.out.println(animals[3]);
		 */

		// 배열.length는 배열의 사이즈(크기)를 알려준다.
		for (int i = 0; i < animals.length; i++) {
			System.out.printf("index %d번은 %s이다 \n", i, animals[i]);
		}

	}

}
