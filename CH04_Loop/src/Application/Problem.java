package Application;

import java.util.Scanner;

public class Problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.print("a의 값은? ");
		int a = scanner.nextInt();
		System.out.print("b의 값은? ");
		int b = scanner.nextInt();
		scanner.close();

		int c = (a * b);
		int d = (a / b);
		int e = (a % b);
		System.out.printf("곱하기 : %d * %d = %d\n", a, b, c);
		System.out.printf("나누기 : %d / %d = %d\n", a, b, d);
		System.out.printf("나누기 나머지 : %d / %d = %d", a, b, e);
	}

}
