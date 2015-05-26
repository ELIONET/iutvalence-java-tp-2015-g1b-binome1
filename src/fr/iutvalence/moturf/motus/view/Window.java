package fr.iutvalence.moturf.motus.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Window extends JFrame {
	
	private final static int WIDTH = 600;
	private final static int HEIGHT = 800;
	
	private JPanel mainPanel;
	
	private PanelTextEntry textArea;
	


	public Window() {
		JButton button = new JButton("test");
		JFrame window = new JFrame();
		PanelTextEntry paneltext = new PanelTextEntry();
		window.setTitle("Motus");
		window.setSize(WIDTH, HEIGHT);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainPanel.add(button);
		window.setVisible(true);
	}

}
