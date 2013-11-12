package rowcalculator;

import gui.MainFrame;
import gui.TimeSeddel;
import gui.TimeSeddelPanel;
import gui.TimeSeddelTabs;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import listeners.DescriptionWizardOkButton;

import appliction.Application;

public class StartActions {

	public static final StartActions instance = new StartActions();

	private String dato;
	private String time;

	public StartActions() {

	}

	public void calculate() {
		String status = MainFrame.instance.statuslabel.getText();
		try {
			if(! status.substring(0, 9).equals("Advarsel:")) {
				MainFrame.instance.printStatus("");
			}
		}
		catch(StringIndexOutOfBoundsException e) {

		}

		DateFormat dateFormat = new SimpleDateFormat("dd/MM HH:mm");
		Date date = new Date();
		String dateandtime = dateFormat.format(date);
		this.dato = dateandtime.substring(0, 5);
		this.time = dateandtime.substring(6, 11);

		TimeSeddel seddel = Application.instance.getCurrentSeddelPanel().getTimeSeddel();
		seddel.insertStartPart("",dato, time);
	}

	public String getDato() {
		return this.dato;
	}

	public String getTime() {
		return this.time;
	}	
}
