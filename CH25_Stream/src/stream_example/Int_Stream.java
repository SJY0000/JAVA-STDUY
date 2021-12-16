package stream_example;

import java.util.stream.IntStream;

public class Int_Stream {

	public static void main(String[] args) {
		// 정수형 Stream 생성
		IntStream
				.range(1,10) // 1에서 10-1까지 정수(1 ~ 9)
				.skip(5) // 5번쨰까지 스킵
				.forEach(n -> System.out.println(n));
		
		System.out.println();
		
		int val = IntStream.range(1, 101).sum(); // 1 ~ 100 까지 정수의 합
		long val2 = IntStream.range(1, 101).count(); // 1~ 100 까지 갯수
		System.out.println(val);
		System.out.println(val2);
		
	}

}
