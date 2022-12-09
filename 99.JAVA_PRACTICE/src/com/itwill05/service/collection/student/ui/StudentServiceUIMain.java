package com.itwill05.service.collection.student.ui;

import java.util.ArrayList;
import java.util.Scanner;

import com.itwill05.service.collection.student.Student;
import com.itwill05.service.collection.student.StudentServiceArrayList;



public class StudentServiceUIMain {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		boolean run=true;
		StudentServiceArrayList studentService=new StudentServiceArrayList();
		System.out.println("*****************************");
		System.out.println("     학생성적관리프로그램");
		System.out.println("*****************************");
		while (run) {
			System.out.println("------------메뉴-------------");
			System.out.println("0. 전체학생출력");
			System.out.println("1. 전체학생총점,평균,평점계산");
			System.out.println("2. 전체학생 총점으로 석차계산");
			System.out.println("3. 번호로   검색");
			System.out.println("4. 학점으로 검색");
			System.out.println("5. 이름으로 검색");
			System.out.println("6. 학생총점으로 오름차순정렬");
			System.out.println("7. 학생이름으로 오름차순정렬");
			System.out.println("8. 학생추가");
			System.out.println("9. 종료");
			System.out.println("----------------------------");
			System.out.print("메뉴번호선택> ");
			int menuNo =scanner.nextInt();
			if(menuNo==0) {
				//0. 전체학생출력
				ArrayList<Student> studentList=studentService.getStudentList();
				Student.headerPrint();
				for (Student student : studentList) {
					student.print();
					student.print();
					student.print();
				}
			}else if(menuNo==1) {
				//1. 전체학생총점,평균,평점계산
				studentService.calculate();
				
			}else if(menuNo==2) {
				//2. 전체학생 총점으로 석차계산
				studentService.calculateRank();
				
			}else if(menuNo==3) {
				//3. 번호로   검색
				System.out.print(" >>번호입력: ");
				int no = scanner.nextInt();
				Student findStudent = studentService.findByStudent(no);
				if(findStudent!=null) {
					Student.headerPrint();
					findStudent.print();
				}else {
					System.out.println(no+ "번 학생없다..");
				}
			}else if(menuNo==4) {
				//4. 학점으로 검색
				System.out.print(" >>학점입력: ");
				String gradeStr = scanner.next();
				char grade = gradeStr.charAt(0);
				ArrayList<Student> findStudents = studentService.findByGrade(grade);
				Student.headerPrint();
				for (int i = 0; i < findStudents.size(); i++) {
					findStudents.get(i).print();;
				}
			}else if(menuNo==5) {
				//5. 이름으로 검색
				System.out.print(" >>이름입력: ");
				String name = scanner.next();
			}else if(menuNo==6) {
				//6. 학생총점으로 오름차순정렬
			}else if(menuNo==7) {
				//7. 학생이름으로 오름차순정렬
			}else if(menuNo==8) {
				System.out.print(" >>학생정보입력(번호 이름 국어 영어 수학): ");
				String noStr = scanner.next();
				String nameStr = scanner.next();
				String korStr = scanner.next();
				String engStr = scanner.next();
				String mathStr = scanner.next();
				System.out.println(noStr+","+nameStr+","+korStr+","+engStr+","+mathStr);
				
				int no=Integer.parseInt(noStr);
				int kor=Integer.parseInt(korStr);
				int eng=Integer.parseInt(engStr);
				int math=Integer.parseInt(mathStr);
				Student newStudent=new Student(no, nameStr, kor, eng, math);
				studentService.addStudent(newStudent);
				
				
			}else if(menuNo==9) {
				run=false;
				System.out.println("학생성적관리프로그램을 종료합니다.");
			}
		}

	}

}