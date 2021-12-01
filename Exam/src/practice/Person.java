package practice;

public class Person implements Object {

	@Override
	public void run() {
		System.out.println("시작");
	}

	@Override
	public void displayDetail() {
		System.out.println("인터페이스의 디폴트 값 대신 출력");
		
	}
}