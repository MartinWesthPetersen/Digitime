package gui.kunde;

import java.awt.Color;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class KundeNy extends JFrame {


	private static final long serialVersionUID = 1L;

	public static final KundeNy instance = new KundeNy();
	
	public KundeNy() {
		this.setSize(376, 240);
		this.setLocationRelativeTo(null);
		this.setResizable(true);
		
  		
		JPanel panel = new JPanel();
  		panel.setLayout(new GridLayout(0,2));
		
  		setBackground(Color.white);  		
				
		Component tlf = new JLabel("Telefon");
		Component tlfx = new JTextField();
		Component addresse = new JLabel("Addresse");
		Component addressex = new JTextArea();
		Component yderlig = new JLabel("Yderligere info");
		Component yderligx = new JTextArea();
		
		JScrollPane	tlfxs = new JScrollPane(tlfx);
		JScrollPane	addressexs = new JScrollPane(addressex);
		JScrollPane	yderligxs = new JScrollPane(yderligx);
		
		panel.add(tlf);
		panel.add(tlfxs);
		panel.add(addresse);
		panel.add(addressexs);
		panel.add(yderlig);
		panel.add(yderligxs);
			
		this.add(panel);
	}
}

