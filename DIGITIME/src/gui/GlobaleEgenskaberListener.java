package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GlobaleEgenskaberListener implements ActionListener {
	
	public static final GlobaleEgenskaberListener instance = new GlobaleEgenskaberListener();

	@Override
	public void actionPerformed(ActionEvent arg0) {
		GlobaleEgenskaber.instance.setVisible(true);
	}

}
