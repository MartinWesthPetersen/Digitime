package saveloadactions;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


import appliction.Application;
import appliction.RowInfo;
import gui.MainFrame;
import gui.TimeSeddel;
import gui.TimeSeddelPanel;

public class SaveCommand {

	private TimeSeddelPanel seddelpanel;

	public SaveCommand() {
		this.seddelpanel = Application.instance.getCurrentSeddelPanel();
		SaveWizard.instance.setVisible(true);
	}

	public void execute(final String filename) {
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
			
			MainFrame.instance.printStatus("Timeseddel gemt");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
