
public class IfScorePrintReturn {
	
	public static void main(String[] args) {
		
		int kor = 90;
		/*
		 * 점수 유효성판단
		 */
		if (kor<0 || kor>100) {
			System.out.println(kor+"은 유효한점수가 아닙니다.");
			return; // 실행흐름을 반환함
		}
		/*
		 * 평점계산
		 */
		char grade = 'x';
		
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
		System.out.println("학점은 "+grade+" 입니다.");
		return;
	}

}
