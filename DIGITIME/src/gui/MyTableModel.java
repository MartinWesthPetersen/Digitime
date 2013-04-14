package gui;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;



public class MyTableModel extends DefaultTableModel {
	
	public MyTableModel() {
		super(23,7);
		
	}
	
	public boolean isCellEditable() {
		return false;
	}
}
