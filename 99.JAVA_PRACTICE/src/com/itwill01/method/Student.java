package com.itwill01.method;

/*
  #### 성적처리를 위한 필요한 학생객체를 만들기 위한 클래스
 */
public class Student {

	/*
	 * << 속성(멤버변수)   >> 번호 이름 국어 영어 수학 총점 평균 평점 석차
	 * << 기능(멤버메쏘드) >> 기본데이타입력,총점계산,평균계산,평점계산, 출력
	 */

	// 멤버변수 선언
	int no;
	String name;
	int kor;
	int eng;
	int math;
	int tot;
	double avg;
	char grade;
	int rank;
	
	// 멤버메쏘드 선언
	/*
	 * 기본데이타(번호,이름,국어,영어,수학)멤버변수에대입하는메쏘드
	 */
	void setStudentData(int no, String name, int kor, int eng, int math) {
		this.no = no; this.name = name; this.kor = kor; this.eng = eng; this.math = math;
	}
	/*
	 * 총점계산메쏘드
	 */
	void tot() {
		this.tot=this.kor+this.eng+this.math;
	}
	/*
	 * 평균계산메쏘드
	 */
	void avg() {
		this.avg=this.tot/3.0;
	}
	
	/*
	 * 평점계산메쏘드
	 */
	void grade() {
		if(this.avg>=90) {
			this.grade = 'A';
		}else if(this.avg<90 &&this.avg>=80) {
			this.grade = 'B';
		}else if(this.avg<80 && this.avg>=70) {
			this.grade = 'C';
		}else if(this.avg<70 && this.avg>=60) {
			this.grade = 'D';
		}else {
			this.grade = 'F';
		}
	}
	
	
	/*
	 * 출력메쏘드
	 */
	void headerPrint() {
		System.out.printf("--------------학생 성적출력--------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");
	}
	void scorePrint() {
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4c%n", this.no,this.name ,this.kor,this.eng,this.math,this.tot,this.avg,this.grade,this.rank);
	}
	void endPrint() {
		System.out.printf("-----------------------------------------------%n");
		
	}
	
}