package application;

public class StringArray2 {

	public static void main(String[] args) {
		// 문자열은 참조 자료형, 참조 변수(reference variable)은 주소값을 가진다.
		String text = null; // null 값은 주소값이 없다라는 의미
//		int x = null; 오류 생김, 기본 자료형에는 null 값을 입력불가(null은 주소가 없다는 뜻)
//		text = new String("헬로우");
		text = "헬로우";
		System.out.println(text);
		
		String[] texts = null;
		System.out.println(texts);
		texts = new String[3]; // 문자열 배열 3칸을 생성하여 text에 주소입력
		
		System.out.println(texts);
		System.out.println(texts[0]);
		System.out.println(texts[1]);
		System.out.println(texts[2]);
		
		System.out.println("==========");
		texts[0] = new String("하이");
		texts[1] = "안녕 ?";
		texts[2] = "굿 바이!";
		
		for (String x : texts) {
			System.out.println(x);
		}

	}

}
