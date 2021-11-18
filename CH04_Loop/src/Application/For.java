package Application;

public class For {
	public static void main(String[] args) {
		// for 반복문
		// for(초기값; 조건; 증감) { 명령문; }
//		for (int i = 0 ; i< 10 ; i++) {
//			System.out.println("i : " + i);
//			
//		}
//		for (;;) { // 무한 반복
//			System.out.println("Hello");
//		}
		int a = 0;
		for (int i = 1; i < 101; i++) {
//			a = a + i;
			a += i;
		}
		System.out.println(a);
	}
}
