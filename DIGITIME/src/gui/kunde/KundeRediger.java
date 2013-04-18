package gui.kunde;

import java.awt.Color;

import javax.swing.JFrame;

public class KundeRediger extends JFrame{
	
	private static final long serialVersionUID = 1L;

	public static final KundeNy instance = new KundeNy();

	public KundeRediger() {
		setBackground(Color.white);  		
		this.setSize(430, 330);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.add(KundeNy.kundeComponents());

	}
}
