package school;

public class Student {
	private String name;
	private int age;
	private boolean visible; // 집체 true 원격 false
	private double temparature; // 온도 체크
	
	// 자동완성 기능으로 getter setter 메소드 완성
	// 오른족 클릭 => 소스 =>generate getter setter 클릭
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVisible() {
		return visible;
	}
	public void setVisible(boolean visible) {
		this.visible = visible;
	}
	public double getTemparature() {
		return temparature;
	}
	public void setTemparature(double temparature) {
		this.temparature = temparature;
	}
	
	// 생성자
	// 오른쪽 클릭 => 소스 => generate contrutor using field
	public Student(String name, int age) {
		visible = true;
		temparature = 0.0;
		this.name = name;
		this.age = age;
	}
	
	// toString 메소드
	// 오른쪽 클릭 => 소스 => generate toString()
	@Override
	public String toString() {
		return "학생 [이름 = " + name + ", 나이 = " + age + ", 집체 = " + visible + ", 온도 = " + temparature + "]";
	}
	
	
	
	
	

}
