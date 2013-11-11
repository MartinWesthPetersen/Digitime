package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CloseTimeseddelListener implements ActionListener {
	
	public static final CloseTimeseddelListener instance = new CloseTimeseddelListener();

	@Override
	public void actionPerformed(ActionEvent e) {
		GemListener.instance.andclose = true;
		CloseTimeseddelWarning.instance.setVisible(true);

	}
}
