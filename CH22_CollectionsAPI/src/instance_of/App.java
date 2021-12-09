package instance_of;

import java.io.Serializable;

class Creature implements Serializable {
	private static final long serialVersionUID = 1L;
	
}
class Cat extends Creature {
	private static final long serialVersionUID = 1L;
	
}

public class App {

	public static void main(String[] args) {
		// instance of : 객체의 타입을 판별해서 클래스의 객체가 맞으면 true 아니면 false
		Creature c1 = new Creature();
		Object c2 = c1;
		
		Cat c3 = new Cat();
		Serializable c4 = (Serializable) c3;
		
		System.out.println(c1 instanceof Object); // Object가 부모클래스이므로 객체가 맞음, 상속 extends, Object가 상위 객체
		System.out.println(c1 instanceof Serializable);// interface 구현을 했으므로 객체가 맞음, implements, Serializable이 상위 객체
		System.out.println(c1 instanceof Creature); // 본인 클래스
		System.out.println(c1 instanceof Cat);

		System.out.println();
		System.out.println(c2 instanceof Object); // Object가 부모클래스이므로 객체가 맞음, 상속 extends, Object가 상위 객체
		System.out.println(c2 instanceof Serializable);// interface 구현을 했으므로 객체가 맞음, implements, Serializable이 상위 객체
		System.out.println(c2 instanceof Creature); // 본인 클래스
		System.out.println(c2 instanceof Cat);
		
		System.out.println();
		System.out.println(c3 instanceof Object); // Object가 부모클래스이므로 객체가 맞음, 상속 extends, Object가 상위 객체
		System.out.println(c3 instanceof Serializable);// interface 구현을 했으므로 객체가 맞음, implements, Serializable이 상위 객체
		System.out.println(c3 instanceof Creature); // 본인 클래스
		System.out.println(c3 instanceof Cat);
		
		System.out.println();
		System.out.println(c4 instanceof Object); // Object가 부모클래스이므로 객체가 맞음, 상속 extends, Object가 상위 객체
		System.out.println(c4 instanceof Serializable);// interface 구현을 했으므로 객체가 맞음, implements, Serializable이 상위 객체
		System.out.println(c4 instanceof Creature); // 본인 클래스
		System.out.println(c4 instanceof Cat);
	}

}
