package application;

import collections.Wrapper;
import heirarchy.Cat;
import heirarchy.Creature;
import heirarchy.Mammal;

public class App2 {

	public static void main(String[] args) {
		Wrapper<Cat> wrap1 = new Wrapper<>(); // 뒤에는 안적어도 됨
		Wrapper<Creature> wrap2 = new Wrapper<>(); // 뒤에는 안적어도 됨
		Wrapper<Mammal> wrap3 = new Wrapper<>(); // 뒤에는 안적어도 됨
		
		Cat cat = new Cat("마틸다");
		Creature cr = new Creature("크리처");
		Mammal mam = new Mammal("포유류");
		
		//	wrapper.set(Object object); // Object 는 객체 타입 이기때문에 객체라면 무엇이든 넣을 수 있음
		wrap1.set(cat);
		wrap2.set(cr);
		wrap3.set(mam);
		
//		Cat c1 =(Cat) wrapper.get();
		Cat c1 = wrap1.get();
		Creature c2 = wrap2.get();
		Mammal m1 = wrap3.get();
		// return이 Object 타입이기 때문에 형변환 (Cat)
		// cat은 String 타입으로 Object 타입의 하위타입이라 하위타입으로 변환시켜줘야 사용 가능
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(m1);
		
		cr.feed();

	}

}
