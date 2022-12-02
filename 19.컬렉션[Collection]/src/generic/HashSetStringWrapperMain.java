package generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class HashSetStringWrapperMain {

	public static void main(String[] args) {
		
		System.out.println("------------String------------");
		HashSet<String> nameSet = new HashSet<String>();
		nameSet.add("KIM");
		nameSet.add("JIM");
		nameSet.add("GIM");
		nameSet.add("SIM");
		System.out.println(nameSet);
		boolean isAdd=nameSet.add("KIM"); //HashSet과 HashMap은 같은 객체가 들어가지 않는다.
		System.out.println("추가여부 : "+isAdd);
		System.out.println(nameSet);
		
		HashSet<Integer> lottoSet = new HashSet<Integer>();
		while(lottoSet.size() < 6) {
			lottoSet.add((int)(Math.random()*45+1));
		}
		ArrayList<Integer> sortLotto = new ArrayList<>(lottoSet);
		Collections.sort(sortLotto);
		System.out.println(sortLotto);
		
		
		
		
		
	}
}
