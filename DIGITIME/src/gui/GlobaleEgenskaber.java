package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GlobaleEgenskaber extends JFrame {

	private static final long serialVersionUID = 1L;

	public static final GlobaleEgenskaber instance = new GlobaleEgenskaber();
	
	public GlobaleEgenskaber() {
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.white);
		
		JPanel gloegn = new JPanel();
		gloegn.setBackground(Color.white);
		gloegn.setLayout(null);
		
		JLabel standardtakst = new JLabel("Sæt standard timetakst:");
		standardtakst.setBounds(30, 30, 200, 30);
		standardtakst.setFont(new Font("sansserif",Font.PLAIN,15));
		gloegn.add(standardtakst);
		
		JTextField takstfield = new JTextField();
		takstfield.setBounds(250, 30, 80, 30);
		gloegn.add(takstfield);
			
		this.add(gloegn);
	}
}
