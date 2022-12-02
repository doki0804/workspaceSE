
public class IfScorePrint {

	public static void main(String[] args) {
		/*
		 * 점수의 유효성체크
		 */
		int kor = 90;
		
		if (kor >= 0 && kor <= 100) {
			/*
			 * 학점계산
			 */
			char grade = 'X';

			if (kor >= 90) {
				grade = 'A';
			} else if (kor >= 80) {
				grade = 'B';
			} else if (kor >= 70) {
				grade = 'C';
			} else if (kor >= 60) {
				grade = 'D';
			} else {
				grade = 'F';
			}
			
			System.out.printf("학점은 %c 입니다.", grade);
		} else {
			System.out.printf("%d 은 유효한점수가 아닙니다.\n", kor);
		}
		
		
		

	}

}
