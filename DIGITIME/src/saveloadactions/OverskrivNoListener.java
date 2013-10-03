package saveloadactions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OverskrivNoListener implements ActionListener {
	
	public static final OverskrivNoListener instance = new OverskrivNoListener();

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("Vi sagde nej");
		OverskrivFilWindow.instance.dispose();
		SaveWizard.instance.dispose();
	}

}
