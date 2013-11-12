package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import appliction.Application;

public class DeleteRow extends JFrame {
	
	public static final DeleteRow instance = new DeleteRow();
	public int rownumber;
	
	public DeleteRow() {
		this.setSize(300, 200);
		this.setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.white);
		panel.setLayout(null);
		this.add(panel);
		
		JLabel label = new JLabel("Er du sikker på at du vil slette rækken?");
		label.setBounds(30, 20, 300, 30);
		panel.add(label);
		
		JButton ja = new JButton("Ja");
		ja.setBounds(30, 80, 60, 30);
		ja.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				TimeSeddel seddel = Application.instance.getCurrentSeddelPanel().getTimeSeddel();
				seddel.setValueAt("", seddel.getSelectedRow(), 0);
				seddel.setValueAt("", seddel.getSelectedRow(), 1);
				seddel.setValueAt("", seddel.getSelectedRow(), 2);
				seddel.setValueAt("", seddel.getSelectedRow(), 3);
				seddel.setValueAt("", seddel.getSelectedRow(), 4);
				seddel.setValueAt("", seddel.getSelectedRow(), 5);
				seddel.setValueAt("", seddel.getSelectedRow(), 6);
				DeleteRow.instance.dispose();
			}
			
		});
		
		JButton nej = new JButton("Nej");
		nej.setBounds(100, 80, 60, 30);
		nej.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				DeleteRow.instance.dispose();
			}
			
		});
		
		panel.add(ja);
		panel.add(nej);
	}
	

}
