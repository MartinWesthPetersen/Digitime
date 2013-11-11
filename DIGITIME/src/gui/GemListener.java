package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import saveloadactions.SaveCommand;


public class GemListener implements ActionListener {
	
	public static final GemListener instance = new GemListener();
	public SaveCommand savecommand;
	public boolean andclose = false;

	@Override
	public void actionPerformed(ActionEvent e) {
		this.savecommand = new SaveCommand();
		CloseTimeseddelWarning.instance.dispose();
	}

}
