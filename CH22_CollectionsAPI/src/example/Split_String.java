package example;

public class Split_String {

	public static void main(String[] args) {
		// split() 문자열 쪼개서 배열로 리턴, 특수문자, 공백 제외
		 String text1 = "The new rule would bring digital assets closer under the regulatory radar as records would be left in cross-border transactions.";
		 String text2 = "이번 수능이 전체적으로 어려워 난이도 조절에 사실상 실패했다는 지적에 대해 강 원장은 \"수험생이 어렵다고 체감한 것 자체가 상당히 중요한 사인\"이라며 \"수험생들이 그렇게 느낀 것에 책임을 느낀다\"고 답했다.";

//		 String[] words = text1.split(" "); // 스페이스바 기준 쪼갬  
//		 String[] words = text1.split("[^a-zA-Z]+");// 정규표현식, 영문철자를 제외한 특수문자 스페이스 점 슬래시 같은 것들을 제외하고 단어만 리턴
		 												// [] 정규표현식 시작, ^뒤에나오는 것들을 제외한다
		 String[] words = text2.split("[^가-힣]+");
		 
		 for (String w : words) {
			 if (w.length() < 3) { // 철자가 2개 이하는 제외
				 continue;
			 }
			 System.out.println(w.toLowerCase());
		 }
	
	}													
	

}
