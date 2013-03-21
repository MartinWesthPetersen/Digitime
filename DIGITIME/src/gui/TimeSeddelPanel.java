package gui;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class TimeSeddelPanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public TimeSeddelPanel() {
		super();
		this.setLayout(null);
		this.setBackground(Color.white);
		this.add(new TimeSeddel(10,7));
		Border blackline = BorderFactory.createLineBorder(Color.red);
		this.setBorder(blackline);
	}
}
