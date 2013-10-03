package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import listeners.GlobaleEgenskaberListener;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final MainFrame instance = new MainFrame();
	public JLabel statuslabel;
	
	public MainFrame() {
		super("DIGITIME");
		
		this.statuslabel = new JLabel("");
		statuslabel.setFont(new Font("Arial", Font.BOLD, 16));
		statuslabel.setForeground(Color.red);
		statuslabel.setBounds(250, 507, 450, 30);
		this.add(statuslabel);
		
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		this.addWindowListener(Windowadapter.instance);
		this.setJMenuBar(MenuBar.instance);
		this.setLayout(null);
		this.setResizable(false);
		this.add(LocalPanel.instance);
		
		JButton globaleegenskaber = new JButton("Globale egenskaber");
		globaleegenskaber.setBounds(60, 507, 150, 30);
		globaleegenskaber.addActionListener(GlobaleEgenskaberListener.instance);
//		this.add(globaleegenskaber);
		
		
	
	}
	
	public void printStatus(final String status) {
		this.statuslabel.setText(status);
		this.statuslabel.repaint();
	}
}
