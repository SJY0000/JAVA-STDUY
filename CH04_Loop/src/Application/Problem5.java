package Application;

import java.util.Scanner;

public class Problem5 {

	public static void main(String[] args) {
		// 홍팍이의 1월, 2월, 3월달에 대한 몸무게 변화는 아래와 같다
		// 1월 : 81.36kg
		// 2월 : 전달 대비 + 0.71kg
		// 3월 : 전달 대비 = 0.43kg
		// 홍팍이의 1월달 부터 3울달 까지의 평균 몸무게는 얼마인지 구하시오.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("홍팍이의 1월달 몸무게는 : ");
		double jan = scanner.nextDouble();
		System.out.print("2월 늘어난 몸무게는 : ");
		double feb = jan + scanner.nextDouble();
		System.out.print("3월 줄어든 몸무게는 : ");
		double mar = feb - scanner.nextDouble();
		scanner.close();
		
		double avg = (jan + feb + mar) / 3;
		System.out.printf("1월 ~ 3월 평균 몸무게는 : %.2fkg", avg);

	}

}
