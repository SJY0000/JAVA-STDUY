package operators;

public class And_Or {

	public static void main(String[] args) {
		// bit AND, OR 연산
		int v1 = 0b01010011;
		int v2 = 0b11010110;
		
		int result1 = v1 & v2; // AND bit 연산, 둘 다 1일 때 만 1을 return
		
		System.out.println(toBinary(v1));
		System.out.println(toBinary(v2));
		System.out.println(toBinary(result1));
		
		System.out.println("====================");
		int result2 = v1 | v2; // OR bit 연산 , 둘 중 하나만 1이여도 1을 return
		
		System.out.println(toBinary(v1));
		System.out.println(toBinary(v2));
		System.out.println(toBinary(result2));

	}
	public static String toBinary(int value) { // 2진수 문자열로 출력
		// String.format은 printf처럼 사용하면 문자열로 return된다.
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0"); // 공백일 떄는 0을 채워라
	}

}
