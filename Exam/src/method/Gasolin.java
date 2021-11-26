package method;

public class Gasolin {
	public static double cal(double gasoline, double distance) {
	return distance / gasoline;
	}
	
	public static void main(String[] args) {
		// 가솔린 8.86L를 충전한 A 자동차는 총 182.736km를 운행할 수 있다고 한다.
		// 이 차의 연비를 계산하는 메소드를 완성하고, 출력 예와 같은 결과를 얻으시오.
		
		double gasoline = 8.86;
		double distance = 182.736;
		double efficiency = cal(gasoline, distance);
		
		System.out.printf("연비 : %.2f km/L", efficiency);
	}
}
