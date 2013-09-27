package listeners;

import gui.GlobaleEgenskaber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import appliction.Settings;

public class GlobaleEgenskaberListener implements ActionListener {
	
	public static final GlobaleEgenskaberListener instance = new GlobaleEgenskaberListener();

	@Override
	public void actionPerformed(ActionEvent arg0) {
		String takst = GlobaleEgenskaber.instance.gettakstTextField().getText();
		Settings.instance.setStandardtakst(takst);
		GlobaleEgenskaber.instance.setVisible(true);
	}

}
