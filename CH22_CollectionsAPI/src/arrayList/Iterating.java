package arrayList;

import java.util.ArrayList;

public class Iterating {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>(); // Integer타입 리스트 생성
		
		// 리스트에 정수 추가
		list.add(7);
		list.add(15);
		list.add(123);
		
		// 반복문 사용 for each문 : 간단하게 출력
		for (Integer n : list) {
			System.out.println(n);
		}
		
		System.out.println("===================");
		// for 반복문 : Index 번호가 필요할 때
		for(int i = 0; i < list.size(); i++) { // size() list에 몇개가 들었는 지 알 수 있는 방법
			Integer n = list.get(i);
			System.out.println(i + " : " + n);
		}
		
		System.out.println("===================");
		// Colletion객체.forEach(각각 반복), 람다식
		list.forEach(e -> System.out.println(e));
		
		System.out.println("===================");
		// 메소드 reference
		list.forEach(System.out::println);

	}

}
