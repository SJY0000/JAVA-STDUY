package timer_example;

import java.util.Timer;
import java.util.TimerTask;

class work extends TimerTask {
	@Override
	public void run() {
		System.out.println("헬로우");
	}
}

public class App2 {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new work(), 0, 1000);

	}

}
