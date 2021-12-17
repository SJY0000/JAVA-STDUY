package operators;

public class Xor_Not {

	public static void main(String[] args) {
		// bit XOR, NOT 연산
		int v1 = 0b01010011;
		int v2 = 0b11010110;
		
		int result1 = v1 ^ v2; // XOR bit 연산, 같으면 0, 다르면 1 return
		
		System.out.println(toBinary(v1)); // 01010011
		System.out.println(toBinary(v2)); // 11010110
		System.out.println(toBinary(result1)); // 10000101
		
		System.out.println("====================");
		
		// NOT bit 연산 , 1은 0이 되고 0은 1이되도록 return
		System.out.println(toBinary(~result1)); // 11111111111111111111111101111010 32bit 출력
		
		int v3 = ~v1;
		System.out.println(v1); // 83
		System.out.println(v3); // -84
		
		System.out.println("==========");
		int v4 = ~0b001001;
		System.out.println(toBinary(v4)); // 11111111111111111111111111 110110 // 앞 제외 하면 반전 됨
		System.out.println(toBinary(~v4)); // 00001001
		System.out.printf("%d", v4);
		

	}
	public static String toBinary(int value) { // 2진수 문자열로 출력
		// String.format은 printf처럼 사용하면 문자열로 return된다.
		 // replace(" " ,"0" ) 공백일 떄는 0을 채워라
		return String.format("%8s", Integer.toBinaryString(value)).replace(" ", "0");
	}

}
