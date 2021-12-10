package java_api;

import java.util.HashMap;

public class MapExample {

	public static void main(String[] args) {
		// 자바스터딩 관계자의 이메일 목록은 아래와 같다.
		// 홍팍 , sehong@cloudstudying.kr
		// 나리 , narig@cloudstudying.kr
		// 정애 , jungae@cloudstudying.kr
		// 이름 HashMap을 사용하여 저장하고, 출력 예와 같은 결과를 얻으시오.
		
		HashMap<String, String> emails = new HashMap<>();
		
		// 데이터 저장
		emails.put("홍팍", "sehong@cloudstudying.kr");
		emails.put("나리", "nari@cloudstudying.kr");
		emails.put("정애", "jungae@cloudstudying.kr");
		
		// HashMap 크기 출력
		System.out.printf("emails.size() -> %d\n", emails.size());
		
		// key 목록 출력
		System.out.println("\n== key set ==");
		for (String key : emails.keySet()) {
			System.out.println(key);
		}
		
		// value 목록 출력
		System.out.println("\n== values ==");
		for (String val : emails.values()) {
			System.out.println(val);
		}
		
		

	}

}
