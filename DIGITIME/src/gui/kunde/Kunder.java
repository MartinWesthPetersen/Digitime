package gui.kunde;


import gui.LokegnOkButtonListener;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import listeners.KundeNyListener;
import listeners.KundeRedigerListener;

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
		liste.setTableHeader(null);
		JScrollPane scroll = new JScrollPane(liste)	;
		JTextField kundeInfo = new JTextField();
		kundeInfo.setVisible(true);
		scroll.setVisible(true);
		scroll.setBounds(0, 0, 200, 374);
		panel.add(scroll);
		panel.add(kundeInfo);
		
		Component navn = new JLabel("Navn");
		Component navnx = new JTextField();
		Component tlf = new JLabel("Telefon");
		Component tlfx = new JTextField();
		Component addresse = new JLabel("Addresse");
		Component addressex = new JTextArea();
		Component yderlig = new JLabel("Yderligere info");
		Component yderligx = new JTextArea();
		
		JScrollPane	addressexs = new JScrollPane(addressex);
		JScrollPane	yderligxs = new JScrollPane(yderligx);

		navn.setBounds(200, 30, 100, 40);
		navnx.setBounds(350, 30, 230, 40);
		tlf.setBounds(200, 70, 100, 40);
		tlfx.setBounds(350, 70, 230, 40);
		addresse.setBounds(200, 110, 100, 40);
		addressexs.setBounds(350, 110, 230, 90);
		yderlig.setBounds(200, 200, 100, 40);
		yderligxs.setBounds(350, 200, 230, 90);

		panel.add(navn);
		panel.add(navnx);
		panel.add(tlf);
		panel.add(tlfx);
		panel.add(addresse);
		panel.add(addressexs);
		panel.add(yderlig);
		panel.add(yderligxs);
		
		JButton redigerButton = new JButton("Rediger");
		redigerButton.setBounds(200,354,150,20);
		redigerButton.addActionListener(KundeRedigerListener.instance);
		panel.add(redigerButton);
		
		JButton nyButton = new JButton("Ny Kunde");
		nyButton.setBounds(350,354,150,20);
		nyButton.addActionListener(KundeNyListener.instance);
		panel.add(nyButton);
		
		this.add(panel);
		
		
	}
}
