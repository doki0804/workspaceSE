
public class MemberMethodReturnMain {

	public static void main(String[] args) {
		MemberMethodReturn mmr = new MemberMethodReturn();
		int returnData1 = mmr.method1();
		System.out.println("main block --> returnData1:"+returnData1);
		boolean returnData2 = mmr.method2();
		System.out.println("main block --> returnData2:"+returnData2);
		
		int returnData3 = mmr.add(3,8);
		System.out.println("main block --> returnData3:"+returnData3);
		System.out.println("main block --> returnData3:"+mmr.add(1,3));
		String name="이원호";
		String returnMessage1 = mmr.hello(name);
		/*
		 * returnMessage1: 이원호님 안녕하세요
		 */
		System.out.println("main block-->returnMessage1:"+returnMessage1);
		System.out.println("main block-->returnMessage1:"+mmr.hello("짱구"));
		
		System.out.println("***************setter메쏘드호출*******************");
		mmr.setMemberField1(111111);
		mmr.setMemberField2(222222);
		mmr.setMemberField3(333333);
		
		System.out.println("***************getter메쏘드호출*******************");
		System.out.println("------main block memberField값 사용(출력)------");
		/*
		 * int memberField1 = mmr.memberField1;
		 * System.out.println("memberfiled1:"+memberField1);
		 */
		int returnMemberField1 = mmr.getMemberField1 ();
		System.out.println("returnMemberField1:"+returnMemberField1);
		System.out.println("returnMemberField1:"+mmr.getMemberField2());
		System.out.println("returnMemberField1:"+mmr.getMemberField3());
		
		
		
	}

}
