package practice;

import java.util.Scanner;

public class Elevator {
	
	
	public static String guide(int f) {
		return f > 10 ? "고층" : "저층";
	}
	
	public static void main(String[] args) {
		// 신사옥의 엘리베이터는 저증과 고층으로 나뉘어 운행된다. 저층은 1~10층, 고층은 11~20층을 운행한다.
		// 방문 층수를 입력받아 타야할 엘리베이터를 반환하는 메소드 guide()를 완성하여
		// 출력 예와 같은 결과를 얻으시오.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("목적지의 층수는 : ");
		int a = scanner.nextInt();
		System.out.print("목적지의 층수는 : ");
		int b = scanner.nextInt();
		System.out.print("목적지의 층수는 : ");
		int c = scanner.nextInt();
		scanner.close();
		
		System.out.printf("%d층 -> %s 엘리베이터\n", a, guide(a));
		System.out.printf("%d층 -> %s 엘리베이터\n", b, guide(b));
		System.out.printf("%d층 -> %s 엘리베이터\n", c, guide(c));
	}

}
