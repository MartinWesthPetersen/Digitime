package gui;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;

public class TimeSeddelTabs extends JTabbedPane {

	private static final long serialVersionUID = 1L;

	public static final TimeSeddelTabs instance = new TimeSeddelTabs();
	
	public TimeSeddelTabs() {
		super();
		this.addTab("Hejsa", new TimeSeddelPanel());
		this.addTab("Hovsa v 2", new JLabel("uhuhhuuh"));
		this.addTab("Hejsa", new JLabel("hejkeeeeeeel"));
		this.setBounds(0, 0, 760, 440);
	}
}
