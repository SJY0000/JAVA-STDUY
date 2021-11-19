package application;

public class MultiArray {

	public static void main(String[] args) {
		// 이중 배열 [][]
		String[][] texts = {
				{"하나", "둘","셋"}, // i = 0, texts[0]
				{"넷", "다섯","여섯"}, // i = 1, texts[1]
				{"일곱","여덟","아홉"} // i = 2, texts[2]
		};
							// 이중배열의 length는 배열이 몇개인지 알려준다
		for(int i = 0; i < texts.length; i++) {
//			System.out.printf("%d번째 배열 %s \n", i, texts[i]);
//			String[] inArray = texts[i];
			
			for(int j = 0; j < texts[i].length; j++) {
				System.out.printf("%s \t", texts[i][j]);
			}
			System.out.println();
		}

	}

}
