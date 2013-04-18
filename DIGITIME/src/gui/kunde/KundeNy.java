package gui.kunde;

import java.awt.Color;
import java.awt.Component;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class KundeNy extends JFrame {


	private static final long serialVersionUID = 1L;

	public static final KundeNy instance = new KundeNy();

	public KundeNy() {
		setBackground(Color.white);  		
		this.setSize(430, 330);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		this.add(kundeComponents());


	}
	public static JPanel kundeComponents() {



		JPanel panel = new JPanel();
		panel.setLayout(null);


		Component navn = new JLabel("Navn");
		Component navnx = new JTextField();
		Component tlf = new JLabel("Telefon");
		Component tlfx = new JTextField();
		Component addresse = new JLabel("Addresse");
		Component addressex = new JTextArea();
		Component yderlig = new JLabel("Yderligere info");
		Component yderligx = new JTextArea();

		JButton okBot = new JButton("Ok");
		//okBot.setBounds(200,354,150,20);
		//okBot.addActionListener();
		//TODO//


		JScrollPane	addressexs = new JScrollPane(addressex);
		JScrollPane	yderligxs = new JScrollPane(yderligx);

		navn.setBounds(10, 10, 100, 20);
		navnx.setBounds(150, 10, 230, 20);
		tlf.setBounds(10, 50, 100, 20);
		tlfx.setBounds(150, 50, 230, 20);
		addresse.setBounds(10, 90, 100, 20);
		addressexs.setBounds(150, 90, 230, 70);
		yderlig.setBounds(10, 180, 100, 20);
		yderligxs.setBounds(150, 180, 230, 70);
		okBot.setBounds(330, 260, 50, 20);

		panel.add(navn);
		panel.add(navnx);
		panel.add(tlf);
		panel.add(tlfx);
		panel.add(addresse);
		panel.add(addressexs);
		panel.add(yderlig);
		panel.add(yderligxs);
		panel.add(okBot);
		return panel;

	}


}

