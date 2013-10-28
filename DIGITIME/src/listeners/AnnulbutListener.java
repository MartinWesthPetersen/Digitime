package listeners;

import gui.CloseProgramReminder;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AnnulbutListener implements ActionListener {
	
	public static final AnnulbutListener instance = new AnnulbutListener();

	@Override
	public void actionPerformed(ActionEvent e) {
		CloseProgramReminder.instance.dispose();
	}

}
