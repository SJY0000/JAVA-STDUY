package throwing_Runtime_Exception;

public class Thermostat {
	// runtime 예외는 예외처리를 하지 않아도 된다.
	public void setTemperature(double temparature) {
		
		if (temparature < 0 || temparature > 35) {
			throw new RuntimeException("온도가 비정상 입니다."); // 새 예외를 생성
			// 실행하면 발생하는 오류이기 때문에 문법상에서는 오류가 나타나지 않는다.
		}
		
		System.out.println("온도 세팅 : " +temparature);
	}
}
