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
	
	IngameGridPanel Moturf = new IngameGridPanel();
	
	public static void main(String args[]){
		new IngameGrid();
	}
	
	public IngameGrid(){
		setSize(400,400);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		add(Moturf);
		setVisible(true);
		
	}
	
}
