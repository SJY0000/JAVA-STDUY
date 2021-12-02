package anonymous_Class;

public class App {
	private String name = "펭수";

	private void start() {
//		System.out.println(name);
//		Runnable runner = new Runnable() { // Runnable은 인터페이스 라서 직접적으로 객체를 못 만드는데
//			@Override							// 보통 클래스에 implements Runnnable로 사용
//			public void run() {					// 익명클래스를 사용하여 바로 추상메소드를 만들 수 있다.
//				System.out.println(name);
//			}				
//		};
//		Runnable runner2 = new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("헬로우" + name);
//			}
//		};
//		
//		runner.run();
//		runner2.run();
//		activate(runner);
//		activate(runner2);
		
		// 매개변수로 인터페이스의 객체가 입력일 경우
		// 익명클래스를 이용해 바로 작성가능
		activate(new Runnable() {

			@Override
			public void run() {
				System.out.println(name);
			}
			
		});
	}
	
	public void activate(Runnable runnable) {
		runnable.run(); // run()은 인터페이스의 추상메소드이며 실행
	}

	public static void main(String[] args) {
		// 익명클래스는 이름없는 클래스
		new App().start();
	}

}
