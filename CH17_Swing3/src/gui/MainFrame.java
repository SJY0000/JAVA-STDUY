package gui;

import java.awt.BorderLayout;
//import java.awt.Color;

import javax.swing.JFrame;
//import javax.swing.JPanel;

public class MainFrame extends JFrame {
	
	private static final long serialVersionUID = 1L;

	public MainFrame(String title) { // 생성자
		super(title); // JFrame(title);과 같은의미, 창의 이름을 넣어서 생성
		// 패널 넣기
		// 먼저 layout 설정
		setLayout(new BorderLayout()); // 창에 component를 붙이기 위한 Layout 설정
		// 패널 생성
//		JPanel panel = new JPanel();
		// 패널의 배경 색상 설정
//		panel.setBackground(Color.green);
		// 위에서 만든 패널을 layout의 가운데 붙이기
		final MainPanel mainPanel = new MainPanel(); // final 떼도 작동은 가능
		
		
		
		add(new ToolBar(mainPanel), BorderLayout.NORTH);
		add(mainPanel, BorderLayout.CENTER);
		
		setSize(600, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}
}
