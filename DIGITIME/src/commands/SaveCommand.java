package commands;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import appliction.Application;
import appliction.RowInfo;
import gui.SaveWizard;
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
			for(RowInfo row: rows) {
				writer.write(row.getDescription() + "@@" + row.getDato() + "@@" + row.getStarttid() +
						"@@" + row.getSluttid() + "@@" + row.getTiddifference() + "@@" + 
						row.getKroner() + "@@" + row.getDispbeloeb() + "##");
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
