package listeners;

import gui.LokaleEgenskaber;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LokaleEgenskaberListener implements ActionListener {
	
	public static final LokaleEgenskaberListener instance = new LokaleEgenskaberListener();

	public void actionPerformed(ActionEvent arg0) {
		LokaleEgenskaber.instance.setVisible(true);
	}

}
