package test;

public class TernaryCondition { // 삼항 조건 연산자

	public static void main(String[] args) {
		// 조건 ? A : B ( 조건이 true이면 A, false면 B이다)
		System.out.println(false ? "참" : "아님");
		System.out.println(true ? "참" : "아님");
		
		int n = 1010;
		n = n > 100 ? 100 : n; // 100보다 크면 100 출력, 아니먄 n 출력
		
		System.out.println(n);
		
		int[] values = {6, 3, 92, 64, 17};
		int max = 0; // 최대값
		
		for (int val : values) {
//			if(val > max) {
//				max = val; // 맥스값보다 val가 크면 val값을 맥스에 넣는다.
//			}
			max = val > max ? val : max;
		}
		System.out.println(max);
	}

}
