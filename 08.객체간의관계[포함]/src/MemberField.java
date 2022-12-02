
public class MemberField {
	/*
	 * 1-1.인스턴스 멤버필드는 객체생성시 기본값으로 자동초기화
	 */
	 public int member1;	  // 0
	 public double member2;   // 0.0
	 public char member3;	  // 0
	 public boolean member4;  // false

	 public String member5;   // null
	 public DuoMember member6;// null
	 /*
	  * 1-2.인스턴스 멤버필드는 선언시 초기값으로 초기화할 수 있다.
	  */
	 public int member11=9999;
	 public double member22=1.2345;
	 public char member33='힣';
	 public boolean member44=true;
	 
	 public String member55="하이";
	 public DuoMember member66=new DuoMember();
	 
	 public MemberField() {
		
	}

	public MemberField(int member1, double member2, char member3, boolean member4, String member5, DuoMember member6) {
		
		this.member1 = member1;
		this.member2 = member2;
		this.member3 = member3;
		this.member4 = member4;
		this.member5 = member5;
		this.member6 = member6;
	}
	 
	 
}
