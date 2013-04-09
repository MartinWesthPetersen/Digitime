package gui;

import java.awt.Color;

<<<<<<< HEAD
=======
import javax.swing.JButton;
>>>>>>> 48d27c48c6edef1206feffc5f84d1efd56bc2adb
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final MainFrame instance = new MainFrame();
	
	public MainFrame() {
		super("DIGITIME");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(MenuBar.instance);
		this.setLayout(null);
		this.setResizable(false);
		this.add(LocalPanel.instance);
		this.setBackground(Color.green);
<<<<<<< HEAD
=======
		
		JButton globaleegenskaber = new JButton("Globale egenskaber");
		globaleegenskaber.setBounds(60, 507, 150, 30);
		globaleegenskaber.addActionListener(GlobaleEgenskaberListener.instance);
		this.add(globaleegenskaber);
>>>>>>> 48d27c48c6edef1206feffc5f84d1efd56bc2adb
	
	}
}
