package gui;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.BorderFactory;
import javax.swing.CellEditor;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.TableColumn;

public class TimeSeddel extends JTable {
	 
	private static final long serialVersionUID = 1L;

	public TimeSeddel(int row, int col) {
		super(row,col);
		this.setCellSelectionEnabled(true);
		this.setBounds(0, 80, 755, 322);
//		Border blackline = BorderFactory.createLineBorder(Color.blue);
//		this.setBorder(blackline);
		this.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);

	}
	
	public void paint(Graphics g) {
		this.getColumnModel().getColumn(0).setWidth(364);
		this.getColumnModel().getColumn(1).setWidth(60);
		this.getColumnModel().getColumn(2).setWidth(60);
		this.getColumnModel().getColumn(3).setWidth(60);
		this.getColumnModel().getColumn(4).setWidth(60);
		this.getColumnModel().getColumn(5).setWidth(60);
		this.getColumnModel().getColumn(6).setWidth(60);
		this.setRowHeight(25);
		super.paint(g);
	}
}