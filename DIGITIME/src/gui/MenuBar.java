package gui;

import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public final class MenuBar extends JMenuBar {

	public static final long serialVersionUID = 1L;

	public static final MenuBar instance = new MenuBar();
	
	public MenuBar() {
		super();
		this.add(addFileMenu());
	}
	
	private JMenu addFileMenu() {
		JMenu menu = new JMenu("File");
		menu.add(this.addExitItem());
		menu.add(this.addLoadItem());
		return menu;
	}
	
	private JMenuItem addExitItem() {
		JMenuItem menuitem = new JMenuItem("Exit");
		return menuitem;
	}
	
	private JMenuItem addLoadItem() {
		JMenuItem menuitem = new JMenuItem("Load");
		return menuitem;
	}
	
}