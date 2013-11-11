package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import listeners.GlobaleEgenskaberOkButtonListener;

public class GlobaleEgenskaber extends JFrame {

	private static final long serialVersionUID = 1L;

	public static final GlobaleEgenskaber instance = new GlobaleEgenskaber();
	
	public JTextField takstfield;
	
	public JTextField advarselsfield;
	
	public GlobaleEgenskaber() {
		this.setSize(400, 300);
		this.setLocationRelativeTo(null);
		this.setBackground(Color.white);
		
		JPanel gloegn = new JPanel();
		gloegn.setBackground(Color.white);
		gloegn.setLayout(null);
		
		JLabel standardtakst = new JLabel("Saet standard timetakst:");
		standardtakst.setBounds(30, 30, 200, 30);
		standardtakst.setFont(new Font("sansserif",Font.PLAIN,15));
		gloegn.add(standardtakst);
		
		this.takstfield = new JTextField();
		takstfield.setBounds(250, 30, 80, 30);
		gloegn.add(takstfield);
		
		JButton button = new JButton("OK");
		button.setBounds(30, 150, 80, 30);
		button.addActionListener(GlobaleEgenskaberOkButtonListener.instance);
		this.add(button);
		
		JLabel advarsellabel = new JLabel("Sæt beløb for advarsel:");
		advarsellabel.setBounds(30, 80, 200, 30);
		advarsellabel.setFont(new Font("sansserif",Font.PLAIN,15));
		gloegn.add(advarsellabel);
		
		this.advarselsfield = new JTextField();
		this.advarselsfield.setBounds(250, 80, 80, 30);
		gloegn.add(advarselsfield);
	
		this.add(gloegn);
	}
	
	public JTextField gettakstTextField() {
		return this.takstfield;
	}
	
	public JTextField getadvarselTextField() {
		return this.advarselsfield;
	}
}
