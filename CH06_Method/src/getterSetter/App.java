package getterSetter;

public class App {

	public static void main(String[] args) {
		// 인스턴스 뱐수에 접근하는 메소드 get 과 set
		Person p1 = new Person();
		// 보안 상 객체의 변수에 바로 접근하지 못함
//		p1.name = "펭수";
		p1.setName("펭수");
		System.out.println(p1.getName());
		
		p1.setage(777777);
		System.out.println(p1.getage());
		
		Person p2 = new Person();
		
		p2.setName("길동");
		System.out.println(p2.getName());
		
		p2.setage(66666);
		System.out.println(p2.getage());

	}

}
