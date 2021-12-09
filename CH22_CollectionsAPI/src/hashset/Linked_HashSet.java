package hashset;

import java.util.LinkedHashSet;


public class Linked_HashSet {

	public static void main(String[] args) {
		// Set 타입은 데이터 중복이 안되고 순서가 없어서 index번호가 없음
		// LinkedHashSet은 중복이 안되고 입력된 순서대로 출력됨
		LinkedHashSet<String> fruits = new LinkedHashSet<>();
		
		fruits.add("사과");
		fruits.add("바나나");
		fruits.add("오렌지");
		fruits.add("오렌지");
		fruits.add("배");
		fruits.add("사과");
		fruits.add("사과");
		
		System.out.println(fruits.contains("바나나")); // fruits 안의 데이터중 ()안의 데이터가 있으면 true 없으면 false
		
		fruits.forEach(System.out::println);
//		for (String fruit: fruits) {
//			System.out.println(fruit);
//		}

	}

}
