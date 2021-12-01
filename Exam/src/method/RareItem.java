package method;

public class RareItem {

	public static void wear(int hp, int mp) {
		if (hp >= 2000) {
			if (mp >= 2000) {
				System.out.println("아이템 장착 완료!");
			} else {
				System.out.println("아이템을 착용할 수 없습니다.");
			}
		} else {
			System.out.println("아이템을 착용할 수 없습니다.");
		}
	}

	public static void main(String[] args) {
		// 체력과 마력이 동시에 2000 이상이여야만 착용 가능한 아이템이 있다.
		// 체력과 마력을 입력하여 작용 결과를 출력하는 메소드 wear()을 완성하고
		// 출력 예와 같은 결과를 얻으시오.

		RareItem r1 = new RareItem();
		RareItem r2 = new RareItem();

		r1.wear(2800, 2000);
		r2.wear(3800, 1200);

	}

}
