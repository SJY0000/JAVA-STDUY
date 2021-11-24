package parameter;

public class App {

	public static void main(String[] args) {
		// 매개변수(parameter)가 있는 method 사용
		Calculator cal = new Calculator();
		int number = 5;
		int result = cal.square(number);
		
		System.out.println(result);
		
		result = cal.plus(10, 10);
		System.out.println(result);
		
		result = cal.minus(10, 5);
		System.out.println(result);
		
		result = cal.multi(10, 10);
		System.out.println(result);
	}

}
