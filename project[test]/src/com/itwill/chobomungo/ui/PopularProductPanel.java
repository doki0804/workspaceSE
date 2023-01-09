package com.itwill.chobomungo.ui;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class PopularProductPanel extends JPanel {
	private JTable table;

	/**
	 * Create the panel.
	 */
	public PopularProductPanel() {
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		add(table);
		
		JScrollPane scrollPane = new JScrollPane();
		add(scrollPane);
		
	}

}
