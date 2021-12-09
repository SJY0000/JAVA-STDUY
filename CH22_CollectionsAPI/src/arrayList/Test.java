package arrayList;

import java.util.ArrayList;
//import java.util.LinkedList;
import java.util.Scanner;
//import java.util.Vector;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> numbers = new ArrayList<>();
//		LinkedList<Double> numbers = new LinkedList<>();
//		Vector<Double> numbers = new Vector<>();

		double total = 0;
		while (true) {
			System.out.print("숫자 또는 'q' 입력 > ");

			String input = scanner.nextLine();
			input = input.trim(); // 공백제거

//		System.out.println(input);
			if (input.equalsIgnoreCase("q")) { // 대문자 소문자 상관없이 q,Q 입력시 반복문 종료
				break;
			}
			try {
				double value = Double.parseDouble(input);// 문자열 => 실수로 변환
				numbers.add(value); // 실수로 변환된 값을 리스트에 입력
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아닙니다.");
			}

		}
		scanner.close();

		System.out.println();
		if (numbers.size() > 0) { // 입력된 숫자가 1개 이상이면 출력
			System.out.println("입력된 숫자 : ");			
			for (double num : numbers) {
				System.out.printf("%.2f\n", num);
				total += num;
			}	 
			System.out.printf("평균값 : %.2f",total / numbers.size());
		}else {
			System.out.println("숫자가 입력되지 않음!");
		}

	}

}
