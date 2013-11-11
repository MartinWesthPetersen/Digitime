package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import saveloadactions.SaveCommand;

public class CloseTimeseddelWarning extends JFrame {
	
	public static final CloseTimeseddelWarning instance = new CloseTimeseddelWarning();

	public CloseTimeseddelWarning() {
		this.setSize(430, 250);
		this.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		panel.setLayout(null);
		this.add(panel);
		
		JLabel label = new JLabel("Er jobbet færdigt og vil du arkivere og lukke denne timeseddel?");
		label.setBounds(30, 30, 380, 30);
		panel.add(label);
		
		JButton ja = new JButton("Ja");
		ja.addActionListener(GemListener.instance);
		ja.setBounds(30, 80, 60, 30);
		panel.add(ja);
		
		JButton nej = new JButton("Nej");
		nej.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				CloseTimeseddelWarning.instance.dispose();
			}
			
		});
		nej.setBounds(120, 80, 80, 30);
		panel.add(nej);
	}
}
