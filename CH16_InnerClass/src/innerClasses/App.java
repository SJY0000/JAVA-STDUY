package innerClasses;

public class App implements Runnable {
	private String name = "미키 마우스";

	private void start() {
		// activate 메소드를 사용해서 이너클래스들로 실행하는 방법
		// 1. App 인터페이스 Runnable을 구현해서 실행
		activate(this);
		// 2. 익명클래스
		activate(new Runnable() {

			@Override
			public void run() {
				System.out.println(name); // 2번 실행결과 여기 출력
			}

		});
		// 3. 메소드 이너 클래스
		class Runner1 implements Runnable {

			@Override
			public void run() {
				System.out.println(name);

			}

		}
		activate(new Runner1()); // 3번 실행결과 여기 출력
	}

	public void activate(Runnable runnable) {
		runnable.run();
	}

	@Override
	public void run() {
		System.out.println(name); // 1번 실행결과 여기 출력

	}

	public static void main(String[] args) {
		new App().start();

	}

}
