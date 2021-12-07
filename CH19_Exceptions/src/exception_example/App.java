package exception_example;

public class App {

	public static void main(String[] args) throws InterruptedException { // 예외 처리 
		// 자바 예외
		System.out.println("하나");
		Thread.sleep(2000); // 2초 대기 => 예외 처리 해야함
		System.out.println("둘");
	}

}
