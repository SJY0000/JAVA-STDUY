package lambda_interface;

import java.util.function.Predicate;

public class App {

	public static void main(String[] args) {
		// predicate를 사용
		Predicate<String> p1 = new Predicate<String>() {

			@Override
			public boolean test(String t) {
				// 입력된 타입의 객체를 검사해서 true/false으로 return
				return t.length() < 4 ;
			}
		
		};
		System.out.println(p1.test("abcd")); 
		System.out.println(p1.test("하나둘")); 
		
		System.out.println("==============");
//		Predicate<String> p2 = t -> {return t.length() < 4;}; // void가 아닌 이상 return값 존재
															// Predicate은 boolean 타입의 익명메소드를 기본적으로 가지고 있음
		Predicate<String> p2 = t -> t.length() < 4;
		
		System.out.println(p2.test("abcd"));
		System.out.println(p2.test("하나둘"));
	}

}
