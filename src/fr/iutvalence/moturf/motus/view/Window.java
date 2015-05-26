package fr.iutvalence.moturf.motus.view;

import javax.swing.*;

public class Window extends JFrame implements Runnable {
	
	private final static int WIDTH = 600;
	private final static int HEIGHT = 800;
	
	private JPanel mainPanel;
	
	private PanelTextEntry textArea;
	
		@Override
		public void run()
		{
			JFrame window = new JFrame("Motus");
			window.setVisible(true);
			window.setSize(HEIGHT, WIDTH);
			window.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

			JLabel Instruction = new JLabel("Enter your guess (8 Char)");
			JPanel P1 = new JPanel();
			window.add(P1);
			P1.add(Instruction);
			
			JTextField Input = new JTextField("Type your guess here");
			P1.add(Input);
			
			
			JButton button = new JButton("Ok");
			P1.add(button);

			
		}
	}
