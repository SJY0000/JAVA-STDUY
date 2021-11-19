package Application;

import java.util.Scanner;

public class Problem6 {

	public static void main(String[] args) {
		// 3자리 정수의 각 자리 숫자의 총합을 구하시오
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("각자리 숫자의 합을 구할 3자리 숫자를 입력해주세요 : ");
		int num = scanner.nextInt();
		int hundnum = num / 100;
		System.out.println(hundnum);
		int tennum = (num / 10) - (hundnum * 10);
		System.out.println(tennum);
		int onenum = num - (hundnum * 100 + tennum * 10);
		System.out.println(onenum);
		scanner.close();
		
		int total = hundnum + tennum + onenum;
		System.out.printf("각 자리 숫자의 총합은 : %d", total);
		

	}

}
