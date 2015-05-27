package fr.iutvalence.moturf.motus.view;

import java.awt.Dimension;
import java.awt.Color;

import javax.swing.JButton;

import fr.iutvalence.moturf.motus.GuessColor;

public class MotusButtons extends JButton{
	
	private GuessColor guesscolor;
	private Color color;

	public MotusButtons(){
	
		setEnabled(false);
		setPreferredSize(new Dimension(50, 50));
		setBackground(guessColorIntoColor(GuessColor.GREEN));
			
	}
	
	private Color guessColorIntoColor(GuessColor guessColor){
		if(guessColor==GuessColor.GREEN)
			return Color.green;
		if(guessColor==GuessColor.ORANGE)
			return Color.orange;
		else
			return Color.gray;
		
	}

}
