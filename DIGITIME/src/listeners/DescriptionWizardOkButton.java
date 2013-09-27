package listeners;

import gui.DescriptionWizard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import rowcalculator.StartActions;

public class DescriptionWizardOkButton implements ActionListener {
	
	public static final DescriptionWizardOkButton instance = new DescriptionWizardOkButton();

	private String description;
	
	public void actionPerformed(ActionEvent arg0) {
		this.description = DescriptionWizard.instance.text.getText();
		DescriptionWizard.instance.text.setText("");
		DescriptionWizard.instance.dispose();
		StartActions.instance.calculate();
	}

	public String getDescription() {
		return this.description;
	}
}
