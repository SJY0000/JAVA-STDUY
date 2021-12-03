package throwing_Exception2;

public class Thermostat {
	// 예외처리 throws는 해당 예외처리를 이 메소드를 호출할 때 처리
	public void setTemperature(double temparature) throws Exception {
		
		setMachineTemparature(temparature);
		
		
		System.out.println("온도 세팅 : " +temparature);
	}

	private void setMachineTemparature(double temparature) throws Exception { 
		
		if (temparature < 0 || temparature > 35) {
			throw new Exception("온도가 비정상 입니다."); // 새 예외를 생성
		}
		
	}
}
