package listeners;

import gui.LokaleEgenskaber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import appliction.Application;

public class LokegnOkButtonListener implements ActionListener {

	public static final LokegnOkButtonListener instance = new LokegnOkButtonListener();

	public void actionPerformed(ActionEvent arg0) {
		String takst = LokaleEgenskaber.instance.takstfield.getText();
		LokaleEgenskaber.instance.takstfield.setText("");
		if (takst == null) {
			Application.instance.getCurrentSeddelPanel().getTimeSeddel().setTakst(takst);
		}
		LokaleEgenskaber.instance.dispose();
	}

}
