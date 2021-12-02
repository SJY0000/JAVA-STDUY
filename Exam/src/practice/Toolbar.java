package practice;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class ColorButtonLisentener implements ActionListener {
	private MainPanel mainPanel;
	private Color c;
	
	public ColorButtonLisentener(MainPanel mainPanel, Color c) {
		this.mainPanel = mainPanel;
		this.c = c;
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		mainPanel.setBackground(c);
		
	}
	
}

public class Toolbar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	public Toolbar(MainPanel mainPanel) {
		final JButton redButton = new JButton("빨강"); 
		final JButton blueButton = new JButton("파랑"); 
		final JButton greenButton = new JButton("초록");
		
		redButton.addActionListener(new ColorButtonLisentener(mainPanel, Color.RED));
		blueButton.addActionListener(new ColorButtonLisentener(mainPanel, Color.BLUE));
		greenButton.addActionListener(new ColorButtonLisentener(mainPanel, Color.GREEN));
		
		add(redButton);
		add(blueButton);
		add(greenButton);
		
	}

}
