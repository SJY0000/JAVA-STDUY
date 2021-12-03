package method;

public class DatingApp {

	public static void main(String[] args) {
		// 한 소개팅 어플은 다음 요소를 기준으로 회원을 평가하여 
		// 점수화(0.0 ~ 5.0)한다. 성격 외모 능력을 아래의 등급 기준을 참고하여
		// 출력 예와 같은 결과를 얻으시오.
		// A - 모든 요소가 4.0 이상
		// B - 총점 10점 이상이면서, 적어도 하나가 4.0 이상
		// C - 그 외
		String x = rating(4.2, 4.7, 4.3);
		String y = rating(3.8, 4.1, 3.5);
		String z = rating(3.6, 3.0, 3.4);
		
		System.out.printf("X -> %s등급\n", x);
		System.out.printf("X -> %s등급\n", y);
		System.out.printf("X -> %s등급\n", z);

	}
	
	public static String rating(double personality, double look, double ability) {
		String result = "";
		double sum = personality + look + ability;
		
		if (personality >= 4.0 && look >= 4.0 && ability >= 4.0) {
			result = "A";
		}
		else if (sum >= 10 && personality >= 4.0 || look >= 4.0 || ability >= 4.0) {
			result = "B";
		}
		else {
			result = "C";
		}
		return result;
	}

}
