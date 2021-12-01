package application;

import javax.swing.SwingUtilities;

import gui.MainFrame2;

public class GoodByeWorld {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> {
			new MainFrame2("연습용 스윙 창");
		});

	}

}
