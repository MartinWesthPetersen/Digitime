package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SameFile extends JFrame {

	public static final SameFile instance = new SameFile();
	
	public SameFile() {
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		panel.setLayout(null);
		JLabel label = new JLabel("Denne timeseddel er allerede loaded");
		label.setBounds(30, 20, 300, 30);
		panel.add(label);
		JButton button = new JButton("Ok");
		button.setBounds(40, 60, 60, 30);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				SameFile.instance.dispose();
			}
			
		});
		panel.add(button);
		this.add(panel);
	}
}
