package saveloadactions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OverskrivYesListener implements ActionListener{
	
	public static final OverskrivYesListener instance = new OverskrivYesListener();

	@Override
	public void actionPerformed(ActionEvent e) {
		new SaveCommand().executecontinue(OverskrivFilWindow.instance.filename);
		OverskrivFilWindow.instance.dispose();
	}

}
