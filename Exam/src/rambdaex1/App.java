package rambdaex1;

public class App {

	public static void walking(Walkable any) {
		any.walk();
	}

	public static void main(String[] args) {
		Human tom = new Human();
		
		walking(tom);
		
		Robot sam = new Robot();
		
		walking(sam);
		
//		walking(new Walkable() {
//			
//			@Override
//			public void walk() {
//				System.out.println("이름없는 클래스 객체가 걷는다.");
//				
//			}
//		});
//		walking(() -> System.out.println("이름없는 클래스 객체가 걷는다."));
//		
//		walking(() -> {
//			System.out.println("두 줄 이상일때는 {} 필요");
//			System.out.println("이름 없는 클래스 객체가 걷는다.");
//		});
//		
		Walkable ramda = () -> {
			System.out.println("두 줄 이상일때는 {} 필요");
			System.out.println("이름 없는 클래스 객체가 걷는다.");
		};
		walking(ramda);

	}

}
