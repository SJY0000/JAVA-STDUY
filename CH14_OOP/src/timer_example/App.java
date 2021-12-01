package timer_example;

import java.util.Timer;
import java.util.TimerTask;

class Task extends TimerTask{
	@Override
	public void run() {
		System.out.println("헬로우");
	}
}

public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Task(), 0, 1000); // 시작할 일, 몇 초뒤에 시작할 것인지, 1000은 1초에 한 번씩 반복
		
		

	}

}
