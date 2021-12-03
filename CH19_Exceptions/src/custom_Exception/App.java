package custom_Exception;

//import custom_Exception.exceptions.TempOutOfRangeException;
import custom_Exception.exceptions.TempTooHighException;
import custom_Exception.exceptions.TempTooLowException;

public class App {

	public static void main(String[] args) { // 메인메소드로 올림, 오류 해결 안하고 표사함
		Thermostat stat = new Thermostat();
		try {
			stat.setTemperature(55);

		} catch (TempTooHighException e) {
			// 온도 예외 발생
			// 여기는 온도가 높을 때
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} catch (TempTooLowException e) {
			// 여기는 온도가 낮을 때
//			e.printStackTrace();
			System.out.println(e.getMessage());
		} 
		
	}

}
