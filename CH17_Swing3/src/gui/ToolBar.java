package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JToolBar;

class ColorButtonListener implements ActionListener {
	private MainPanel mainPanel;
	private Color c;
	
	public ColorButtonListener(MainPanel mainPanel, Color c) {
		this.mainPanel = mainPanel;
		this.c = c;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
//		System.out.println("빨간색 버튼 클릭");
		mainPanel.setBackground(c);
	}
}

//class BlueButtonListener implements ActionListener {
//	private MainPanel mainPanel;
//
//	public BlueButtonListener(MainPanel mainPanel) {
//	this.mainPanel = mainPanel;
//	}
//	@Override
//	public void actionPerformed(ActionEvent e) {
////		System.out.println("파란색 버튼 클릭");
//		mainPanel.setBackground(Color.blue);
//
//	}
//
//}

public class ToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;

	public ToolBar(MainPanel mainPanel) {
		final JButton RedButton = new JButton("RED");
		final JButton BlueButton = new JButton("BLUE");
		final JButton GreenButton = new JButton("Green");
		// 버튼에 이벤트를 연결('클릭' 이벤트)
		RedButton.addActionListener(e-> mainPanel.setBackground(Color.RED));			
	
		BlueButton.addActionListener(e-> mainPanel.setBackground(Color.BLUE));
			
		GreenButton.addActionListener(e-> mainPanel.setBackground(Color.GREEN));
	

		add(RedButton);
		add(BlueButton);
		add(GreenButton);
	}

}
