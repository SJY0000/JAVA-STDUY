package example;


import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App {
	public static void greet() { // static 메소드는 객체 생성없이 사용가능
		System.out.println("헬로우!");
	}
	
	public static void main(String[] args) {
		// Method Reference (static 메소드를 만들어 사용)
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
									// 여기에 Runnable 타입 적어야하는데 람다식으로 대체가능
//		service.scheduleAtFixedRate(() -> System.out.println("헬로우!"), 0, 1000, TimeUnit.MILLISECONDS);
								// 클래스명::메소드명 (static 메소드가 있을 때
		service.scheduleAtFixedRate(App::greet, 0, 1000, TimeUnit.MILLISECONDS);

	}

}
