package com.itwill05.service.array.student;




public class StudentServiceMain {

	public static void main(String[] args) {
		StudentService studentService=new StudentService();
		/*
		 * 1. 전체학생총점,평균,평점계산
		 */
		System.out.println("1. 전체학생총점,평균,평점계산");
		studentService.calculate();
		/*
		 * 2. 전체학생 총점으로 석차계산
		 */
		System.out.println("2. 전체학생 총점으로 석차계산");
		studentService.calculateRank();
		/*
		 * 3-1. 전체학생반환
		 */
		System.out.println("3. 전체학생반환 ");
		Student[] students = studentService.getStudents();
		
		/*
		 * 3-2. 전체학생출력
		 */
		System.out.println("3. 전체학생출력 ");
		studentService.print();
		
		/*
		 * 4. 번호3번 학생한명 반환
		 */
		System.out.println("4.번호3번 학생한명 반환  ");
		Student findStudent = studentService.findByNo(3);
		findStudent.print();
		/*
		 * 5. 학점A인 학생들 반환
		 */
		System.out.println("5. 학점A인 학생들 반환");
		Student[] findStudents=
				studentService.findByGrade('A');
		System.out.println("A-->"+findStudents.length);
		findStudents=
				studentService.findByGrade('B');
		System.out.println("B-->"+findStudents.length);
		 findStudents=
				studentService.findByGrade('C');
		 System.out.println("C-->"+findStudents.length);
		/*
		 * 5. 이름KIM 인 학생들 반환
		 */
		System.out.println("5.  이름KIM 인 학생들 반환");
		findStudents=studentService.findByName("KIM");
		System.out.println("KIM-->"+findStudents.length);
		findStudents=studentService.findByName("HIM");
		System.out.println("HIM-->"+findStudents.length);
		/*
		 * 6. 학생석차로 오름차순정렬
		 */
		System.out.println("6. 학생석차로 오름차순정렬");
		studentService.sortByRankAsc();
		studentService.print();
	}
	
}