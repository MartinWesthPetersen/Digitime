package saveloadactions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


import appliction.Application;
import appliction.RowInfo;
import gui.GemListener;
import gui.MainFrame;
import gui.TimeSeddel;
import gui.TimeSeddelPanel;
import gui.TimeSeddelTabs;

public class SaveCommand {

	private TimeSeddelPanel seddelpanel;

	public SaveCommand() {
		this.seddelpanel = Application.instance.getCurrentSeddelPanel();
		SaveWizard.instance.getTextField().setText("");
		SaveWizard.instance.setVisible(true);
	}

	public void execute(final String filename) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename + ".txt"));
			OverskrivFilWindow.instance.filename = filename;
			OverskrivFilWindow.instance.setVisible(true);
		}
		catch (FileNotFoundException e) {
			this.executecontinue(filename);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void executecontinue(final String filename) {
		try {				
			FileWriter writer = new FileWriter(filename + ".txt");
			String saginfo = this.seddelpanel.sag.getText();
			String kundeinfo = this.seddelpanel.kunde.getText();
			String kontaktinfo = this.seddelpanel.kontakt.getText();
			String prisinfo = this.seddelpanel.pris.getText();
			ArrayList<RowInfo> rows = this.seddelpanel.getTimeSeddel().getRowInfos();
			writer.write(saginfo + "@@" + kundeinfo + "@@" + kontaktinfo + "@@" + prisinfo + "@@");
			int counter = 0;
			for(RowInfo row: rows) {
				String desc = (String) this.seddelpanel.getTimeSeddel().getValueAt(counter, 0);
				writer.write(desc + "@@");
				writer.write(row.getDato() + "@@" + row.getStarttid() +
						"@@" + row.getSluttid() + "@@" + row.getTiddifference() + "@@" + 
						row.getKroner() + "@@" + row.getDispbeloeb() + "##");
				counter++;
			}
			writer.flush();
			writer.close();
			SaveWizard.instance.dispose();

			MainFrame.instance.printStatus("Timeseddel gemt");
			if (GemListener.instance.andclose) {
				TimeSeddelTabs.instance.removeTabAt(TimeSeddelTabs.instance.getSelectedIndex());
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}