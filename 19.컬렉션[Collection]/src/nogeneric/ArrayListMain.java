package nogeneric;

import java.util.ArrayList;

import generic.Account;

public class ArrayListMain {

	public static void main(String[] args) {
		Account acc1 = new Account(1111, "BING", 33000, 0.5);
		Account acc2 = new Account(2222, "KING", 12000, 0.1);
		Account acc3 = new Account(3333, "KING", 89000, 0.8);
		Account acc4 = new Account(4444, "YONG", 45000, 1.2);
		Account acc5 = new Account(5555, "SANG", 99000, 0.9);
		
		ArrayList accountList = new ArrayList();
		int size = accountList.size();
		System.out.println("#size: "+size);
		System.out.println("************** 1.add[맨 마지막 index에 객체저장] **************");
		accountList.add(acc1);
		accountList.add(acc2);
		accountList.add(acc3);
		System.out.println("#size: "+accountList.size());
		System.out.println(accountList);
		accountList.add(acc4);
		accountList.add(acc5);
		System.out.println("#size: "+accountList.size());
		System.out.println(accountList);
		System.out.println("************** 2.add(index,element)[지정된 index에 객체저장] **************");
		accountList.add(2,new Account(3332, "KING", 68000, 2.3));
		System.out.println("#size: "+accountList.size());
		System.out.println(accountList);
		System.out.println("************** 3.add(index,element)[지정된 index에 객체저장] **************");
		accountList.set(5, new Account(9999, "LAST", 99999, 8.8));
		System.out.println("#size: "+accountList.size());
		System.out.println(accountList);
		System.out.println("************** 4. get(index) **************");
		Account getAccount = (Account)accountList.get(1);
		System.out.println(getAccount);
		System.out.println("************** 4. remove(index) **************");
		Account removeAccount = (Account)accountList.remove(accountList.size()-1);
		System.out.println("#size: "+accountList.size());
		System.out.println(accountList);
		
		System.out.println("%%%%%%%%%%%%%%%%%%업무실행%%%%%%%%%%%%%%%%%%%");
		System.out.println("**************1.계좌전체출력**************");
		Account.headerPrint();
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			tempAccount.print();
		}
		Account.headerPrint();
		for (Object objectAccount : accountList) {
			/*
			Account tempAccount = (Account)objectAccount;
			tempAccount.printAccountData();
			*/
			((Account)objectAccount).print();
		}
		System.out.println("**************2.계좌번호3333번 한개찾기**************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getNo()==3333) {
				tempAccount.print();
				break;
			}
		}
		System.out.println("**************3.계좌주이름 \"KING\"인계좌 여러개찾기**************");
		for (int i = 0; i < accountList.size(); i++) {
			if(((Account)accountList.get(i)).getOwner().equals("KING")) {
				((Account)accountList.get(i)).print();
			}
		}
		System.out.println("**************4.계좌번호4444번 한개삭제**************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getNo() == 4444) {
				System.out.println(">> remove 전 size: "+accountList.size());
				Account rAccount=(Account)accountList.remove(i);
				rAccount.print();
				System.out.println(">> remove 후 size: "+accountList.size());
				break;
			}
		}
		System.out.println("**************5.계좌주이름 \"KING\"인계좌 여러개삭제**************");
		for (int i = 0; i < accountList.size(); i++) {
			Account tempAccount = (Account)accountList.get(i);
			if(tempAccount.getOwner().equals("KING")) {
				Account rAccount = (Account)accountList.remove(i);
				rAccount.print();
				i--;
			}
		}
		System.out.println(accountList);
		
		
		
	}
}
