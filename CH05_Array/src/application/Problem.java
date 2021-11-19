package application;

public class Problem {

	public static void main(String[] args) {
		// 1000m 상공에서 물체를 정지상태에서 가만히 놓아 자유 낙하시키려 한다. 코드를 완성하여
		// 출력 예와 같은 결과를 얻으시오 (자유 낙하시 저항은 없고, 중력 가속도는 -9.81로 한다)
		
		double time = 5.0; //이동시간
		double gravity = -9.81; // 중력가속도
		double firstfast = 0.0; // 초기속도
		double firstposition = 1000.0; // 초기위치
		
		// 위치 = 1/2 * 가속도 * (이동시간)^2 + (초기속도 * 이동시간) + 초기위치
		double finalposition = (0.5 * gravity * time * time) + (firstfast * gravity) + firstposition;
		System.out.println(gravity * time * time);
		System.out.printf("%.2f초 후 위치 : %.2fm \n", time, finalposition);
		
		
		
	}

}
