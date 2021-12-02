package local_InnerClass;

public class App {
	private String name; // 인스턴스 변수, 객체를 생성해야 사용가능함

	public App() {
		name = "엘리자베스";
	}

	private void run() {
//		System.out.println(name);
		class printer{
			public void print() {
				System.out.println(name); // 내부 클래스는 상위 클래스의 변수를 사용가능
			}
		}
		new printer().print();
	}

	public static void main(String[] args) {
//		System.out.println(name); // 사용불가
		App app = new App();
//		System.out.println(app.name);
		// app.name = "펭수";
//		System.out.println(app.name);
		app.run();
	}

}
