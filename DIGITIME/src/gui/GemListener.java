package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import commands.SaveCommand;

public class GemListener implements ActionListener {
	
	public static final GemListener instance = new GemListener();
	public SaveCommand savecommand;

	@Override
	public void actionPerformed(ActionEvent e) {
		this.savecommand = new SaveCommand();
	}

}
