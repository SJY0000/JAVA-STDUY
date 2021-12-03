package custom_Exception;

//import custom_Exception.exceptions.TempOutOfRangeException;
import custom_Exception.exceptions.TempTooHighException;
import custom_Exception.exceptions.TempTooLowException;

public class Thermostat {
	// 예외처리 throws는 해당 예외처리를 이 메소드를 호출할 때 처리
	public void setTemperature(double temparature) throws TempTooLowException, TempTooHighException  {
		
		setMachineTemparature(temparature);
		
		
		System.out.println("온도 세팅 : " +temparature);
	}

	private void setMachineTemparature(double temparature) throws TempTooLowException, TempTooHighException  { 
		
		if (temparature < 0) {
			throw new TempTooLowException("너무 추췅"); // 새 예외를 생성
		}
		else if (temparature > 35) {
			throw new TempTooHighException("더워 디지겠당");
		}
	}
}
