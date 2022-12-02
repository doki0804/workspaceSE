
public class ReferenceTypeArrayMain {

	public static void main(String[] args) {
		/*
		int a=345;
		Account acc = new Account(8989, "SIM", 56000, 3.2);
		int[] ia = new int[5];
		ia[0]=23;
		*/
		Account[] accArray = new Account[5];
		accArray[0] = new Account(1111, "KIM", 8000, 2.1);
		accArray[1] = new Account(2222, "LIM", 7000, 1.7);
		accArray[2] = new Account(3333, "MIN", 6000, 2.2);
		accArray[3] = new Account(4444, "LEE", 9000, 1.5);
		accArray[4] = new Account(5555, "NAM", 9800, 1.6);
		Account.headerPrint();
		for(int i=0;i<accArray.length;i++) {
			accArray[i].printAccountData();
		}
		
		
	}

}
