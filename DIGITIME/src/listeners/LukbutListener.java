package listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LukbutListener implements ActionListener {
	
	public static final LukbutListener instance = new LukbutListener();

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);
	}

}
