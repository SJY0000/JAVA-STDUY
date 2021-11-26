package casting;

public class App {

	public static void main(String[] args) {
		// 캐스팅 실습
		Cat cat1 = new HouseCat(); // 객체는 HouseCat
//		Cat cat1 = new Cat(); // HouseCat이 아니면 밑의 다운캐스팅에서 HouseCat으로 캐스팅 할 경우 에러가 남 
		cat1.vocal();
		cat1.hunt();
//		cat1.call(); // cat1은 Cat타입이기때문에 Cat 클래스에 없는 메소드 사용불가
						// 오버라이딩은 가능
		// 다운 캐스팅
		HouseCat cat2 = (HouseCat)cat1; // 컴파일러가 에러 표시를 해주지 않기 때문에 실시간 에러 발생
		cat2.call();
//		cat2.vocal();
	}
}