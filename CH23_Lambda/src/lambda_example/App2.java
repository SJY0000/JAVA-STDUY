package lambda_example;

interface Runner { // functional interface
	void execute(); // 추상 메소드 1개 => 람다식 사용가능
}

public class App2 {

	public static void main(String[] args) {
//	Runner run = () -> {}; // ()자리는 매개변수 자리 없어도 사용가능
							// {} 안에 코드를 넣거나 한줄이면 {} 생략가능 완성
		Runner run = () -> {
			System.out.println("헬로우");
			System.out.println("람다식");
		};
		run.execute();
		// 코드가 한줄이면 {}생략가능
		Runner run2 = () -> System.out.println("헬로우");
		run2.execute();
		
		System.out.println(run instanceof Runner); // run은 Runner의 객체? 맞음
		System.out.println(run.getClass()); 	// class는 람다식
	}
}
