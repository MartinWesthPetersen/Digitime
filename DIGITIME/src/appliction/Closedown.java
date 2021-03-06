package appliction;

import gui.NoEnd;

import java.io.FileWriter;
import java.io.IOException;

import listeners.StartStopListener;

public class Closedown {

	public static final Closedown instance = new Closedown();

	public Closedown() {

	}

	public void execute() {
		// Gemmer systemets indstillinger
		FileWriter writer;
		try {
			writer = new FileWriter("Indstillinger.txt");
			String takst = Settings.instance.getStandardtakst();
			writer.write(takst + "@@");
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Tjekker om der er skrevet sluttid
		if (! StartStopListener.instance.start) {
			NoEnd.instance.setVisible(true);
		}
		else {
			System.exit(0);
		}
	}
}
