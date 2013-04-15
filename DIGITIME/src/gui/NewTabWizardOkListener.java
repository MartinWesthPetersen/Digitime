package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import appliction.Application;

public class NewTabWizardOkListener implements ActionListener {

	public static final NewTabWizardOkListener instance = new NewTabWizardOkListener();
	
	private String tabname;
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		this.tabname = NewTabWizard.instance.getTextField().getText();
		TimeSeddelPanel panel = new TimeSeddelPanel();
		TimeSeddelTabs.instance.addTab(this.tabname, panel);
		Application.instance.insertNyTimeSeddelPanel(panel);
		NewTabWizard.instance.dispose();
	}

}
