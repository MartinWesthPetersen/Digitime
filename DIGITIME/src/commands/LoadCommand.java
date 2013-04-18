package commands;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import gui.LoadWizard;

public class LoadCommand {

	public LoadCommand() {
		LoadWizard.instance.setVisible(true);
	}
	
	public void execute(String filename) {
		try {
			String line;
			BufferedReader reader = new BufferedReader(new FileReader(filename + ".txt."));			
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
