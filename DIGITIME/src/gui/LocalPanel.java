package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
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
		
		JButton close = new JButton("Arkivér og luk timeseddel");
		close.setBounds(30, 453, 200, 30);
		close.addActionListener(CloseTimeseddelListener.instance);
		this.add(close);
		
		JButton lokaleegenskaber = new JButton("Lokale egenskaber");
		lokaleegenskaber.setBounds(40, 453, 150, 30);
		lokaleegenskaber.addActionListener(LokaleEgenskaberListener.instance);
//		this.add(lokaleegenskaber);
	}
}
