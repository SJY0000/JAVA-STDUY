package Application;

public class Increment {

	public static void main(String[] args) {
		// 증가 감소 연산자
		// 정수값을 1씩 증가 1씩 감소 => 반복문
		int count = 0;

		count = count + 1;
		System.out.println(count);
		count += 1; // count = count + 1
		System.out.println(count);
		System.out.println(count++); // 출력한 다음 더함
		System.out.println(++count); // 더한 다음 출력
		System.out.println(count);
		
		System.out.println("=======================");
		// 위와 같이 4가지 방법으로 1씩 감소를 시켜라
		System.out.println(--count); // 뺀 다음 출력
		System.out.println(count--); // 출력한 다음 뺌
		System.out.println(count);
		count -= 1;
		System.out.println(count);
		count = count - 1;
		System.out.println(count);

	}

}
