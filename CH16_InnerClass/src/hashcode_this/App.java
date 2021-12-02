package hashcode_this;

public class App {

	public static void main(String[] args) {
		Fox fox1 = new Fox();
		System.out.println(fox1);
		System.out.println(fox1.toString());
		System.out.printf("%x \n", fox1.hashCode()); 
		System.out.println(fox1.hashCode()); // 16진수로 변환해서 출력
		
		Fox fox2 = fox1;
		System.out.println(fox2);
		System.out.println(fox2.name);

	}

}
