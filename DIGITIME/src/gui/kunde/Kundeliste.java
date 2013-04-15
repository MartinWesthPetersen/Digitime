package gui.kunde;

import java.awt.Graphics;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Kundeliste extends JTable {

	private static final long serialVersionUID = 1L;

	public Kundeliste(int row, int col) {
		super(row,col);
		this.setCellSelectionEnabled(true);
		this.setBounds(0, 0, 600, 400);


		DefaultTableModel model = new DefaultTableModel(row, col) { 

			@Override
			public boolean isCellEditable(int row, int col) {
				return false;
			}
		};

		this.setModel(model);
	}


	public void paint(Graphics g) {
		this.setRowHeight(25);
		super.paint(g);
	}
}
