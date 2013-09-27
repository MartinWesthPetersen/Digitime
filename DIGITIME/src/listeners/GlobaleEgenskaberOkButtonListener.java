package listeners;

import gui.GlobaleEgenskaber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import appliction.Settings;

public class GlobaleEgenskaberOkButtonListener implements ActionListener {

	public static final GlobaleEgenskaberOkButtonListener instance = new GlobaleEgenskaberOkButtonListener();
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String takst = GlobaleEgenskaber.instance.gettakstTextField().getText();
		Settings.instance.setStandardtakst(takst);
		
		String advarsel = GlobaleEgenskaber.instance.getadvarselTextField().getText();
		Settings.instance.setAdvarselsbeløb(advarsel);
		GlobaleEgenskaber.instance.dispose();
	}

}
