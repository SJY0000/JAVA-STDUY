package returnValue;

public class App {

	public static void main(String[] args) {
		// return 값이 있는 Method
		
		ReturnMethod r1 = new ReturnMethod();
		
		String cat = r1.getAnimal();
		System.out.println("캣 변수는 : " + cat);

	}

}
