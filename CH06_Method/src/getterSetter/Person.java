package getterSetter;

public class Person {
	// private는 같은 클래스에서만 접근가능
	private String name;
	private int age;
	
	// public은 다른 클래스에서 쓸 수 있음
	// set은 값을 입력하는 메소드
	public void setName(String name) {
		// this.name에서 this는 위의 String name을 의미, 객체를 의미
		this.name = name; // 이 때 this는 인스턴스
	}
	
	// get메소드는 값을 return하는 메소드
	public String getName() {
		return name;
	}
	
	public void setage(int age) {
		System.out.println(this);
		this.age = age;
	}
	public int getage() {
		System.out.println(this);
		return age;
	}
}
