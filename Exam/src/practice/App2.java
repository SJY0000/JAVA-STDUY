package practice;

import javax.swing.SwingUtilities;

public class App2 {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new MainFrame("연습");
		});

	}

}
