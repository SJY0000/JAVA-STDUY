package Application;

public class Problem3 {

	public static void main(String[] args) {
		// 홍팍이는 100미터를 18초에 달렸다. 위 기록을 시속으로 변환하여 출력하시오.
		
		double meter = 100;
		double sec = 18;
		double fast = 0;
		
		// 시속이 km/h 
		
		fast = (meter / 1000) / (sec / 3600);
		
		System.out.printf("%.1fkm/h",fast);

	}

}
