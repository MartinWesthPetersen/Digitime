package appliction;

import java.io.FileWriter;
import java.io.IOException;

public class Closedown {

	public static final Closedown instance = new Closedown();
	
	public Closedown() {
		
	}
	
	public void execute() {
		FileWriter writer;
		try {
			writer = new FileWriter("Indstillinger.txt");
			String takst = Settings.instance.getStandardtakst();
			writer.write(takst + "@@");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
