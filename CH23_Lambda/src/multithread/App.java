package multithread;

public class App {

	public static void main(String[] args) {
		// MultiThread
		Runnable runnable = () -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("i : " + i);
				try {
					Thread.sleep(500); // 0.5초 대기
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		};
		
		// main 이랑 t1,t2 한번에 시작
		Thread t1 = new Thread(runnable);
		Thread t2 = new Thread(runnable);
		
		t1.start(); // t1 끝나고 t2가 아니라 t1, t2 동시에 시작
		t2.start();
		
		System.out.println("헬로우");
		
		
	
	}

}
