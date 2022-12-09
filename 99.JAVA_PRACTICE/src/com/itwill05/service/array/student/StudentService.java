package com.itwill05.service.array.student;



/*
 * Student객체전체에관련된 업무를 실행할클래스
 * 		1.학생객체들(Student[]) 을멤버변수로가진다.
 * 		2.학생객체들을 사용해서 업무실행
 */

public class StudentService {
	private Student[] students={
			new Student(1,"KIM",89,93,94),
			new Student(2,"HIM",88,77,98),
			new Student(3,"AIM",65,87,99),
			new Student(4,"KIM",75,97,60),
			new Student(5,"XIM",85,98,90),
			new Student(6,"TIM",95,88,77),
			new Student(7,"KIM",99,93,95),
			new Student(8,"LIM",83,80,99),
			new Student(9,"QIM",73,90,80),
			
	};
	
	public Student[] getStudents() {
		return this.students;
	}
	/*
	 *  0.전체학생출력
	 */
	public void print() {
		Student.headerPrint();
		for (int i = 0; i < students.length; i++) {
			students[i].print();
		}
	}
	/*
	 * 0.학생객체받아서 추가
	 */
	public void addStudent(Student student) {
		
	}
	/*
	 * 1. 전체학생총점,평균,평점계산
	 */
	public void calculate() {
		
		
	}
	/*
	 * 2. 전체학생 총점으로 석차계산
	 */
	public void calculateRank() {
		
		
	}
	/*
	 * 3. 전체학생반환
	 */
	
	/*
	 * 4. 번호3번 학생한명 반환  
	 */
	public Student findByNo(int no) {
		Student findStudent=null;
		
		return findStudent;
	}
	/*
	 * 5. 학점A인 학생들 반환
	 */
	public Student[] findByGrade(char grade) {
		Student[] findStudents=null;
		
		return findStudents;
	}
	public Student[] findByName(String name) {
		Student[] findStudents=null;
		
		return findStudents;
	}
	/*
	 * 6. 학생석차로 오름차순정렬
	 */
	public void sortByRankAsc() {
		
	}
	
	
}