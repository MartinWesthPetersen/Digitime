package rowcalculator;

import gui.MainFrame;
import gui.TimeSeddel;
import gui.TimeSeddelPanel;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import appliction.Application;
import appliction.RowInfo;
import appliction.Settings;

public class SlutActions {

	public static final SlutActions instance = new SlutActions();

	private String time;
	private String timedifference;
	private String kroner;
	private String dispbeloeb;

	public SlutActions() {

	}

	public void calculate() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Date date = new Date();
		String dateandtime = dateFormat.format(date);
		this.time = dateandtime.substring(0, 5);

		String starttime = StartActions.instance.getTime();
		String formattedstarttime = (starttime.substring(0, 2) + starttime.substring(3, 5));
		String formattedstoptime = (this.time.substring(0, 2) + this.time.substring(3, 5));
		this.timedifference = this.formattimedifference(formattedstarttime, formattedstoptime);

		TimeSeddelPanel panel = Application.instance.getCurrentSeddelPanel();
		int takst = 0;

		if(panel.getTimeSeddel().getTakst() != "") {
			takst = Integer.parseInt(panel.getTimeSeddel().getTakst());
		}
		else {
			if(Settings.instance.getStandardtakst() != "") {
				takst = Integer.parseInt(Settings.instance.getStandardtakst());
			}
			else {
				MainFrame.instance.printStatus("Korrekt global eller lokal timetakst skal indskrives");
				StartStopListener.instance.start = true;
				return;
			}
		}
		MainFrame.instance.printStatus("");
		int heletimerikroner = (Integer.parseInt(this.timedifference.substring(0, 2)) * takst);
		int minutterikroner = (Integer.parseInt(this.timedifference.substring(3, 5)) *
				(takst / 60));
		this.kroner = heletimerikroner + minutterikroner + "";

		ArrayList<RowInfo> rows = panel.getTimeSeddel().getRowInfos();
		int totalkroner = 0;
		if(! rows.isEmpty()) {
			System.out.println("ikketom");
			for(RowInfo row: rows) {
				if(row.getKroner() != null) {
					totalkroner += Integer.parseInt(row.getKroner());
				}
			}
		}
		totalkroner += Integer.parseInt(this.kroner);

		try {
			this.dispbeloeb = Integer.parseInt(panel.getPris().getText()) - totalkroner + "";
			panel.getTimeSeddel().insertSlutPart(this.time, this.timedifference, this.kroner, this.dispbeloeb);
			MainFrame.instance.printStatus("");
		}
		catch (NumberFormatException e) {
			MainFrame.instance.printStatus("Korrekt pris skal indskrives");
			StartStopListener.instance.start = true;
		}


	}

	public String formattimedifference(final String starttime, final String stoptime) {
		int starthours = Integer.parseInt((starttime).substring(0, 2));
		int stophours = Integer.parseInt((stoptime).substring(0, 2));
		int totalmin = ((stophours - starthours) * 60) +
				(Integer.parseInt(stoptime.substring(2, 4)) - Integer.parseInt(starttime.substring(2, 4)));

		String hours = (totalmin / 60) + "";
		String minutes = (totalmin % 60) + "";
		String hoursandminutes = hours + minutes;

		int length = hoursandminutes.length();
		String formattedtimedifference = "";

		switch (length) {
		case 1:
			formattedtimedifference = "00:0" + hoursandminutes;
			break;
		case 2:
			formattedtimedifference = "00:" + hoursandminutes;
			break;
		case 3: 
			formattedtimedifference = "0" + hoursandminutes.substring(0, 1) + ":" + 
					hoursandminutes.substring(1, 3);
			break;
		case 4: 
			formattedtimedifference = hoursandminutes.substring(0, 2) + ":" +
					hoursandminutes.substring(2, 4);
			break;
		}
		return formattedtimedifference;
	}
}
