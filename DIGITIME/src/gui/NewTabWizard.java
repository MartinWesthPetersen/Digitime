package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class NewTabWizard extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public static final NewTabWizard instance = new NewTabWizard();
	
	private JTextField text;
	
	public NewTabWizard() {
		this.setSize(400, 200);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setSize(400, 200);
		panel.setLayout(null);
		panel.setVisible(true);
		
		JLabel label = new JLabel("Navn på tab:");
		label.setBounds(30, 40, 150, 30);
		panel.add(label);
		
		this.text = new JTextField();
		text.setBounds(220, 40, 150, 30);
		panel.add(text);
		
		JButton button = new JButton("OK");
		button.setBounds(30, 80, 80, 30);
		button.addActionListener(NewTabWizardOkListener.instance);
		panel.add(button);
		
		this.add(panel);
	}
	
	public JTextField getTextField() {
		return this.text;
	}
}
