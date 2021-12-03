package throwing_Exception2;

public class App {

	public static void main(String[] args) throws Exception { // 메인메소드로 올림, 오류 해결 안하고 표사함
		Thermostat stat = new Thermostat();
		try {
			stat.setTemperature(36);

		} catch (Exception e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
	}

}
