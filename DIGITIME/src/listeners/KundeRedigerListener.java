package listeners;

import gui.kunde.KundeRediger;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KundeRedigerListener implements ActionListener{
	
	public static final KundeRedigerListener instance = new KundeRedigerListener();

	@Override
	public void actionPerformed(ActionEvent e) {
		KundeRediger.instance.setVisible(true);
	}
	

}
