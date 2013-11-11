package appliction;

import gui.GlobaleEgenskaber;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.lang.Character.Subset;

public class Startup {

	public static final Startup instance = new Startup();
	
	public Startup() {
		
	}
	
	public void execute() {
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Indstillinger.txt"));
			String line;
			try {
				line = reader.readLine();
				line = line.substring(0, line.length() - 2);
				Settings.instance.setStandardtakst(line);
				GlobaleEgenskaber.instance.takstfield.setText(line);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
