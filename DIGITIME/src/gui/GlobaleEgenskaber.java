package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GlobaleEgenskaber extends JFrame {

	private static final long serialVersionUID = 1L;

	public static final GlobaleEgenskaber instance = new GlobaleEgenskaber();
	
	private JTextField takstfield;
	
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
		button.setBounds(30, 80, 80, 30);
		button.addActionListener(GlobaleEgenskaberOkButtonListener.instance);
		this.add(button);
			
		this.add(gloegn);
	}
	
	public JTextField getTextField() {
		return this.takstfield;
	}
}
