package gui;

import java.awt.Color;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

import listeners.LokaleEgenskaberListener;
import listeners.StartStopListener;


public class LocalPanel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	public static final LocalPanel instance = new LocalPanel();

	public LocalPanel() {
		super();
		this.setLayout(null);
		this.setBackground(Color.white);
		Border blackline = BorderFactory.createRaisedBevelBorder();
		this.setBorder(blackline);
		this.setBounds(20, 0, 760, 495);
		
		this.add(TimeSeddelTabs.instance);
		
		JButton startstop = new JButton("Start/Stop");
		startstop.setBounds(600, 453, 100, 30);
		startstop.addActionListener(StartStopListener.instance);
		this.add(startstop);
		
		JButton lokaleegenskaber = new JButton("Lokale egenskaber");
		lokaleegenskaber.setBounds(40, 453, 150, 30);
		lokaleegenskaber.addActionListener(LokaleEgenskaberListener.instance);
		this.add(lokaleegenskaber);
	}
}
