package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import appliction.Settings;

public class GlobaleEgenskaberOkButtonListener implements ActionListener {

	public static final GlobaleEgenskaberOkButtonListener instance = new GlobaleEgenskaberOkButtonListener();
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String takst = GlobaleEgenskaber.instance.getTextField().getText();
		Settings.instance.setStandardtakst(takst);
		GlobaleEgenskaber.instance.dispose();
	}

}
