package gui;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MainFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	public static final MainFrame instance = new MainFrame();
	private JLabel statuslabel;
	
	public MainFrame() {
		super("DIGITIME");
		this.setSize(800, 600);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setJMenuBar(MenuBar.instance);
		this.setLayout(null);
		this.setResizable(false);
		this.add(LocalPanel.instance);
		
		JButton globaleegenskaber = new JButton("Globale egenskaber");
		globaleegenskaber.setBounds(60, 507, 150, 30);
		globaleegenskaber.addActionListener(GlobaleEgenskaberListener.instance);
		this.add(globaleegenskaber);
		
		this.statuslabel = new JLabel("");
		statuslabel.setFont(new Font("Arial", Font.PLAIN, 16));
		statuslabel.setForeground(Color.red);
		statuslabel.setBounds(350, 507, 300, 30);
		this.add(statuslabel);
	
	}
	
	public void printStatus(final String status) {
		this.statuslabel.setText(status);
		this.statuslabel.repaint();
	}
}
