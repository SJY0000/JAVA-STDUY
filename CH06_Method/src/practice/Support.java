package practice;

public class Support {
	private String name;
	private int age;
	private double height;
	private String adress;
	
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getAdress() {
		return adress;
	}
	
	public Support(String name, int age, double height, String adress) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.adress = adress;
	}
//	
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age + ", 키 : " + height + ", 사는 곳 : " + adress;
		
	}

}
