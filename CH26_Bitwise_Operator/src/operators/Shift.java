package operators;

public class Shift {

	public static void main(String[] args) {
		// bit SHIFT >>, << 연산
		int value = 0b00010001;
		
		System.out.println(toBinary(value)); // 00010001
		
		int result1 = value << 3; // 왼쪽 방향으로 3칸 옮김
		
		System.out.println(toBinary(result1)); // 10001000
		
		int result2 = result1 >> 3; // 오른쪽 방향으로 2칸 옮김 // 00010001
		
		System.out.println(toBinary(result2));
		
		// (숫자 << n) -> 숫자 * (2^n), (숫자 >> n) -> 숫자 / (2^n) 
		System.out.println(100 << 2); // 곱하기 값이 2^n // 400
		System.out.println(100 >> 2); // 나누기 2*2  // 25
		System.out.println(300 << 3); // 2400

	}
	public static String toBinary(int value) { // 2진수 문자열로 출력
		// String.format은 printf처럼 사용하면 문자열로 return된다.
		 // replace(" " ,"0" ) 공백일 떄는 0을 채워라
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}

}
