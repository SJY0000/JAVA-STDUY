package numbering;

public class App {

	public static void main(String[] args) {
		/*
		 * 10진수 decimal 	  0 - 9
		 * 2진수 binary 		  0 - 1
		 * 16진수 hexadecimal  0 - F
		 * 
		 * 1234, 34, 87, 539 -> 10진수
		 * 0, 1, 10. 11. 100. 1101 -> 2진수
		 * A0, FB, CD, FFFF, FF00 -> 16진수
		 */
		
		// 16진수 리터럴(값) 표시는 0x 이진수는 0b
		int val = 0b11111111; // 255, 0xFF, 0b11111111 같은 숫자
		// 2진수 숫자 하나당 1bit, 8bit = 1byte, 1byte로 표시할 수 있는 가장 큰수는 255 
		
		System.out.println("10진수 : " + val); // 10진수 : 255
		// 10진수 정수를 => 2진수로 표현
		System.out.println("2진수로 변경 : " + Integer.toBinaryString(val)); // 2진수로 변경 : 11111111
		// 10진수 정수를 => 16진수로 표현
		System.out.println("16진수로 변경 : " + Integer.toHexString(val)); // 16진수로 변경 : ff
		

	}

}
