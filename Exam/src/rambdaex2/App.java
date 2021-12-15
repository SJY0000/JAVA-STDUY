package rambdaex2;

interface RamdaInterface {
	void anything();
}
@FunctionalInterface
interface Calculate {
	int Cal(int n1, int n2);

	
}

public class App {

	public void sayHello() {
		System.out.println("헬로우!");
	}
	public int sum(int n1, int n2) {
		return n1 + n2;
	}
	
	public static void main(String[] args) {
		RamdaInterface hello = () -> System.out.println("헬로우!");
		
		hello.anything();
		
		Calculate pluse = (n1, n2) -> n1 + n2;
		System.out.println(pluse.Cal(10, 10));
		
		Calculate div = (n1, n2) -> (n2 == 0)? 0: n1/n2;
		System.out.println(div.Cal(10, 2));
		
		Calculate a = (n1, n2) -> (n1 > n2)? n1 * n2 : n2 * n2;
		System.out.println(a.Cal(5, 8));

	}

}
