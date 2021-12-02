package timer_example4;

import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

class Alert extends TimerTask {
	@Override
	public void run() {
		JOptionPane.showMessageDialog(null, "계란 삶기 완료");
	}
}
class Task implements Runnable {
	int i = 0;
	@Override
	public void run() {
		i += 1;
		System.out.println("계란 삶는 중 " + i);
		
	}
	
}


public class App {

	public static void main(String[] args) {
		Timer timer = new Timer();
		timer.scheduleAtFixedRate(new Alert(), 30000, 30000);
		
		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);
		executor.scheduleAtFixedRate(new Task(), 5, 5, TimeUnit.SECONDS);
	}

}
