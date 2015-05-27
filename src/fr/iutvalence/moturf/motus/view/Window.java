package fr.iutvalence.moturf.motus.view;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * GameWindow class.
 *
 * @author dottc
 * @version 1.0.0
 */


public class Window extends JFrame implements Runnable, ActionListener {
	
	/**
	 * Width of the window
	 */
	
	private final static int WIDTH = 600;
	
	/**
	 * Height of the window 
	 */
	private final static int HEIGHT = 800;
	
	/**
	 * ONLY TO DEBUG
	 */
	
	private JLabel Output = new JLabel("Test");
	
	/**
	 * Input Panel (Above) and grid panel (Below)
	 */
	
	private JPanel P1, P2;
	
	/**
	 * Field where the player put its guess
	 */
	
	private JTextField Input = new JTextField(10);
	
	/**
	 * Splits The grid and the input
	 */
	private JSplitPane Split;
	
		@Override
		public void run()
		{
			
			P1 = new JPanel();
			P2 = new JPanel();
			setResizable(false);
			this.add(P1);
			this.setTitle("Motus");
			Split = new JSplitPane(JSplitPane.VERTICAL_SPLIT, P1, P2);
			this.add(Split);
			Split.setSize(WIDTH, HEIGHT);
			P2.add(new IngameGridPanel());
			
			JLabel Instruction = new JLabel("Enter your guess (8 Char)");
			P1.add(Instruction);
			
			P1.add(Input);
			
			JButton button = new JButton("Ok");
			P1.add(button);
			button.addActionListener(this);
			
			P1.add(Output);
			
			getContentPane().add(Split);		
			this.setSize(WIDTH, HEIGHT);
			this.pack();
			this.setVisible(true);

			
		}

		/**
		 * Action event on the press of the OK button
		 * Return the guess
		 * @param e
		 */
		
		@Override
		public void actionPerformed(ActionEvent e) {
			Output.setText("Vous avez entré " + Input.getText() );
		}
	}
