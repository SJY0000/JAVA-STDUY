package java_api;

import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TreeSet API 문서와 주어진 코드를 참조하여 출력 예와 같은 결과를 얻으시오.
		
		TreeSet<String> names = new TreeSet<>();
		
		names.add("Daniel");
		names.add("Brian");
		names.add("Eugene");
		names.add("Adam");
		names.add("Cate");
		
		System.out.printf("names.size() -> %d\n", names.size());
		System.out.printf("names.first() -> %s\n", names.first());
		System.out.printf("names.last() -> %s\n", names.last());
		
		System.out.println("== for each 구문 출력==");
		names.forEach(System.out::println);
	}

}
