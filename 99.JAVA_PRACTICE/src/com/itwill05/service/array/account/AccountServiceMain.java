package com.itwill05.service.array.account;
public class AccountServiceMain {
	public static void main(String[] args) {
		AccountService accountService=new AccountService();
		/*
		<<과제아님>>
		System.out.println("0.AccountService객체야 Account추가(배열사이즈증가)[OPTION]");
		*/
		System.out.println("1.AccountService객체야 은행계좌들 총계좌수출력해줘");
		accountService.totAccountNumberPrint();
		System.out.println("2.AccountService객체야 은행계좌들 전체출력해줘");
		accountService.print();
		System.out.println("3.AccountService객체야 은행계좌들 총잔고 출력해줘");
		accountService.totBalancePrint();
		System.out.println("4.AccountService객체야 계좌번호줄께 계좌한개출력해줘");
		accountService.findByNoPrint(3333);
		accountService.findByNoPrint(7777);
		System.out.println("5.AccountService객체야 계좌잔고줄께 잔고이상인 계좌들출력해줘");
		accountService.findByBalancePrint(80000);
		System.out.println("6.AccountService객체야 계좌이율 인자로줄께 이율이상인 계좌들출력해줘");
		accountService.findByIyulPrint(2.0);
		System.out.println("7.AccountService객체야 계좌주이름 인자로줄께 계좌주이름과일치하는 계좌들출력해줘");
		accountService.findByNamePrint("KIM");
		System.out.println("8.AccountService객체야 계좌번호,입금할돈 인자로줄께 입금해줘");
		accountService.ipGum(1111,10000);
		System.out.println("9.AccountService객체야 계좌번호,출금할돈 인자로줄께 출금해줘");
		accountService.chulGum(1111,8000);
		System.out.println("10.AccountService객체야 계좌를 잔고순으로 오름차순정렬해줘");
		accountService.sortByBalanceAscending();
		Account.headerPrint();
		accountService.totAccountPrint();
		System.out.println("11.AccountService객체야 계좌를 잔고순으로 내림차순정렬해줘");
		accountService.sortByBalanceDescending();
		Account.headerPrint();
		accountService.totAccountPrint();
		
		/*
		<<과제아님>>
		accountService.sort(AccountService.SORT_BY_NO, AccountService.SORT_ASC);
		System.out.println("12.AccountService객체야 계좌객체줄께 (이름,잔고,이율) 수정(update)해줘)[OPTION]");
		System.out.println("13.AccountService객체야 번호,이름,잔고,이율 계좌 데이타줄께 이름,잔고,이율 수정(update)해줘)[OPTION]");
		*/
		System.out.println("------------------정렬------------------"+"\n"
				+"sortField --> 1:번호,2:이름,3:잔고,4:이율 "+"\n"
				+"sortOrder --> 1:오름차순,2:내림차순");
		accountService.sort(2,2);
		Account.headerPrint();
		accountService.totAccountPrint();
		
		System.out.println("12.AccountService객체야 계좌객체줄께 (이름,잔고,이율) 수정(update)해줘)[OPTION]");
		Account account1 = new Account(1212,"ZIM",64000,2.9);
		accountService.addAccount(account1);
		accountService.totAccountPrint();	
		accountService.addAccount(2323, "SON", 112000, 3.3);
		accountService.totAccountPrint();
		
		System.out.println("13.AccountService객체야 번호,이름,잔고,이율 계좌 데이타줄께 이름,잔고,이율 수정(update)해줘)[OPTION]");
		
		Account account2 = new Account(1111,"LEE",130000,3.7);
		accountService.updateAccount(account2);
		
		
		/*
		 * Quiz:
		 *   김씨를 새로운 배열에 담아보세요
		 */
		/*
		 * 김씨배열length측정 밑 생성
		 */
		
		System.out.println("-------------친구들-------------");
		String[] names = {"정경호","김미숙","최경녀","김은희","신명숙"};
		for (String named : names) {
			if(named.startsWith("김")) {
				System.out.println("김씨인사람 : "+named);
				}
		}
		String[] kimArray=null;
		int length=0;
		for (int i=0 ; i<names.length;i++ ) {
			if(names[i].startsWith("김")) {
				length++;
			}
		}
		kimArray = new String[length];
		/*
		 * 새로 생성한 배열에 김씨를 찾아 대입
		 */
		int indexNo=0;
		for (int i=0; i<length;i++) {
			for(int j=indexNo; j<names.length; j++ ) {
				if(names[j].startsWith("김")) {
					indexNo  = j+1;
					kimArray[i]=names[indexNo];
					break;
				}
			}
		}
		for (String string : kimArray) {
			System.out.print(string+ " ");
		}
	}
}