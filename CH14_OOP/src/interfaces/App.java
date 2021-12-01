package interfaces;

public class App {

	public static void main(String[] args) {
		// 인터페이스
//		Describable ds = new Describable(); // 객체를 만들 수 없다.
		Describable[] objs = {new Person(), new Computer()};

		for (Describable ob : objs) {
			System.out.println(ob.getDescription());
		}
	}

}
