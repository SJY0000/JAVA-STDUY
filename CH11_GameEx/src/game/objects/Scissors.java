package game.objects;
//보, GameObject 상속
public class Scissors extends GameObject {
	// 가위(0) 바위(1) 보(2) 아이디
	public Scissors() {
		setId(0); // 아이디를 0으로 설정
		setName("가위");
	}
}
