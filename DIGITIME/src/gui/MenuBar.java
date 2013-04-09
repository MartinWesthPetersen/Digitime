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
		this.add(addRedigerMenu());
	}
	
	private JMenu addFileMenu() {
		JMenu menu = new JMenu("Filer");
		menu.add(this.addExitItem());
		menu.add(this.addLoadItem());
		return menu;
	}
	
	private JMenu addRedigerMenu() {
		JMenu menu2 = new JMenu("Rediger");
		menu2.add(this.addKunderItem());
		return menu2;
	}
	
	private JMenuItem addKunderItem() {
		JMenuItem menuitem = new JMenuItem("Kunder");
		menuitem.addActionListener(KunderListener.instance);
		return menuitem;
	}

	private JMenuItem addExitItem() {
		JMenuItem menuitem = new JMenuItem("Luk");
		return menuitem;
	}
	
	private JMenuItem addLoadItem() {
		JMenuItem menuitem = new JMenuItem("Load");
		return menuitem;
	}
	
	
}