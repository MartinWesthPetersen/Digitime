package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SaveWizard extends JFrame {

	private static final long serialVersionUID = 1L;
	
	public static final SaveWizard instance = new SaveWizard();
	private JTextField text;
	
	public SaveWizard() {
		this.setSize(400, 250);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		
		JLabel label = new JLabel("Navn paa fil:");
		label.setFont(new Font("sansserif", Font.PLAIN, 15));
		label.setBounds(30, 30, 100, 30);
		
		this.text = new JTextField();
		text.setBounds(150, 30, 200, 30);
		
		JButton button = new JButton("OK");
		button.setBounds(30, 80, 80, 30);
		button.addActionListener(SaveWizardOkButtonListener.instance);
		
		panel.add(button);
		panel.add(this.text);
		panel.add(label);
		this.add(panel);
	}
	
	public JTextField getTextField() {
		return this.text;
	}

}
