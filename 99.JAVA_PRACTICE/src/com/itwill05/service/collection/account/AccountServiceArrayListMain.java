package com.itwill05.service.collection.account;

import java.util.ArrayList;

public class AccountServiceArrayListMain {

	public static void main(String[] args) {

		AccountServiceArrayList accountServiceArrayList = new AccountServiceArrayList();
		System.out.println("0.AccountServiceArrayList야 은행계좌추가해줘");
		Account addAccount = new Account(1000, "고소영", 89000, 0.5);
		
		boolean isAdd = accountServiceArrayList.addAccount(addAccount);
		if(isAdd) {
			System.out.println("account추가성공");
		}else {
			System.out.println("중복계좌입니다");
		}
		accountServiceArrayList.addAccount(new Account(1001, "이소라", 30000, 3.3));
		System.out.println("1.AccountServiceArrayList야 은행계좌들 총계좌수반환해줘");
		int accountCount = accountServiceArrayList.totAccountNumber();
		System.out.println("총계좌수[main]:" + accountCount);
		System.out.println("2.AccountServiceArrayList야 은행계좌들 전체출력해줘");
		accountServiceArrayList.print();
		
		System.out.println("3.AccountServiceArrayList야은행계좌들 총잔고 반환해줘");
		int totBalance = accountServiceArrayList.totBalance();
		System.out.println("총잔고[main]:" + totBalance);
		System.out.println("4.AccountServiceArrayList야 계좌번호줄께 계좌한개반환해줘");
		Account findAccount = accountServiceArrayList.findByNo(5555);
		System.out.println("계좌한개[main]");
		findAccount.print();
		System.out.println("5.AccountServiceArrayList야 계좌잔고줄께 잔고이상인 계좌들반환해줘[OPTION]");
		ArrayList<Account> findAccounts = accountServiceArrayList.findByBalance(50000);
		System.out.println(" 반환계좌수:" + findAccounts.size());
		
		System.out.println("7.AccountServiceArrayList야은행계좌들 중에 계좌주이름이 AIM인 계좌들반환해줘");
		findAccounts=accountServiceArrayList.findByName("AIM");
		/*
		 * 8.6666번계좌 4000원 입금해줘
		 */
		System.out.println("8.AccountServiceArrayList야1111번계좌 50000원 출금한후에 Account객체반환해줘");
		Account chulGumAccount=
			accountServiceArrayList.chulGum(1111, 50000);
		chulGumAccount.print();
		System.out.println(" 8.6666번계좌 4000원 입금한후 Account객체반환받음");
		Account ipGumAccount=
				accountServiceArrayList.ipGum(6666, 4000);
		ipGumAccount.print();
		System.out.println("9.VIP계좌(잔고 70000원이상)들 반환해줘");
		findAccounts=accountServiceArrayList.findByBalance(70000);
		System.out.println("10.계좌를 잔고순으로 오름차순정렬해줘");
		accountServiceArrayList.sortByBalanceAsc();
		accountServiceArrayList.print();
		System.out.println("11.계좌를 잔고순으로 내림차순정렬해줘");
		accountServiceArrayList.sortByBalanceDesc();
		accountServiceArrayList.print();
		
		System.out.println(" 12.6666번계좌의 이름,잔고,이율 수정(update)후 Account객체반환받음");
		Account updateAccount1 = new Account(6666, "YYY", 900000000, 0.4);
		Account updateAccount2 = accountServiceArrayList.updateAccount(updateAccount1);
		updateAccount2.print();
		System.out.println(" 12.8888번계좌삭제후 Account객체반환받음");
		Account deleteAccount = accountServiceArrayList.deleteByNo(8888);
		deleteAccount.print();
		System.out.println("-----------전체계좌 출력-------------");
		accountServiceArrayList.print();
	}

}