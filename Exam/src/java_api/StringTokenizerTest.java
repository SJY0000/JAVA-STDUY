package java_api;

import java.util.StringTokenizer;

public class StringTokenizerTest {

	public static void main(String[] args) {
		// 홍팍이가 좋아하는 음식 목록을 쉼표로 구분한 문자열로 만들었다.
		// String str = "치킨, 피자, 보쌈, 족발, 초밥, 떡볶이, 탕수육";
		// StringTokenizer 객체를 활용하여 출력 예와 같은 결과를 얻으시오.
		
		String str = "치킨, 피자, 보쌈, 족발, 초밥, 떡볶이, 탕수육";
		String a = ", ";
		
		StringTokenizer st = new StringTokenizer(str, a);
		
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		String b = "치킨, 피자3; 탕수육. 만두! 국수, 빵";
		String c = ", ;!.빵만두3"; // 안에 들어있는거 무엇이든 제외시키고 출력 
		
		StringTokenizer st2 = new StringTokenizer(b, c);
		
		while (st2.hasMoreTokens()) {
			System.out.println(st2.nextToken());
		}
	}

}
