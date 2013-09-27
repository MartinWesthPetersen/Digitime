package listeners;

import gui.TimeSeddelTabs;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NyTimeSeddelListener implements ActionListener {
	
	public static final NyTimeSeddelListener instance = new NyTimeSeddelListener();

	@Override
	public void actionPerformed(ActionEvent arg0) {
		TimeSeddelTabs.instance.insertNyTimeseddel();
	}

}
