package nullPointException;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		// nullPoint 예외는 RuntimeException으로예외 처리 안해도 됨

		// 런타임 예외 예
		System.out.println(5/0);
		
		// nullpoint 예외, 객체가 null값인데 사용 할 경우
		Scanner scanner = null; // 객체는 생성 안됨
		scanner.nextInt();
				
	}

}
