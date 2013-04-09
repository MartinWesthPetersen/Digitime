package rowcalculator;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StartActions {
	
	public static final StartActions instance = new StartActions();
	
	private String dato;
	private String time;

	public StartActions() {
	
	}
	
	public void calculate() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM HH:mm");
		Date date = new Date();
		String dateandtime = dateFormat.format(date);
		this.dato = dateandtime.substring(0, 5);
		this.time = dateandtime.substring(6, 11);
		System.out.println(dato + " " + time);
	}
	
	public String getTime() {
		return this.time;
	}
	
	public void insertdateandtime() {
		
	}
}
