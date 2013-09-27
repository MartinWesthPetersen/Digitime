package listeners;

import gui.MainFrame;
import gui.TimeSeddelTabs;

import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class TabChangeListener implements ChangeListener {

	public static final TabChangeListener instance = new TabChangeListener();
	
	public TabChangeListener() {
		super();
	}
	
	@Override
	public void stateChanged(ChangeEvent arg0) {
		MainFrame.instance.printStatus("");
	}

}
