package rowcalculator;

import gui.DescriptionWizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StartStopListener implements ActionListener {

	public static final StartStopListener instance = new StartStopListener();

	public boolean start = true;

	public void actionPerformed(ActionEvent arg0) {
		if(start) {
			DescriptionWizard.instance.setVisible(true);
			if(this.start) {
				this.start = false;
			}
		}
		else {
			SlutActions.instance.calculate();
			if(! this.start) {
				this.start = true;
			}
			else {
				this.start = false;
			}
		}
	}
}
