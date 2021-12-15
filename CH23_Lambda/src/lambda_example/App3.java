package lambda_example;

interface Testt {
	void start();
}

public class App3 {

	public static void main(String[] args) {
		Testt t = () -> System.out.println("헬로우");
		t.start();

		Testt tt = () -> {
			System.out.println("가나다");
			System.out.println("타파하");
			
		};
		tt.start();
	
	}
	

}
