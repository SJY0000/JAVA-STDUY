package enum_Constructor;

public enum Fruit { // keyword가 enum
	APPLE("초로오로옥색"), BANANA("노오오라아안색"), ORANGE("주우화아왕색"); // 상수들의 집합 (0, 1, 2 index 번호)
	
	private String color;
	
	Fruit(String color) { // enum의 생성자, enum은 상수가 객체라고 생각
		this.color = color;
	}
	public String toString() { // super는 상위클래스로 Fruit를 가르킴 
		// toLowercase는 대문자를 소문자로 변환시켜 출력
		return super.toString().toLowerCase() + " (" +color+ ")";
	}
}
