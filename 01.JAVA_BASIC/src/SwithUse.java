
public class SwithUse {

	public static void main(String[] args) {
		/*
		 * 짝수홀수판별
		 */
		int number=23;
		switch (number%2) {
		case 0:
			System.out.println(number+"는 짝수입니다.");
			break;
		case 1:
			System.out.println(number+"는 홀수입니다.");
			break;

		}
		
		char direction='S';
		switch (direction) {
		case 'a':
		case 'A':
			System.out.println("move left~");
			break;
		case 'd':
		case 'D':
			System.out.println("move right~");
			break;
		case 'w':
		case 'W':
			System.out.println("move up~");
			break;
		case 'x':
		case 'X':
			System.out.println("move down~");
			break;
		case 's':
		case 'S':
			System.out.println("move rotate~");
			break;
		default:
			System.out.println("don't move~");
			break;
		}
		/*
		 * Quiz: 대소문자 구분없이 X,x 실행하도록 해보세요
		 * 
		 */
		
		

	}

}
