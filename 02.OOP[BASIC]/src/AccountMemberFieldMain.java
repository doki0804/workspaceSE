
public class AccountMemberFieldMain {

	public static void main(String[] args) {
		/*******************case1*********************/
		
		/*
		 * 1.1111번호 계좌 8000 입금
		 */
		/*
		 * 1-1. 계좌객체생성
		 * 1-2. 계좌데이타 대입
		 */
		Account acc1 = new Account();
		acc1.no = 1111;
		acc1.owner="Kim";
		acc1.balance = 10000;
		acc1.iyul = 3.0;
		/*
		 * 1-3. 8000원 입금
		 */
		acc1.balance += 8000;
		
		/*
		 * 2.1111 계좌 정보출력
		 */
		System.out.println("----------------------");
		System.out.printf("%s %s  %s %s\n","번호","이름","잔고","이율");
		System.out.println("----------------------");
		System.out.printf("%d %2s %6d %.1f\n",acc1.no,acc1.owner,acc1.balance,acc1.iyul);
		
		System.out.println("=======================================");		
		
		/*******************case2*********************/
		/*
		 * 1.은행모든계좌에 잔고 50원증가
		 */
		Account a1 = new Account(); // Account 클래스를 사용한 객체를 힙메모리에 생성하여 주소값을 Account 타입의 참조변수 a1에 대입
		a1.no = 1000;
		a1.owner = "choi";
		a1.balance = 10000;
		a1.iyul = 2.0;
		
		Account a2 = new Account();
		a2.no = 2000;
		a2.owner = "Lee";
		a2.balance = 9000;
		a2.iyul = 1.0;
		
		Account a3 = new Account();
		a3.no = 3000;
		a3.owner = "Park";
		a3.balance = 11000;
		a3.iyul = 1.5;
		
		a1.balance += 5;
		a2.balance += 5;
		a3.balance += 5;
		
		/*
		 * 2.은행계좌 전체정보출력
		 */
		System.out.println("----------------------");
		System.out.printf("%s %s  %s %s\n","번호","이름","잔고","이율");
		System.out.println("----------------------");
		System.out.printf("%d %2s %6d %.1f\n",a1.no,a1.owner,a1.balance,a1.iyul);
		System.out.println("----------------------");
		System.out.printf("%d %2s %6d %.1f\n",a2.no,a2.owner,a2.balance,a2.iyul);
		System.out.println("----------------------");
		System.out.printf("%d %2s %6d %.1f\n",a3.no,a3.owner,a3.balance,a3.iyul);
	}

}
