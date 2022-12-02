package generic;

public class MyArrayListMain {

	public static void main(String[] args) {
		
		MyArrayList<Account> myArrayList = new MyArrayList<Account>();
		myArrayList.add(new Account());
		myArrayList.add(new Account());
		myArrayList.add(new Account());
		myArrayList.add(new Account());
		myArrayList.add(new Account());
		myArrayList.add(new Account());
		
		System.out.println("---------add---------");
		System.out.println("#List size : "+myArrayList.size());
		Account account = myArrayList.get(0);
		System.out.println(account);
		System.out.println("---------remove---------");
		Account removeAccount = myArrayList.remove(0);
		removeAccount.print();
		System.out.println("#List size : "+myArrayList.size());
		
	}
}
