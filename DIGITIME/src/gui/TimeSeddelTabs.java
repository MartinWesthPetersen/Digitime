package gui;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class TimeSeddelTabs extends JTabbedPane {

	private static final long serialVersionUID = 1L;

	public static final TimeSeddelTabs instance = new TimeSeddelTabs();
	
	public TimeSeddelTabs() {
		super();
		this.addTab("Hejsa", new TimeSeddelPanel());
		this.addTab("Hovsa v 2", new JLabel("hejksdfsdfl"));
		System.out.println("nejnejnje");
		this.setBounds(0, 0, 760, 400);
	}
}
