package lambda_interface;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class RemoveIf {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(3);
		numbers.add(5);
		numbers.add(7);
		numbers.add(2);
		numbers.add(9);
		numbers.add(10);
		numbers.add(4);
		
		// List 객체의 numbers안에 있는 정수들 중에 6보다 작으면 제거
		// removeIf 메소드는 Predicate로 검사(test)해서 true이면 제거한다.
		// predicate 는 boolean으로 return값이 있으므로 위로 전부 생략
//		numbers.removeIf(new Predicate<Integer>() {
//			@Override
//			public boolean test(Integer i) {
//				return i < 6; // 정수가 6보다 작으면 참
//			}
//		
//		});
		numbers.removeIf(i -> i < 6);
		numbers.forEach(x -> System.out.println(x));
		
		List<String> sList = new ArrayList<>();
		
		sList.add("하나둘");
		sList.add("하나둘셋");
		sList.add("하나");
		sList.add("하나둘셋넷다섯");
		
		// 문자열 길이가 4보다 작으면 제거 => filter 역할
		sList.removeIf(s -> s.length() < 4);
		sList.forEach(s -> System.out.println(s));

	}

}
