package intigervariable;

public class problem {

	public static void main(String[] args) {
		// john의 개발자 적성 검사 결과가 아래와 같이 나왔다고 합니다.
		// 수학 : 96점, 과학 : 88점, 영어 : 76점

		int a = 96;
		int b = 88;
		int c = 76;

		System.out.println("수학 : " + a);
		System.out.println("과학 : " + b);
		System.out.println("영어 : " + c);

		// Tom은 아침에 샌드위치를 팔아 용돈벌이를 시작했다. 이번 한 주간 수입은 다음과 같다.
		// 월 $ 8.62
		// 화 $ 10.23
		// 수 $ 12.48
		// 목 $ 7.82
		// 금 $ 9.54
		// 월요일부터 금요일까지 얻은 총 수입은 얼마인지 출력하시오
		
		double x = 8.62;
		double y = 10.23;
		double z = 12.48;
		double g = 7.82;
		double h = 9.54;
		double j = x + y + z + g + h;
		
		System.out.println("총 수입은 : $" + j);
		
	
	}

}
