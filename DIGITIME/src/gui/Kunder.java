package gui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

public class Kunder extends JFrame {

	private static final long serialVersionUID = 1L;

	public static final Kunder instance = new Kunder();
	
	public Kunder() {
		this.setSize(600, 400);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		
		Kundeliste liste = new Kundeliste(30,1);
		KundeInfo info = new KundeInfo(100);
		liste.setTableHeader(null);
		JScrollPane scroll = new JScrollPane(liste)	;
		JTextField kundeInfo = new JTextField();
		kundeInfo.setVisible(true);
		scroll.setVisible(true);
		scroll.setBounds(0, 0, 200, 374);
		panel.add(scroll);
		panel.add(kundeInfo);
		
		
		
		this.add(panel);
		
		
	}
}
