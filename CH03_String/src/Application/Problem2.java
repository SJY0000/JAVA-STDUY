package Application;

public class Problem2 {

	public static void main(String[] args) {
		// 홍팍이의 허리 둘레가 32인치일 때, 이를 cm로 변환한 결과를 구하시오.

		double inchtocm = 2.54;
		int inch = 32;
		double cm = inch * inchtocm;
		System.out.printf("홍팍이의 허리 둘레는 %.2finch\n", inchtocm);
		System.out.printf("%.2fcm\n", cm);

	}

}
