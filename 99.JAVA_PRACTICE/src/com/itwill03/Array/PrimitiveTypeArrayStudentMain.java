package com.itwill03.Array;

public class PrimitiveTypeArrayStudentMain {

	public static void main(String[] args) {
		/*
		 * 배열객체 생성 초기화
		 */
		System.out.println("----학생10명데이타를 저장하기위한 배열객체생성 초기화----");
		int[] noArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		String[] nameArray = { "KIM", "LEE", "PARK", "CHOI", "SIM", "KIM", "PIM", "MIN", "AIM", "LIM" };
		int[] korArray = { 12, 45, 34, 66, 98, 93, 82, 61, 72, 88 };
		int[] engArray = { 32, 46, 64, 96, 58, 98, 62, 81, 32, 99 };
		int[] mathArray = { 93, 89, 88, 46, 54, 23, 90, 85, 73, 34 };
		int[] totArray = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		double[] avgArray = { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0 };
		char[] gradeArray = { 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F', 'F' };
		int[] rankArray = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		/*
		 * 총점,평균,평점계산
		 */
		for (int i = 0; i < noArray.length; i++) {
			// 총점
			totArray[i] = korArray[i] + engArray[i] + mathArray[i];
			// 평균
			avgArray[i] = totArray[i] / 3.0;
			// 평점
			if (avgArray[i] >= 90) {
				gradeArray[i] = 'A';
			} else if (avgArray[i] >= 80) {
				gradeArray[i] = 'B';
			} else if (avgArray[i] >= 70) {
				gradeArray[i] = 'C';
			} else if (avgArray[i] >= 60) {
				gradeArray[i] = 'D';
			} else {
				gradeArray[i] = 'F';
			}

		}
		/*
		 * 총점으로석차계산
		 */
		/*
		 * 1번학생(index = 0)석차계산
		for(int j=0;j<totArray.length;j++) {
			if(totArray[0] < totArray[j]) {
				rankArray[0]=rankArray[0]+1;
			}
		}
		 */
		/*
		 * 2번학생(index = 1)석차계산
		for(int j=0;j<totArray.length;j++) {
			if(totArray[1]< totArray[j]) {
				rankArray[1]++;
			}
		}
		 */
		 /*
		 * 3번학생석차계산
		 * 4번학생석차계산
		 * 5번학생석차계산
		 * 6번학생석차계산
		 * 7번학생석차계산
		 * 8번학생석차계산
		 * 9번학생석차계산
		 * 10번학생석차계산
		 */
		for(int i=0; i<noArray.length;i++) {
			for(int j=0; j<noArray.length; j++) {
				if(totArray[i] < totArray[j]) {
					rankArray[i]++;
				}else if(totArray[i]==totArray[j] ) {

				}
			}
		}
		/*
		 * 학생검색(번호,국어,영어,수학,학점)
		 */
		
		/*
		 * 번호3번인 학생 1명찾아서 1명정보출력(학생번호는 중복되지않는다.)
		 */
		System.out.println(">>3번학생 찾아서 1명정보출력(학생번호는 중복되지않는다.)");
		headerPrint();
		for(int i=0;i<noArray.length;i++) {
			if(noArray[i]==3) {
				System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
				break;
			}
		}
		/*
		 * 국어점수 80점인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println(">>국어점수 80점인 학생들 여러명 찾아서 여러명정보출력");
		headerPrint();
		for (int i = 0; i < noArray.length; i++) {
			if(korArray[i]==80) {
				System.out.printf("%2d %7s %3d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		/*
		 * 영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println(">>영어점수 50점이하인 학생들 여러명 찾아서 여러명정보출력");
		headerPrint();
		for (int i = 0; i < noArray.length; i++) {
			if(engArray[i]<=50) {
				System.out.printf("%2d %7s %3d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		/*
		 * 수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력
		 */
		System.out.println(">>수학점수 70점이상인 학생들 여러명 찾아서 여러명정보출력");
		headerPrint();
		for (int i = 0; i < noArray.length; i++) {
			if(mathArray[i]>=70) {
				System.out.printf("%2d %7s %3d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		/*
		 * 학점이 D학점이하인 학생모두찾아서 여러명 정보출력
		 */
		System.out.println(">>학점이 D학점이하인 학생모두찾아서 여러명 정보출력");
		headerPrint();
		for (int i = 0; i < noArray.length; i++) {
			if(gradeArray[i]>='D') {
				System.out.printf("%2d %7s %3d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
						engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
			}
		}
		
		
		
		
	
		/*
		 * 정렬
		 *    1.오름차순 
		 *      ex> 1,2,3,4,5....
		 *          a,b,c,d,e....,가 ... 힣
		 *    2.내림차순
		 *    	ex> 5,4,3,2,1
		 *          z,y,x.... , 힣  ... 가
		 */
		
		
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> 정렬전  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.printf("---------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}
		
		/*
		 학생총점순으로 오름차순정렬
		 https://www.youtube.com/watch?v=ebI54DXYQG8
		 */
		
		for(int i=1; i < noArray.length; i++) {
			for(int j=0; j<noArray.length-i; j++) {
				if(totArray[j]<totArray[j+1]) {
					//swap tot
					int tempTot = totArray[j];
					totArray[j] = totArray[j+1];
					totArray[j+1] = tempTot;
					
					int tempNo = noArray[j];
					noArray[j] = noArray[j+1];
					noArray[j+1] = tempNo;
					
					int tempKor = korArray[j];
					korArray[j] = korArray[j+1];
					korArray[j+1] = tempKor;
					
					int tempEng = engArray[j];
					engArray[j] = engArray[j+1];
					engArray[j+1] = tempEng;
					
					int tempMath = mathArray[j];
					mathArray[j] = mathArray[j+1];
					mathArray[j+1] = tempMath;
					
					int tempRank = rankArray[j];
					rankArray[j] = rankArray[j+1];
					rankArray[j+1] = tempRank;
					
					String tempName = nameArray[j];
					nameArray[j] = nameArray[j+1];
					nameArray[j+1] = tempName;
					
					double tempAvg = avgArray[j];
					avgArray[j] = avgArray[j+1];
					avgArray[j+1] = tempAvg;
					
					char tempGrade = gradeArray[j];
					gradeArray[j] = gradeArray[j+1];
					gradeArray[j+1] = tempGrade;
					
				}
			
			
			}
		}
		System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>> 정렬후 >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		headerPrint();
		for (int i = 0; i < noArray.length; i++) {
			System.out.printf("%4d %-6s %d %4d %4d %4d %5.1f %3c %4d \n", noArray[i], nameArray[i], korArray[i],
					engArray[i], mathArray[i], totArray[i], avgArray[i], gradeArray[i], rankArray[i]);
		}
	}
	public static void headerPrint() {
		System.out.printf("---------------학생 성적출력-------------------\n");
		System.out.printf("%s %3s %s %s %s %s %3s %s %s%n", "학번", "이름", "국어", "영어", "수학", "총점", "평균", "평점", "석차");
		System.out.printf("-----------------------------------------------\n");
	}

}