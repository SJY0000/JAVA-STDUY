package Application;

public class Final {

	public static void main(String[] args) {
		// 변수 앞에 final이 붙으면 상수(변하지 않는 값)
		final int VALUE = 9; // 상수는 대문자로 적는 것이 좋음
		// VALUE = 10; 상수는 값을 대입할 수 없다.
		
		System.out.println(VALUE);
		
		final String USER_PASSWORD = "abc";
		// USER_PASSWORD = "ABC";
		
		System.out.println(USER_PASSWORD);

	}

}
