package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import appliction.Closedown;

public class LukbutListener implements ActionListener {
	
	public static final LukbutListener instance = new LukbutListener();

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Closedown.instance.execute();
		System.exit(0);
	}

}
