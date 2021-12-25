package test;

import java.util.Random;

public class Test {

	public static void main(String[] args) {
		String a = "asdf";
		String b = "asdf";
		
		Random random = new Random();
		System.out.println(!(a.equals(b)));
		
		int c = random.nextInt(10)+1;
		System.out.println(c);

	}

}
