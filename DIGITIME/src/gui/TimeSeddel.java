package gui;

import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import appliction.Application;
import appliction.RowInfo;

public class TimeSeddel extends JTable {
	 
	private static final long serialVersionUID = 1L;
	private ArrayList<RowInfo> rows;
	private int rowcounter=0;
	private String takst;

	public TimeSeddel() {
		super(23,7);
		DefaultTableModel model = new DefaultTableModel(23,7) {
			
			@Override
			public boolean isCellEditable(int row, int column) {
				return column == 0;
			}
		};
		this.setModel(model);
		this.rows = new ArrayList<RowInfo>();
		this.setBounds(0, 80, 755, 322);
//		Border blackline = BorderFactory.createLineBorder(Color.blue);
//		this.setBorder(blackline);
		this.setAutoResizeMode(JTable.AUTO_RESIZE_LAST_COLUMN);
		this.takst = "";

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
	
	public void insertStartPart(final String description, final String dato, final String starttid) {
		RowInfo row = new RowInfo();
		row.setDato(dato);
		row.setStarttid(starttid);
		this.rows.add(row);
		
		if(this.getValueAt(rowcounter, 0) == null) {
			row.setDescription(description);
			this.setValueAt(description, rowcounter, 0);
		}
		this.setValueAt(dato, rowcounter, 1);
		this.setValueAt(starttid, rowcounter, 2);
		this.repaint();
	}
	
	public void insertSlutPart(final String sluttid, final String tidsdifference, 
			final String kroner, final String dispbeloeb) {
		this.rows.get(rowcounter).setSluttid(sluttid);
		this.rows.get(rowcounter).setTiddifference(tidsdifference);
		this.rows.get(rowcounter).setKroner(kroner);
		this.rows.get(rowcounter).setDispbeloeb(dispbeloeb);
		
		this.setValueAt(sluttid, rowcounter, 3);
		this.setValueAt(tidsdifference, rowcounter, 4);
		this.setValueAt(kroner, rowcounter, 5);
		this.setValueAt(dispbeloeb, rowcounter, 6);
		this.rowcounter++;
	}
	
	public void setTakst(final String takst) {
		this.takst = takst;
	}
	
	public String getTakst() {
		return this.takst;
	}
	
	public ArrayList<RowInfo> getRowInfos() {
		return this.rows;
	}
}