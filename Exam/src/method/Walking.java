package method;

import java.util.Scanner;

public class Walking {
	
	public static double calculaterCalory(double walk) {
			double result = 0.02 * walk;
			return result;
		}
	
	public static void main(String[] args) {
//		 한 걸음을 걸을 때마다 0.02kcal가 소모된다.
//		 하루동안 5000걸음을 걸었을 때, 소모한 칼로리량을 계산하는 프로그램을 작성하시오.
//		 hint) 메소드의 리턴 타입은 double 이다.
		Scanner scanner = new Scanner(System.in);	
		System.out.print("몇 걸음 걸었는지 적어주세요 : ");
		double a = scanner.nextDouble();
		double totalCal = calculaterCalory(a);
		
		System.out.println("총 소모된 칼로리는 : " + totalCal);
		scanner.close();

		
	}
}
