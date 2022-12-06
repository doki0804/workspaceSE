

public class IfScorePrint 
{
	public static void main(String[] args) 
	{
		/*
		 * 학생2명 데이타를 담을변수선언
		 */
		int no1;
		String name1;
		int kor1,eng1,math1;
		int tot1;
		double avg1;
		char grade1;
		int rank1;
		
		int no2;
		String name2;
		int kor2,eng2,math2;
		int tot2;
		double avg2;
		char grade2;
		int rank2;
		
		/*
		 * 학생2명 기본데이타대입
		 *   학번,이름,국어,영어,수학
		 */
		
		/*
		 * 학생2명 기본데이타를 사용해서
		 *   총점 평균 평점계산후 대입
		 *   
		 */
		
		/*
		   - 100점이 넘는 수나 음수가 입력되면 메세지를 출력하세요
           - 평균은 소수점이하 1자리수까지만 출력하세요(반올림)
           - 출력포맷
		---------------학생 성적출력-------------------
		학번  이름   국어 영어 수학 총점 평균 평점 석차
		-----------------------------------------------
		 1   김경호   45   56   78   334  34.8  A   3  
		 2   김경수   45   56   78   334  34.8  A   2  
		-----------------------------------------------
		*/
		System.out.println("---------------학생 성적출력-------------------");
		System.out.println("학번  이름   국어 영어 수학 총점 평균 평점 석차");
		System.out.println("-----------------------------------------------");
		System.out.println(" 1   김경호   45   56   78   210  34.8  A   3  ");
		System.out.println(" 2   김경수   67   99   88   234  34.8  A   2  ");
		System.out.println("-----------------------------------------------");
		
	}
}
