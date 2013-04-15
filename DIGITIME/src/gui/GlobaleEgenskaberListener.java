package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import appliction.Settings;

public class GlobaleEgenskaberListener implements ActionListener {
	
	public static final GlobaleEgenskaberListener instance = new GlobaleEgenskaberListener();

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String takst = GlobaleEgenskaber.instance.getTextField().getText();
		Settings.instance.setStandardtakst(takst);
		GlobaleEgenskaber.instance.setVisible(true);
	}

}
