package fr.iutvalence.moturf.motus.view;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class Window extends JFrame implements Runnable {
	
	private final static int WIDTH = 600;
	private final static int HEIGHT = 800;
	
	private JPanel mainPanel;
	
	private PanelTextEntry textArea;
	
		@Override
		public void run()
		{
			JFrame window = new JFrame();

			window.setTitle("Motus");
			window.setSize(HEIGHT, WIDTH);
			
			window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

			JButton bouton = new JButton("Ok");

			window.getContentPane().add(bouton);

			window.setVisible(true);
		}
	}
