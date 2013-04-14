package gui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.ScrollPane;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;

import rowcalculator.StartStopListener;

public class TimeSeddelPanel extends JPanel {

	private static final long serialVersionUID = 1L;
	
	private TimeSeddel seddel;
	private JScrollPane scrollPane;
	private JTextField pris;
	public int rowcounter = 0;
	

	public TimeSeddelPanel() {
		super();
		this.setLayout(null);
		this.setBackground(Color.white);
//		Border blackline = BorderFactory.createLineBorder(Color.red);
//		this.setBorder(blackline);
		
		this.seddel = new TimeSeddel();
		seddel.setTableHeader(null);
		this.scrollPane = new JScrollPane(seddel);
		scrollPane.setBounds(10, 100, 742, 312);
		scrollPane.setVisible(true);
		this.add(scrollPane);	
		
		
//		setPreferredSize(new Dimension(200, 250));
//		console = new TimeSeddel(3,3);
//
//		vertical = new JScrollPane(console);
//		vertical.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//		vertical.setBounds(20, 20, 100, 100);
//		this.add(vertical);


		JLabel sagtext = new JLabel("SAG:");
		sagtext.setBounds(10, 30, 40, 20);
		JTextArea sag = new JTextArea();
		sag.setSize(300, 50);
		sag.setBounds(50, 15, 300, 50);
		Border liniesag = BorderFactory.createLineBorder(Color.black);
		sag.setBorder(liniesag);

		JLabel kundetext = new JLabel("KUNDE:");
		kundetext.setBounds(360, 12, 60, 20);
		JTextField kunde = new JTextField();
		kunde.setSize(100, 50);
		kunde.setBounds(425, 10, 150, 25);
		Border liniekunde = BorderFactory.createLineBorder(Color.black);
		kunde.setBorder(liniekunde);
		

		JLabel kontakttext = new JLabel("KONTAKT:");
		kontakttext.setBounds(360, 42, 60, 20);
		JTextField kontakt = new JTextField();
		kontakt.setSize(100, 50);
		kontakt.setBounds(425, 40, 150, 25);
		Border liniekontakt = BorderFactory.createLineBorder(Color.black);
		kontakt.setBorder(liniekontakt);

		JLabel pristext = new JLabel("PRIS:");
		pristext.setBounds(586, 28, 60, 20);
		this.pris = new JTextField();
		pris.setSize(150, 20);
		pris.setBounds(625, 25, 120, 25);
		Border liniepris = BorderFactory.createLineBorder(Color.black);
		pris.setBorder(liniepris);
		
		JLabel beskrivelse = new JLabel("Beskrivelse");
		beskrivelse.setBounds(150, 70, 100, 30);
		JLabel dato = new JLabel("Dato");
		dato.setBounds(390, 70, 50, 30);
		JLabel start = new JLabel("Start");
		start.setBounds(450, 70, 50, 30);
		JLabel slut = new JLabel("Slut");
		slut.setBounds(510, 70, 50, 30);
		JLabel timer = new JLabel("Timer");
		timer.setBounds(565, 70, 50, 30);
		JLabel kroner = new JLabel("Kroner");
		kroner.setBounds(624, 70, 50, 30);
		JLabel disp = new JLabel("Disp");
		disp.setBounds(690, 70, 50, 30);
		

		this.add(sag);
		this.add(sagtext);
		this.add(kunde);
		this.add(kundetext);
		this.add(pris);
		this.add(pristext);
		this.add(beskrivelse);
		this.add(dato);
		this.add(start);
		this.add(slut);
		this.add(timer);
		this.add(kroner);
		this.add(disp);
		this.add(kontakttext);
		this.add(kontakt);
	}
	
	public TimeSeddel getTimeSeddel() {
		return this.seddel;
	}
	
	public JTextField getPris() {
		return this.pris;
	}
}
