package gui;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame2 extends JFrame {
	private static final long serialVersionUID = 1L;
	
	public MainFrame2(String title) {
		super(title);
		setLayout(new BorderLayout());
		
		JPanel jp = new JPanel();
		jp.setBackground(Color.gray);
		
		add(new ToolBar2(), BorderLayout.NORTH);
		add(new MainPanel2(), BorderLayout.CENTER);
		
		setSize(500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

}
