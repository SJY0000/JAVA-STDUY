package stream_example;

import java.util.stream.Stream;

public class Generating_Stream {

	public static void main(String[] args) {
		// Stream of, of(데이터, 데이터) -> 데이터의 형태에 따라 문자형, 정수형이 달라진다.(Generic)
		// Stream은 기본적으로 Generic 타입
		Stream.of(1, 2, 3).forEach(n -> System.out.println(n)); // 정수형
		Stream.of("하나", "둘", "셋").forEach(s -> System.out.println(s)); // 문자형
		
		System.out.println();
		
		//generate()는 ()안의 return결과로 Stream을 생성한다. 무한대로 생성하기 때문에 limit(갯수)으로 갯수 제한
		Stream.generate(() -> "헬로우").limit(10).forEach(s -> System.out.println(s));
		
	}

}
