package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LokaleEgenskaber extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public static final LokaleEgenskaber instance = new LokaleEgenskaber();
	
	public LokaleEgenskaber() {
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		
		JPanel lokegn = new JPanel();
		lokegn.setBackground(Color.white);
		lokegn.setLayout(null);
		
		JLabel min = new JLabel("Slå beregning i hele kvarter til:");
		min.setBounds(30, 30, 200, 30);
		min.setFont(new Font("sansserif",Font.PLAIN,15));
		lokegn.add(min);
		
		JCheckBox minbox = new JCheckBox();
		minbox.setBounds(300, 30, 30, 30);
		minbox.setBackground(Color.white);
		lokegn.add(minbox);
		
		JLabel takst = new JLabel("Sæt timetakst:");
		takst.setBounds(30, 90, 200, 30);
		takst.setFont(new Font("sansserif",Font.PLAIN,15));
		lokegn.add(takst);
		
		JTextField takstfield = new JTextField();
		takstfield.setBounds(250, 90, 80, 30);
		lokegn.add(takstfield);
		
		
		this.add(lokegn);
	}

}
