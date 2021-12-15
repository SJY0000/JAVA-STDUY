package multithread3;

public class App {

	private int value = 0;

	private synchronized void increment() { // 이 메소드는 한 번에 하나의 쓰레드만 접근
		value++;
	}
	public void run() throws InterruptedException {
		Runnable runnable = () -> {
			for (int i = 0; i < 10000; i++) {
				increment(); // value를 1씩 증가
			}
		};

		// main 이랑 t1,t2 한번에 시작
		Thread t1 = new Thread(runnable); // new Thread t1생성
		Thread t2 = new Thread(runnable); // new Thread t2생성
		Thread t3 = new Thread(runnable); // new Thread t3생성

		t1.start(); // t1 실행
		t2.start(); // t2 실행
		t3.start(); // t3 실행

//		System.out.println("Value : " + value); // mainThread 실행
		
		t1.join(); // mainThread가 t1을 실행할 때까지 대기
		t2.join(); // mainThread가 t2를 실행할 때까지 대기
		t3.join(); // mainThread가 t3을 실행할 때까지 대기
		
		System.out.println("Value : " + value); // t1, t2가 끝난 다음에 출력

	}

	public static void main(String[] args) throws InterruptedException {
		// MultiThread
		new App().run(); // App 객체를 만들고 run() 메소드 실행
	}

}
