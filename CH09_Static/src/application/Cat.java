package application;

public class Cat {
	private String name; // 이름
	
	private int id; // 아이디 (고유번호. 중복이 안됨)

	// static final은 static 상수 이다.
	public static final String FOOD = "고양이 사료";
	// static 변수 (객체들에게 공유됨)
	public static int count = 0; // 초기값 0

	public Cat(String name) {
		this.name = name;
		count++;
		id = count; // 객체가 만들어 질 때 마다 카운트 증가하면서 저장
	}

	public static int getCount() {
		// Static 메소드는 일반 인스턱스(객체) 변수 사용불가
		// String s = name; // 객체가 만들어지기 전에 사용가능하므로
		// 인스턴스 변수는 사용 할 수가 없다.
		return count; // Static 변수는 사용가능
	}

	@Override
	public String toString() {
		return "Cat [고양이 이름 =" + name + ", id=" + id + "]";
	}

//	@Override
//	public String toString() {
//		return "Cat [고양이 이름 = " + name + "]";
//	}

}
