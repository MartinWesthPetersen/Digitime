package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KunderListener implements ActionListener {
	
	public static final KunderListener instance = new KunderListener();

	@Override
	public void actionPerformed(ActionEvent arg0) {
		Kunder.instance.setVisible(true);
	}

}
