package rowcalculator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SlutActions {
	
	public static final SlutActions instance = new SlutActions();
	
	private String time;
	private String timedifference;
	
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
		System.out.println(this.timedifference);
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
