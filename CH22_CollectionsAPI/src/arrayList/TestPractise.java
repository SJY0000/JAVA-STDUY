package arrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class TestPractise {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ArrayList<Double> doubles = new ArrayList<>();

		double total = 0;
		while (true) {
			System.out.print("숫자를 입력해주세요 (q입력시 종료) > ");
			String input = scanner.nextLine();
			input = input.trim();

			if (input.equalsIgnoreCase("q")) {
				break;
			}
			try {
				double value = Double.parseDouble(input);
				doubles.add(value);
			} catch (NumberFormatException e) {
				System.out.println("숫자가 아니 잖아 슈슈슉...슉..");
			}
		}
		scanner.close();

		System.out.println("=============");
		if (doubles.size() > 0) {
			System.out.println("입력한 숫자는 : ");
			for (double n : doubles) {
				System.out.printf("%.2f\n",n);
				total += n;
			}
			System.out.println("=============");
			System.out.printf("평 균 값 : %.2f", total / doubles.size());
		} else {
			System.out.println("아무 숫자도 입력 되지 않았습니다.");
		}

	}

}
