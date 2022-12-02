
public class StudentScorePrint {
	public static void main(String[] args) {
		/*
		 * 성적관리에서 학생2명 데이타를 담을 변수선언 - 번호, 이름, 국어, 영어, 수학, 총점, 평균,
		 * 평점(A(90~100),B(80~89),C(70~79),D(60~69),F(0~59)), 석차
		 */
		int std1Num, std2Num, std1Kor, std2Kor, std1Eng, std2Eng, std1Math, std2Math, std1Total, std2Total ; 
		String std1Name, std2Name;
		double std1Avg, std2Avg;
		char grade1 = 0, grade2 = 0, rank = '0';
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학) 입력
		 */
		std1Num = 1;
		std2Num = 2;
		std1Name = "철수";
		std2Name = "영희";
		std1Kor = 87;
		std2Kor = 65;
		std1Eng = 86;
		std2Eng = 73;
		std1Math = 78;
		std2Math = 76;
		
		/*
		 * 학생2명의 국어, 영어, 수학점수의 유효성체크 - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하고 return(프로그램종료)한다.
		 */
		if(std1Kor < 0 || std1Kor >100) {
			System.out.println("유효한 점수가 아닙니다.");
			return;
		}else if(std1Eng < 0 || std1Eng >100) {
			System.out.println("유효한 점수가 아닙니다.");
			return;
		}else if(std1Math < 0 || std1Math >100) {
			System.out.println("유효한 점수가 아닙니다.");
			return;
		}else if(std2Kor < 0 || std2Kor >100) {
			System.out.println("유효한 점수가 아닙니다.");
			return;
		}else if(std2Eng < 0 || std2Eng >100) {
			System.out.println("유효한 점수가 아닙니다.");
			return;
		}else if(std2Math < 0 || std2Math >100) {
			System.out.println("유효한 점수가 아닙니다.");
			return;
		}
		
		/*
		 * 학생 2명의 기본데이터(번호, 이름, 국어, 영어, 수학)를 이용해서 총점, 평균, 평점, 계산 후 대입 (석차는 0을 대입)
		*/
		
		//총점계산
		std1Total = std1Kor + std1Eng + std1Math;
		std2Total = std2Kor + std2Eng + std2Math;
		//평균계산
		std1Avg = std1Total/3.0;
		std2Avg = std2Total/3.0;		
		
		//1번 학생의 평점대입		
		if (std1Avg >= 90) {
			grade1 = 'A';
		} else if(std1Avg >= 80){
			grade1 = 'B';
		} else if(std1Avg >= 70){
			grade1 = 'C';
		} else if(std1Avg >= 70){
			grade1 = 'D';
		} else {
			grade1 = 'F';
		}
		
		//2번 학생의 평점대입
		if (std2Avg >= 90) {
			grade2 = 'A';
		} else if(std2Avg >= 80){
			grade2 = 'B';
		} else if(std2Avg >= 70){
			grade2 = 'C';
		} else if(std2Avg >= 60){
			grade2 = 'D';
		} else {
			grade2 = 'F';
		}
				/*
				--------------학생 성적출력-------------------
				학번  이름   국어 영어 수학 총점 평균 평점 석차
				-----------------------------------------------
				 1   김경호   42   56   78   334  34.8  A   3  
				 2   김경수   45   53   76   334  34.8  A   2  
				-----------------------------------------------
				*/

		System.out.printf("--------------학생 성적출력-------------------%n");
		System.out.printf("%s %3s %3s %s %s %s %s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------%n");
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4c%n", std1Num, std1Name, std1Kor, std1Eng, std1Math, std1Total, std1Avg, grade1, rank);
		System.out.printf("%3d %4s %4d %4d %4d %4d %4.1f %3c %4c%n", std2Num, std2Name, std2Kor, std2Eng, std2Math, std2Total, std2Avg, grade2, rank);
		System.out.printf("-----------------------------------------------%n");
		
	}

}