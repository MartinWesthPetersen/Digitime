package rowcalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartStopListener implements ActionListener {

	public static final StartStopListener instance = new StartStopListener();
	
	private boolean start = true;
	
	public void actionPerformed(ActionEvent arg0) {
		if(start) {
			StartActions.instance.calculate();
			this.start = false;
		}
		else {
			SlutActions.instance.calculate();
			this.start = true;
		}
	}

}
