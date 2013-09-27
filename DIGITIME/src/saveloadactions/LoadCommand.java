package saveloadactions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


import listeners.DescriptionWizardOkButton;

import appliction.Application;

import gui.MainFrame;
import gui.TimeSeddel;
import gui.TimeSeddelPanel;
import gui.TimeSeddelTabs;

public class LoadCommand {

	private String loadinfo;
	
	public LoadCommand() {
		LoadWizard.instance.setVisible(true);
	}
	
	public void execute(String filename) {
		try {
			String line;
			BufferedReader reader = new BufferedReader(new FileReader(filename + ".txt"));	
			this.loadinfo = "";
			while((line = reader.readLine()) != null) {
				this.loadinfo += line;
			}
			TimeSeddelPanel panel = new TimeSeddelPanel();
			panel.sag.setText(this.decrypt(this.loadinfo));
			panel.kunde.setText(this.decrypt(this.loadinfo));
			panel.kontakt.setText(this.decrypt(this.loadinfo));
			panel.pris.setText(this.decrypt(this.loadinfo));
			TimeSeddelTabs.instance.addTab(filename, panel);
			int tabindex = TimeSeddelTabs.instance.indexOfTab(filename);
			TimeSeddelTabs.instance.setSelectedIndex(tabindex);
			panel.repaint();
			Application.instance.insertNyTimeSeddelPanel(panel);
			
			TimeSeddel seddel = Application.instance.getCurrentSeddelPanel().getTimeSeddel();
			while(! this.loadinfo.equals("")) {
				seddel.insertStartPart(this.decrypt(this.loadinfo), this.decrypt(this.loadinfo), 
						this.decrypt(this.loadinfo));	
				seddel.insertSlutPart(this.decrypt(this.loadinfo), this.decrypt(this.loadinfo), 
						this.decrypt(this.loadinfo), this.decrypt(this.loadinfo));
			}
			
			
		} catch (FileNotFoundException e) {
			MainFrame.instance.printStatus("Fil ikke fundet");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public String decrypt(final String text) {
		int tal = 0;
		while(! (text.substring(tal, tal + 2).equals("@@") || text.substring(tal, tal + 2).equals("##"))) {
			tal++;
		}
		String onepart = text.substring(0, tal);
		this.loadinfo = this.loadinfo.substring(tal + 2, this.loadinfo.length());
		return onepart;
	}
}
