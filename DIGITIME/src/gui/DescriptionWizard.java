package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class DescriptionWizard extends JFrame {

	public static final DescriptionWizard instance = new DescriptionWizard();
	private static final long serialVersionUID = 1L;
	
	public JTextField text;
	
	public DescriptionWizard() {
		this.setSize(500, 300);
		this.setLayout(null);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 500, 300);
		panel.setLayout(null);
		panel.setBackground(Color.white);
		JLabel arbejdsbeskrivelse = new JLabel("Arbejdsbeskrivelse:");
		arbejdsbeskrivelse.setBounds(40, 40, 150, 20);
		panel.add(arbejdsbeskrivelse);
		
		this.text = new JTextField();
		text.setBounds(220, 40, 200, 20);
		panel.add(text);
		
		JButton knap = new JButton("OK");
		knap.setBounds(50, 80, 100, 30);
		knap.addActionListener(DescriptionWizardOkButton.instance);
		panel.add(knap);
		
		
		this.add(panel);
	}

}
