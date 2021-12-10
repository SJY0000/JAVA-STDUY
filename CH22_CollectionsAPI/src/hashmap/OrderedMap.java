package hashmap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class OrderedMap {

	public static void main(String[] args) {
		// Map 타입 정렬
		// HashMap, LinkedHashMap(입력한 순서대로), TreeMap(정렬)
		
		Map<Integer, String> month1 = new LinkedHashMap<>();
		
		month1.put(1, "1월");
		month1.put(3, "3월");
		month1.put(6, "6월");
		
		month1.forEach((k, v) -> System.out.println(k + " : " + v));
		
		System.out.println("==============");
		Map<Integer, String> month2 = new TreeMap<>(); // key값을 기준으로 정렬한다.
		
		month2.put(3, "3월");
		month2.put(6, "6월");
		month2.put(1, "1월");
		
		month2.forEach((k, v) -> System.out.println(k + " : " + v));

	}

}
