package nogeneric;

import generic.Account;

public class MyArrayListMain {

	public static void main(String[] args) {
		MyArrayList myArrayList=new MyArrayList();
		System.out.println("# list size:"+myArrayList.size());
		myArrayList.add(new Account(1,"KIM",1000,0.1));
		myArrayList.add(new Account(2,"LEE",2000,0.2));
		myArrayList.add(new Account(3,"PARK",3000,0.3));
		myArrayList.add(new Account(4,"CHOI",4000,0.4));
		System.out.println("# list size:"+myArrayList.size());
		Account accountObject=(Account)myArrayList.get(2);
		accountObject.print();
		Account removeAccount=
				(Account)myArrayList.remove(4);
		System.out.println("# list size:"+myArrayList.size());
		Account.headerPrint();
		for(int i=0;i<myArrayList.size();i++) {
			Account tempAccount=
					(Account)myArrayList.get(i);
			tempAccount.print();
		}
	}

}