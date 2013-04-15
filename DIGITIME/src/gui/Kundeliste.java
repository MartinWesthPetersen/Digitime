package gui;

import java.awt.Graphics;
import javax.swing.JTable;

public class Kundeliste extends JTable {
	 
	private static final long serialVersionUID = 1L;

	public Kundeliste(int row, int col) {
		super(row,col);
		this.setCellSelectionEnabled(true);
		this.setBounds(0, 0, 600, 400);
		this.setCellSelectionEnabled(true);

//		Border blackline = BorderFactory.createLineBorder(Color.blue);
//		this.setBorder(blackline);
//		this.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

	}
	
	public void paint(Graphics g) {
		this.setRowHeight(25);
		super.paint(g);
	}
}