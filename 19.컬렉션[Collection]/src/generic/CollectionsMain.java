package generic;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class CollectionsMain {

	public static void main(String[] args) {
		/*
		 * Collections 클래스
		 *   - Collection객체들의 Utility메쏘드 제공
		 */
		List<Integer> intList = Arrays.asList(34,45,78,90,23,10,99,20);
		
		List<String> stringList = Arrays.asList("유재석","조세호","김경호","이효리","유재식");
		System.out.println("------sort[intList]------");
		Collections.sort(intList);
		System.out.println(intList);
		System.out.println("------reverse[intList]------");
		Collections.reverse(intList);
		System.out.println(intList);
		System.out.println("------shuffle[intList]------");
		Collections.shuffle(intList);
		System.out.println(intList);
		System.out.println("------sort[StringList]------");
		Collections.sort(stringList);
		System.out.println(stringList);
		System.out.println("------reverse[StringList]------");
		Collections.reverse(stringList);
		System.out.println(stringList);
		
		System.out.println("-----------Account-----------");
		List<Account> accountList = 
				Arrays.asList(	new Account(4523,"BING",33000,0.5),
						new Account(2367,"KING",23000,0.1),
						new Account(1234,"KING",89000,0.2),
						new Account(8909,"YONG",99000,0.7),
						new Account(2789,"SANG",12000,0.3)
						);
		System.out.println("------sort[Comparable]------");
		Collections.sort(accountList);
		for (Account account : accountList) {
			account.print();
		}
		System.out.println("------reverse[Comparable]------");
		Collections.reverse(accountList);
		for (Account account : accountList) {
			account.print();
		}
		System.out.println("------sort[Comparator]------");
		System.out.println(">>> balnace desc");
		Collections.sort(accountList, new AccountBalanceDescComparator());
		System.out.println(accountList);
		System.out.println(">>> owner asc");
		Collections.sort(accountList, new AccountOwnerAscComParator());
		System.out.println(accountList);
		
	}
}
