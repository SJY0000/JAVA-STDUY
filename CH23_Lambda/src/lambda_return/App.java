package lambda_return;

interface Joiner {
	String join(String text1, String text2); // 추상메소드에 return, 매개변수가 있는 경우
}

public class App {

	public static void main(String[] args) {
		// return 값이 있는 경우
		Joiner joiner = (t1, t2) -> {
			String text = t1 + " - " + t2;
			return text;
		};
		System.out.println(joiner.join("치킨", "맥주"));
		System.out.println(joiner.join("0", "0"));
		
		// 코드가 한 줄일 때 {}, return 생략가능, 둘 전부 없애야함 하나만 생략은 불가능
		Joiner joiner2 = (s1, s2) -> s1 + " + " + s2;;
		
		System.out.println(joiner2.join("치킨", "콜라"));
		System.out.println(joiner2.join("^", "^"));

	}

}
