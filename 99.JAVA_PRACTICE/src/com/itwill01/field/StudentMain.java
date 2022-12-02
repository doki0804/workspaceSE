package com.itwill01.field;

public class StudentMain {

	public static void main(String[] args) {
		/*
		 * 학생객체 2명생성
		 */
		Student st1, st2;
		st1 = new Student();
		st2 = new Student();
		
		
		/*
		 * 학생객체의 기본데이타(번호,이름,국어,영어,수학)대입(2명)
		 */
		st1.number = 1;
		st1.name = "맹구";
		st1.kor = 96;
		st1.eng = 98;
		st1.math = 80;
		
		st2.number = 2;
		st2.name = "유리";
		st2.kor = 89;
		st2.eng = 73;
		st2.math = 98;

		/*
		 * 학생의 기본데이타를사용해서 총점,평균,평점 계산후 대입(2명)
		 */
		
		st1.tot = st1.kor + st1.eng + st1.math;
		st1.avg = st1.tot/3.0;
		
		if(st1.avg>=90) {
			st1.grade = 'A';
		} else if (st1.avg>=80) {
			st1.grade = 'B';
		} else if (st1.avg>=70) {
			st1.grade = 'C';
		} else if (st1.avg>=80) {
			st1.grade = 'D';
		} else {
			st1.grade = 'F';
		}

		st2.tot = st2.kor + st2.eng + st2.math;
		st2.avg = st2.tot/3.0;
		
		if(st2.avg>=90) {
			st2.grade = 'A';
		} else if (st2.avg>=80) {
			st2.grade = 'B';
		} else if (st2.avg>=70) {
			st2.grade = 'C';
		} else if (st2.avg>=80) {
			st2.grade = 'D';
		} else {
			st2.grade = 'F';
		}
		/*
		 * 학생 데이타를 출력 2명
		 */
		/*
		- 출력포맷
		- 평균은 소수점이하 첫째자리까지출력(반올림)
		- 석차는 구하지마세요
		--------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   42   56   78   334  34.8  A   3  
		 2   김경수   45   53   76   334  34.8  A   2  
		-----------------------------------------------
		*/
		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n","학번","이름","국어", "영어","수학","총점","평균","평점","석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",st1.number,"맹구", st1.kor,st1.eng,st1.math,st1.tot,st1.avg,st1.grade,3 );
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4d%n",st2.number,"유리", st2.kor,st2.eng,st2.math,st2.tot,st2.avg,st2.grade,3 );
		System.out.printf("-----------------------------------------------%n");

	}

}