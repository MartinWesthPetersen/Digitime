package gui;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.AnnulbutListener;
import listeners.LukbutListener;

public class CloseProgramReminder extends JFrame {

	public static final CloseProgramReminder instance = new CloseProgramReminder();
	
	public CloseProgramReminder() {
		this.setSize(400, 200);
		this.setLocationRelativeTo(null);
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(Color.white);
		this.add(panel);
		JLabel label = new JLabel("Husk at gemme dine timsedler!");
		JLabel label2 = new JLabel("Vil du lukke programmet?");
		label.setBounds(90, 30, 300, 20);
		label2.setBounds(90, 50, 300, 20);
		panel.add(label);
		panel.add(label2);
		
		JButton lukbut = new JButton("Luk");
		JButton annulbut = new JButton("Annuller");
		lukbut.addActionListener(LukbutListener.instance);
		annulbut.addActionListener(AnnulbutListener.instance);
		lukbut.setBounds(90, 80, 60, 30);
		annulbut.setBounds(160, 80, 100, 30);
		panel.add(annulbut);
		panel.add(lukbut);
	}
}
