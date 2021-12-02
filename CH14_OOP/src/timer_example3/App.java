package timer_example3;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Alert extends TimerTask{
	@Override
	public void run() {
		System.out.println("타이머 1 헬로우!");
	}
}
class Task implements Runnable {

	@Override
	public void run() {
		System.out.println("타이머 2 하이!");
		
	}
	
}

public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 0, 1000); // 시작할 일, 몇 초뒤에 시작할 것인지, 1000은 1초에 한 번씩 반복
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task(), 0, 1, TimeUnit.SECONDS);

	}

}
