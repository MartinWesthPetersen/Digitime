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
		this.addTab("Hejsa", new JLabel("hejksdfsdfl"));
		this.addTab("Hejsa", new JLabel("hejkæææææææææææææl"));
		this.setBounds(0, 0, 760, 400);
	}
}
