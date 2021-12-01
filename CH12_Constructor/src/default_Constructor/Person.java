package default_Constructor;

public class Person {
	private String name; // 이름
	private int age; // 나이
	
	public Person() {
		System.out.println("default 생성자로 생성됨");
		name = "모름";
		age = 0;
	}
	
	public Person(String name) { // 생성자는 클래스 이름과 같고 return타입이 없음
		System.out.println("새 person이 생성됨");
		this.name = name;
		age = 0;
	}
	public Person(String name, int age) { // 생성자는 클래스 이름과 같고 return타입이 없음
		System.out.println("새 person이 생성됨");
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() { // 객체의 정보를 출력
		return "Person [name=" + name + ", 나이 =" + age + "]";
	}
}
