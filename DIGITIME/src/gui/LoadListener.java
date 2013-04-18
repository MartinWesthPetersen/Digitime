package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import commands.LoadCommand;

public class LoadListener implements ActionListener {

	public static final LoadListener instance = new LoadListener();
	public LoadCommand loadcommand;
	
	public void actionPerformed(ActionEvent arg0) {
		this.loadcommand = new LoadCommand();
	}

}
