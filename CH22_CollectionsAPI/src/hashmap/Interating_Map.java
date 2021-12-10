package hashmap;

import java.util.HashMap;

public class Interating_Map {

	public static void main(String[] args) {
		// Map 타입을 반복문 출력
		HashMap<String, String> months = new HashMap<>();
		
		months.put("Jan", "1월");
		months.put("feb", "2월");
		months.put("mar", "3월");
		months.put("apr", "4월");
		months.put("may", "5월");
		months.put("Jun", "6월");
		
		// 람다식으로 출력
		months.forEach((k, v) -> System.out.println(k + " : " + v));
		
		System.out.println();
		
		// entrySet() : key 와 value 값을 가져옴
		for(var entry : months.entrySet()) {
			String k = entry.getKey();
			String v = entry.getValue();
			
			System.out.println(k + " : " + v);
		}
		System.out.println();
		
		// keySet() 키 값만 가져옴
		for(String key : months.keySet()) {
			String value = months.get(key);
			
			System.out.println(key + " : " + value);
		}
	}

}
