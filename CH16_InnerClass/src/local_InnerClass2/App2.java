package local_InnerClass2;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class App2 {
	private String name; // 인스턴스 변수, 객체를 생성해야 사용가능함

	public App2() {
		name = "엘리자베스";
	}

	private void run() {
//		System.out.println(name);
//		class printer implements Runnable {
//			public void print() {
//				System.out.println(name); // 내부 클래스는 상위 클래스의 변수를 사용가능
//			}

//			@Override
//			public void run() {
//				System.out.println(name);

//			}
//		}
//		new printer().print();
		ScheduledExecutorService service = Executors.newScheduledThreadPool(1);
		service.scheduleAtFixedRate(new Runnable() {
			public void run() {
				System.out.println(name);
			}
		}, 0, 1, TimeUnit.SECONDS);
	}

	public static void main(String[] args) {
//		System.out.println(name); // 사용불가
		App2 app = new App2();
//		System.out.println(app.name);
		// app.name = "펭수";
//		System.out.println(app.name);
		app.run();
	}

}
