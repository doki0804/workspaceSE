package com.itwill05.service.collection.student.ui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import java.awt.BorderLayout;
import javax.swing.JTable;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;
import javax.swing.JList;
import javax.swing.BoxLayout;
import javax.swing.JFormattedTextField;
import java.awt.Color;
import java.awt.List;
import java.util.Vector;
import javax.swing.JLabel;

public class StudentFramePracticeMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentFramePracticeMain frame = new StudentFramePracticeMain();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public StudentFramePracticeMain() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 564, 500);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 50, 548, 411);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JTable table = new JTable();
		table.setBounds(0, 0, 548, 411);
		panel.add(table);
	}
}
