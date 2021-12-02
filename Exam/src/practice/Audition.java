package practice;

public class Audition {

	public static String test(double vocal, double dance) {
		return  vocal * dance >= 70.0 ? "합격" : "불합격";
	}
	
	public static void main(String[] args) {
		// 아이돌 데뷔를 위한 연습생 오디션이 개최되었다. 해당 오디션은 보컬과 댄스를 평가하여
		// 각각 최대 10.0의 점수를 받을 수 있는데 두 점수의 곱이 70.0 이상일 때 합격하게 된다.
		// 주어진 코드의 result() 메소드를 완성하여, Tom과 Kate의 합격 여부를 출력하시오.
		
		double tomVocal = 8.8;
		double tomDance = 7.6;
		double katVocal = 9.2;
		double katDance = 7.8;
		
		System.out.printf("Tom의 오디션 결과 : %s\n", test(tomVocal, tomDance));
		System.out.printf("Kate의 오디션 결과 : %s\n", test(katVocal, katDance));
		

	}

}
