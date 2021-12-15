package examplemap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

//import javax.swing.InputMap;

class Person implements Comparable<Person> {
	// Person의 이름으로 equals 메소드를 만들어 key값의 중복을 이름으로 하도록 한다.
	private String name;
	
	public Person(String name) {
		this.name = name;
	}
	
	public String toString() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return Objects.equals(name, other.name);
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.name); // 이름으로 비교
	}
	
}

public class App {
	public static void main(String[] args) {
		// Map을 이용한 예제
		Map<Person, Boolean> people1 = new HashMap<>();
		Map<Person, Boolean> people2 = new LinkedHashMap<>();
		Map<Person, Boolean> people3 = new TreeMap<>();
		
		// Map에서 key값을 중복으로 결정하는데 Person클래스에서 equals 메소드를 만들어
		// 이름이 같으면 중복이 되게 수정
		InputMap(people1);
		displayMap(people1);
		
		System.out.println("================");
		InputMap(people2);
		displayMap(people2);
		
		// TreeMap은 정렬하는데 이 때 key값인 Person 클래스에서 Comparable Interface를 구현해야 한다.
		System.out.println("================");
		InputMap(people3);
		displayMap(people3);

	}

	private static void displayMap(Map<Person, Boolean> map) {
		// Map의 키와 value값을 출력한다.
		System.out.println();
		map.forEach((k, v) -> System.out.println(k + " : " + v));
		System.out.println();
		
	}

	private static void InputMap(Map<Person, Boolean> map) {
		// Map에 Person객체와 Boolean을 입력(원격여부)
		map.put(new Person("펭수"), true);
		map.put(new Person("길동"), true);
		map.put(new Person("라이언"), false);
		map.put(new Person("둘리"), false);
		map.put(new Person("라이언"), false); // 똑같은 이름은 중복안됨
		map.put(new Person("둘리"), true); // 둘리는 업데이트 됨 (value 값이 false에서 true)
		
	}

}
