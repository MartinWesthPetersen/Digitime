package appliction;

import gui.TimeSeddel;
import gui.TimeSeddelPanel;
import gui.TimeSeddelTabs;

import java.util.ArrayList;

public class Application {

	public static final Application instance = new Application();
	
	private ArrayList<TimeSeddelPanel> timeseddelpaneler;
	private TimeSeddelPanel currentseddelpanel;
	
	public Application() {
		this.timeseddelpaneler = new ArrayList<TimeSeddelPanel>();
	}
	
	public void setCurrentSeddel() {
		this.currentseddelpanel = (TimeSeddelPanel) TimeSeddelTabs.instance.getComponent
				(TimeSeddelTabs.instance.getSelectedIndex());
	}
	
	public TimeSeddelPanel getCurrentSeddelPanel() {
		this.setCurrentSeddel();
		return this.currentseddelpanel;
	}
	
}
