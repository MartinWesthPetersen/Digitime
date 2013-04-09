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
<<<<<<< HEAD
	}
	
	private JMenu addFileMenu() {
		JMenu menu = new JMenu("File");
=======
		this.add(addRedigerMenu());
	}
	
	private JMenu addFileMenu() {
		JMenu menu = new JMenu("Filer");
>>>>>>> 48d27c48c6edef1206feffc5f84d1efd56bc2adb
		menu.add(this.addExitItem());
		menu.add(this.addLoadItem());
		return menu;
	}
	
<<<<<<< HEAD
	private JMenuItem addExitItem() {
		JMenuItem menuitem = new JMenuItem("Exit");
=======
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
>>>>>>> 48d27c48c6edef1206feffc5f84d1efd56bc2adb
		return menuitem;
	}
	
	private JMenuItem addLoadItem() {
		JMenuItem menuitem = new JMenuItem("Load");
		return menuitem;
	}
	
<<<<<<< HEAD
=======
	
>>>>>>> 48d27c48c6edef1206feffc5f84d1efd56bc2adb
}