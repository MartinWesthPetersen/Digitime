package saveloadactions;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadWizardOkButtonListener implements ActionListener {
	
	public static final LoadWizardOkButtonListener instance = new LoadWizardOkButtonListener();

	@Override
	public void actionPerformed(ActionEvent e) {
		LoadListener.instance.loadcommand.execute(LoadWizard.instance.getTextField().getText());
		LoadWizard.instance.dispose();
	}

}
