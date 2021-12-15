package lambda_parameter2;

interface Runner {
	void execute(String name, String text); // 추상메소드에 매개변수가 있는 경우
}

public class App {

	public static void main(String[] args) {
		// 매개변수가 있는 람다식, 매개변수 나 코드가 2개 이상일 경우 (),{} 생략불가
		Runner run1 = (n, t) -> System.out.printf("%s님 %s",n, t);
		run1.execute("펭수", "안녕하세요");
		
	}

}
