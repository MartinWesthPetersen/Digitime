package listeners;

import gui.kunde.KundeNy;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KundeNyListener implements ActionListener{
	
	public final static KundeNyListener instance = new KundeNyListener();

	@Override
	public void actionPerformed(ActionEvent arg0) {
		KundeNy.instance.setVisible(true);
		
	}
	

}
