package method;


import java.util.Scanner;
import javax.swing.JOptionPane;


public class JavaCafe {

	public static void main(String[] args) {
		// 당신은 Java 카페의 사장이 되었고, 며칠 후 알바생들에게 급여를 주어야 한다. 급여조건 및 제약사항은 아래와 같다.
		// 급여는 주급으로 정산하며 (근무시간) * (기본 시급)을 기준으로 한다.
		// 주당 근무가 40시간을 초과시, 초과분에 대하여 1.5배의 급여를 지급한다.
		// 기본 시급은 최저 $8.00이며, 이보다 작은 경우 경고문을 출력한다.
		// 주당 근무가 60시간을 넘을 시, 경고문을 출력한다.
		// 위 내용을 만족하는 printPay() 메소드를 완성하여, 출력 예와 같은 결과를 얻으시오.
		
		Scanner scanner = new Scanner(System.in);
		System.out.print("최저시급을 입력해주세요.(소수점 둘째자리까지) : ");
		double b = scanner.nextDouble();
		System.out.print("근무시간을 입력해주세요. : ");
		int h = scanner.nextInt();
		scanner.close();
		

		printPay(b ,h);
		
		
	}
	public static void printPay(double b, int h) {
		double pay = 0;
		if (b < 8.00) {
//			JOptionPane.showMessageDialog(null, "최저시급 에러!");
			System.out.println("최저 시급 에러!");
		}
		else if (h > 60) {
//			JOptionPane.showMessageDialog(null, "근무시간 초과!");
			System.out.println("초과 근무시간 에러!");
		}
		else if (h > 40) {
			h= h * 3 / 2;
		}
		pay = b * h;
		System.out.printf("$ %.2f\n", pay);
		
	}

}
