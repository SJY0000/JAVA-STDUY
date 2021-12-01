package this_Constructor;

public class App {

	public static void main(String[] args) {
		Person p1 = new Person();
		System.out.println(p1); // p.toString() 생략됨
		Person p2 = new Person("홍길동");
		System.out.println(p2); // p.toString() 생략됨
		Person p3 = new Person("펭수", 5);
		System.out.println(p3); // p.toString() 생략됨

	}

}
