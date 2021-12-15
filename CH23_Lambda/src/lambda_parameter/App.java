package lambda_parameter;

interface Runner {
	void execute(String t); // 추상메소드에 매개변수가 있는 경우
}

public class App {

	public static void main(String[] args) {
		// 매개변수가 있는 람다식
		Runner run1 = (s) -> System.out.println(s);
		run1.execute("펭수");
		
		Runner run2 = x -> System.out.println(x); // 배개변수 1개일 때 () 생략가능
		run2.execute("길동");
	}

}
