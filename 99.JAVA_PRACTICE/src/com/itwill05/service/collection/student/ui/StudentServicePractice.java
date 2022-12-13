package com.itwill05.service.collection.student.ui;

import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

import com.itwill05.service.collection.student.Student;
import com.itwill05.service.collection.student.StudentServiceArrayList;

import java.awt.BorderLayout;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class StudentServicePractice extends JFrame {

	private JPanel contentPane;
	private JTable table;
	
	private StudentServiceArrayList studentService = new StudentServiceArrayList();
	private List<Student> studentList = new Vector<Student>();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					StudentServicePractice frame = new StudentServicePractice();
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
	public StudentServicePractice() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		Vector colunmNames = new Vector<>();
		colunmNames.add("번호");
		colunmNames.add("이름");
		colunmNames.add("국어");
		colunmNames.add("영어");
		colunmNames.add("수학");
		colunmNames.add("총점");
		colunmNames.add("평균");
		colunmNames.add("학점");
		colunmNames.add("등수");
		
		Vector test = new Vector<>();
		studentList = studentService.getStudentList();
		for (Student student : studentList) {
			Vector c = new Vector<>();
			c.add(student.getNo());
			c.add(student.getName());
			c.add(student.getKor());
			c.add(student.getEng());
			c.add(student.getMath());
			test.add(c);
		}
		
		DefaultTableModel tableModel = new DefaultTableModel(test,colunmNames);
		
		
		table = new JTable(tableModel);
		scrollPane.setViewportView(table);
		setTitle("학생성적관리 연습");
	}

}
