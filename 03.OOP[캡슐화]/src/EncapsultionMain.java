
public class EncapsultionMain {

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		/*
		 * encapsulation객체멤버 데이타대입
		 * The field Encapsultaion.memberField1
		 */
		/*
		encapsulation.memberField1=11;
		encapsulation.memberField2=true;
		encapsulation.memberField3='a';
		encapsulation.memberField4=2.34;
		*/
		encapsulation.setMemberField1(11);
		encapsulation.setMemberField2(true);
		encapsulation.setMemberField3('a');
		encapsulation.setMemberField4(2.34);
		/*
		 * encapsulation객체멤버 데이타출력
		 * The field Encapsultaion.memberField1
		 */
		System.out.println(encapsulation.getMemberField1());
		System.out.println(encapsulation.isMemberField2());
		System.out.println(encapsulation.getMemberField3());
		System.out.println(encapsulation.getMemberField4());
	}

}
 