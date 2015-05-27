package fr.iutvalence.moturf.motus.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class IngameGrid extends JFrame {
	
	JPanel Moturf = new JPanel();
	MotusButtons buttons[]=new MotusButtons[56];
	
	public static void main(String args[]){
		new IngameGrid();
	}
	
	public IngameGrid(){
		super("IngameGrid");
		setSize(600,600);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		Moturf.setLayout(new GridLayout(7,8));
		for(int i=0; i<56;i++){
			buttons[i]=new MotusButtons();
			Moturf.add(buttons[i]);
		}
		add(Moturf);
		setVisible(true);
		
	}
}
