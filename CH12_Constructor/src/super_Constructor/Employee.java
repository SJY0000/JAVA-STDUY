package super_Constructor;

public class Employee extends Person {
	public Employee() { // 부모 클래스가 먼저 실행된다.
		super("익명"); // 부모클래스의 생성자(여기선 Person()), 상속을 받았을 경우에는 이것이 생략되어 있다 // 실행 1번
		System.out.println("Employee 생성자"); // 실행 2번
	}
	public Employee(String name) {
		super(name);
		System.out.println("Employee 생성자");
	}
}
