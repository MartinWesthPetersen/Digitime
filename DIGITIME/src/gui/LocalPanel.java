package gui;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
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
		Border blackline = BorderFactory.createRaisedBevelBorder();
		this.setBorder(blackline);
		this.setBounds(20, 0, 760, 500);
		
		this.add(TimeSeddelTabs.instance);
		
		JButton startstop = new JButton("Start/Stop");
		startstop.setBounds(600, 455, 100, 30);
		this.add(startstop);
		
		JButton lokaleegenskaber = new JButton("Lokale egenskaber");
		lokaleegenskaber.setBounds(40, 455, 150, 30);
		lokaleegenskaber.addActionListener(LokaleEgenskaberListener.instance);
		this.add(lokaleegenskaber);
	}
}
