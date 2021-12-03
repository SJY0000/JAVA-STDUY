package enum_Methods;

public class App {

	public static void main(String[] args) {
		// enum에서 사용하는 메소드
		
		Fruit[] fruits = Fruit.values(); // values() =>  enum의 모든 상수들을 배열로 선언
		
		for (Fruit f : fruits) { // Fruit 타입의 변수 f fruits배열의 데이터 하나씩 삽입
			System.out.println(f);
			
		}
		// 위 전부와 같다.
		for (Fruit f : Fruit.values()) { // Fruit 타입의 변수 f fruits배열의 데이터 하나씩 삽입
			System.out.println(f);
			
		}
		System.out.println("--------------------");
		// ordinal() : enum의 상수들의 순서 (index 순서)
		System.out.println(Fruit.BANANA.ordinal());
		System.out.println(Fruit.APPLE.ordinal());
		System.out.println(Fruit.ORANGE.ordinal());
		
		System.out.println("--------------------");
		// valueOf("상수값") : 상수값과 같은 enum을 찾음
		Fruit f1 = Fruit.valueOf("ORANGE");
		System.out.println(f1);
		System.out.println(f1 == Fruit.ORANGE);
		

	}
}
