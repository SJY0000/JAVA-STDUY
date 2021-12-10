package treeSet;

import java.util.TreeSet;


public class App2 {

	public static void main(String[] args) {
		TreeSet<Integer> n = new TreeSet<>();
		
		n.add(1);
		n.add(8);
		n.add(4);
		n.add(6);
		
		n.forEach(System.out::println);
		
		System.out.println("==================");
		TreeSet<String> s = new TreeSet<>();
		s.add("강아지");
		s.add("강");
		s.add("검은색");
		s.add("노란색");
		s.add("하늘색");
		s.add("파란색");
		s.add("우유");
		s.add("빵");
		s.add("마우스");
		s.add("키보드");
		
		s.forEach(System.out::println);
		

	}

}
