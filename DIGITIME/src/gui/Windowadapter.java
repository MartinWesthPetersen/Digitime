package gui;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Windowadapter extends WindowAdapter {
	
	public static final Windowadapter instance = new Windowadapter();

	@Override
	public void windowClosing(WindowEvent we) {
		CloseProgramReminder.instance.setVisible(true);
	}
}
