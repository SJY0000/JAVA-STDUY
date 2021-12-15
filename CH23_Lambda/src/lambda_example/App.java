package lambda_example;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class App {

	public static void main(String[] args) {
		// 문자열 ArrayList 생성
		List<String> list = new ArrayList<>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		
		list.forEach(new Consumer<String>() { // consumer는 인터페이스 익명클래스를 완성해줘야 객체로써 완성이됨
			@Override
			public void accept(String t) {
				// Anonymous 클래스에서 추상메소드를 구현, 입력된 문자열 반복
				System.out.print(t + "\t");			
			}
		});
		System.out.println();
		// 익명클래스 => 람다식으로
		list.forEach(t -> System.out.print(t +"\t")); // 인터페이스가 있을 때, 익명클래스를 사용할 수 있는 경우에만 대신해서 람다식으로 사용가능함
		

	}

}
