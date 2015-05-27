package fr.iutvalence.moturf.motus.view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JPanel;

public class IngameGridPanel extends JPanel {

	JPanel Motus = new JPanel();
	MotusButtons buttons[]=new MotusButtons[56];
	
	public IngameGridPanel() {
		this.setSize(WIDTH, HEIGHT);
		Motus.setLayout(new GridLayout(7,8));
		for(int i=0; i<56;i++){
			buttons[i]=new MotusButtons();
		
			Motus.add(buttons[i]);
		}
		add(Motus);
		setVisible(true);
		
		
	}
	
}
