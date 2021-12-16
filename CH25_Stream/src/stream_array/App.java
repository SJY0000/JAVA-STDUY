package stream_array;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class App {

	public static void main(String[] args) {
		// of()는 데이터 직접넣을때, []->스트림은 Arrays.stream(), list->스트림은 list.stream()
		// list => .stream()
		// 리스트가 아닐경우 1. Stream.of(1,2,3) 정수형 스트림, Stream.of("하나", "둘", "셋") 문자열스트림
						// 2. 배열일 경우 Arrays.stream(배열)
		Stream.of("Hello","Bottle","Africa")
				.sorted() // 문자가 영어니 알파벳순으로 정렬됨, ("Africa","Bottle","Hello")로 정렬
				.findFirst() // 첫번째 데이터 출력 
				.ifPresent(x -> System.out.println(x)); // 값이 있으면 ()안의 코드 실행
		
		String[] items = {"치킨", "원숭이", "고릴라", "치약", "고라니", "치과", "고양이"};
		Stream.of(items)	// 배열을 of()안에 넣어서 Stream타입으로 생성
				// filter 조건에 해당하는 데이터만 남김(조건에 대하여 true)
				.filter(s -> s.startsWith("치") )  // starsWith() ()안의 문자로 시작하는 데이터만 남김
				.forEach(x -> System.out.print(x + ", "));
		
		System.out.println();
		int[] numbers = {2, 4, 6, 8, 10};
		Arrays.stream(numbers)
				.map(n -> n * n) // 각 데이터들 제곱
				.average()	// 데이터들 평균
				.ifPresent(n -> System.out.print(n));
		
		System.out.println();
		// 배열을 리스트로
		List<String> list = Arrays.asList(items); // 배열 items를 list타입으로 변환
		
		list.stream()
			.filter(x -> x.startsWith("고")) // 고릴라, 고라니, 고양이
			.sorted()	// 고라니, 고릴라, 고양이
			.forEach(x -> System.out.print(x +", "));
		
		int[] nums = {9, 4, 6, 3, 1 , 2, 7};
		
		System.out.println();
		Arrays.stream(nums)
				.filter( n -> n > 3) // 9,4,6,7
				.sorted()	// 4,6,7,9
				.map(s -> s * 10) // 40, 60, 70, 90
				.forEach(n -> System.out.println(n));
	

	}

}
