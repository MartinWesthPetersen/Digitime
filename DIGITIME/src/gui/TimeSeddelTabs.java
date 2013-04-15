package gui;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

import appliction.Application;

public class TimeSeddelTabs extends JTabbedPane {

	private static final long serialVersionUID = 1L;

	public static final TimeSeddelTabs instance = new TimeSeddelTabs();
	
	public TimeSeddelTabs() {
		super();
		this.setBounds(0, 0, 760, 440);
	}
	
	public void insertNyTimeseddel() {
		NewTabWizard.instance.setVisible(true);
	}
	
	public void insertNyTimeseddel(final String tabname) {
		TimeSeddelPanel panel = new TimeSeddelPanel();
		this.addTab(tabname, panel);
		Application.instance.insertNyTimeSeddelPanel(panel);
	}
}
