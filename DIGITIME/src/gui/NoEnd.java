package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NoEnd extends JFrame {

	public static final NoEnd instance = new NoEnd();
	
	public NoEnd() {
		this.setSize(250, 170);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		panel.setLayout(null);
		JLabel label = new JLabel("Der er ikke skrevet sluttid");
		label.setBounds(40, 20, 300, 30);
		panel.add(label);
		JButton button = new JButton("Ok");
		button.setBounds(80, 60, 60, 30);
		button.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				NoEnd.instance.dispose();
				CloseProgramReminder.instance.dispose();
			}
			
		});
		panel.add(button);
		this.add(panel);
	}
}
