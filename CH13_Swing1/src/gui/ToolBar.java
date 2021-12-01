package gui;

import javax.swing.JButton;
import javax.swing.JToolBar;

public class ToolBar extends JToolBar {
	private static final long serialVersionUID = 1L;
	
	public ToolBar() {
		add(new JButton("버튼 1"));
		add(new JButton("버튼 2"));
	}
	
}
