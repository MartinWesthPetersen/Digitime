package gui;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class LocalPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public static final LocalPanel instance = new LocalPanel();

	public LocalPanel() {
		super();
		this.setLayout(null);
		this.setBackground(Color.white);
		Border blackline = BorderFactory.createLineBorder(Color.black);
		this.setBorder(blackline);
		this.setBounds(20, 20, 760, 450);
		
		this.add(TimeSeddelTabs.instance);
	}
}
