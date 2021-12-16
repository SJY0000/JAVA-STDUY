package operators;

public class Xor_Not {

	public static void main(String[] args) {
		// bit XOR, NOT 연산
		int v1 = 0b01010011;
		int v2 = 0b11010110;
		
		int result1 = v1 ^ v2; // XOR bit 연산, 같으면 0, 다르면 1 return
		
		System.out.println(toBinary(v1));
		System.out.println(toBinary(v2));
		System.out.println(toBinary(result1));
		
		System.out.println("====================");
		
		// NOT bit 연산 , 1은 0이 되고 0은 1이되도록 return
		System.out.println(toBinary(~result1));

	}
	public static String toBinary(int value) { // 2진수 문자열로 출력
		// String.format은 printf처럼 사용하면 문자열로 return된다.
		 // replace(" " ,"0" ) 공백일 떄는 0을 채워라
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}

}
