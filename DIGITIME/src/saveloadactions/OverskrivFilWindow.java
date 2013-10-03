package saveloadactions;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class OverskrivFilWindow extends JFrame {
	
	public static final OverskrivFilWindow instance = new OverskrivFilWindow();
	public String filename;
	
	public OverskrivFilWindow() {
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		panel.setLayout(null);
		JLabel label = new JLabel("En fil med samme navn findes i forvejen.");
		JLabel label2 = new JLabel("Vil du overskrive?");
		label.setBounds(20, 30, 280, 30);
		label2.setBounds(80, 50, 200, 30);
		panel.add(label2);
		panel.add(label);
		this.add(panel);
		
		JButton yesbutton = new JButton("Ja");
		JButton nobutton = new JButton("Nej");
		yesbutton.setBounds(60, 90, 60, 30);
		nobutton.setBounds(140, 90, 60, 30);
		yesbutton.addActionListener(OverskrivYesListener.instance);
		nobutton.addActionListener(OverskrivNoListener.instance);
		panel.add(yesbutton);
		panel.add(nobutton);
	}
}
