package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SaveWizardOkButtonListener implements ActionListener {

	public static final SaveWizardOkButtonListener instance = new SaveWizardOkButtonListener();
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		GemListener.instance.savecommand.execute(SaveWizard.instance.getTextField().getText());
		SaveWizard.instance.dispose();
	}

}
