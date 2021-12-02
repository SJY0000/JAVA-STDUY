package static_InnerClass;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		
		p1.print();
		
		// 외부로 내부 클래스를 불러 올 때
		// 1. 내부클래스(외부클래스의 객체가 필요함)
		Person.Head head = p1.new Head();
		head.print();
		// 2. static 내부클래스 (외부클래스 이름.static내부클래스 이름)
		Person.Body body = new Person.Body();
		body.print();

	}

}
