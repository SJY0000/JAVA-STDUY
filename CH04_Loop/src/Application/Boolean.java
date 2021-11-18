package Application;

public class Boolean {

	public static void main(String[] args) {
		// Boolean 타입은 true, false
		boolean c1 = false;
		System.out.println("조건 1 : " + c1);
		
		// 비교 결과가 참 or 거짓
		boolean c2 = 4 < 5;
		System.out.println("조건 2 : " + c2);
		
		boolean c3 = 2 > 8;
		System.out.println("조건 3 : " + c3);
		
		// 비교 == 같다, != 같지 않다, >=, <=
		boolean c4 = 9 == 10;
		System.out.println("조건 4 : " + c4);
		System.out.printf("조건 4 : %b\n", c4); // Boolean은 %b로 printf에 사용
		
		boolean c5 = 4 != 5;
		System.out.println("조건 5 : " + c5);

	}

}
