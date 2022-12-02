
public class MemberMethodThisMain {
	public static void main(String[] args) {
		
		MemberMethodThis mmt1 = new MemberMethodThis();
		/*
		mmt1.memberField1 = 1;
		mmt1.memberField2 = 'A';
		mmt1.memberField3 = 95.4;
		*/
		mmt1.setMemberField(1,'A',95.4);
		/*
		 * MemberFieldThis객체 내용출력
		System.out.println(mmt1.memberField1+"\t"+mmt1.memberField2+"\t"+mmt1.memberField3);
		 */
		
		System.out.println("main block-->mmt1주소값:"+mmt1);
		mmt1.print();;

		MemberMethodThis mmt2 = new MemberMethodThis();
		/*
		mmt2.memberField1 = 2;
		mmt2.memberField2 = 'B';
		mmt2.memberField3 = 89.9;
		*/
		mmt2.setMemberField(2, 'B', 89.9);
		mmt2.print();
		
	}

}
