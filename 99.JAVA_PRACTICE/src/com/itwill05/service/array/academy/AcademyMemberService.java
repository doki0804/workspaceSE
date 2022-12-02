package com.itwill05.service.array.academy;

/*
 * AcademyMember들의 업무처리클래스
 *  Create
 *  Read
 *  Update
 *  Delete
 */
public class AcademyMemberService {

	public static final int STUDENT=1;
	public static final int GANGSA=2;
	public static final int STAFF=3;
	public static final int JAVA_BAN=4;
	public static final int SUBJECT_JAVA=5;
	public static final int DEPART_SALES=6;
	private int count=0;
	private AcademyMember[] tempReference;
	
	private AcademyMember[] members;
	
	public AcademyMemberService() {
		members = new AcademyMember[9];
		members[0] = new AcademyStudent(1, "KIM", "자바");
		members[1] = new AcademyStudent(2, "LEE", "리눅스");
		members[2] = new AcademyStudent(3, "KIM", "자바");
		members[3] = new AcademyStudent(4, "LEE", "IOT");
		members[4] = new AcademyGangsa(5, "CHOI", "프로그래밍");
		members[5] = new AcademyGangsa(6, "KIM", "DB");
		members[6] = new AcademyGangsa(7, "DIM", "OS");
		members[7] = new AcademyStaff(8, "AIM", "영업");
		members[8] = new AcademyStaff(9, "QIM", "생산");

	}

	/*
	 * 1.AcademyMember 전체출력
	 */
	public void print() {
		for (AcademyMember academyMember : members) {
			academyMember.print();
		}
	}

	/*
	 * 2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘
	 * 
	 */
	public AcademyMember returnNoReference(int no) {
		AcademyMember tempReference = null;
		for (AcademyMember academyMember : members) {
			if(academyMember.getNo()==no) {
				tempReference = academyMember;
				break;
			}
		}
		return tempReference;
	}
	
	/*
	 * 2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘
	 */
	public AcademyMember[] returnNameReference(String name) {
		count(name);
		tempReference = new AcademyMember[count];
		int jcount=0;
		for (int i = 0; i < count; i++) {
			for (int j = jcount ; j < members.length; j++) {
				if(members[j].getName().equals(name)) {
					tempReference[i] = members[j];
					jcount = j+1;
					break;
				}
			}
			
		}
		return tempReference;
	}
	/*
	 * 3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyStaff객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 * 3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]
	 */
	public AcademyMember[] returnSubReference(int subName) {
		tempReference = null;
		count = 0;
		int jcount=0;
		switch(subName) {
		case STUDENT:
			for (int i = 0 ; i < members.length; i++) {
				if(members[i] instanceof AcademyStudent ) {
					count++;
				}
			}
			tempReference = new AcademyMember[count];
			for (int i = 0; i < count; i++) {
				for (int j = jcount ; j < members.length; j++) {
					if(members[j] instanceof AcademyStudent) {
						tempReference[i] = members[j];
						jcount = j+1;
						break;
					}
				}
			}
			break;
		case GANGSA:
			count = 0;
			for (int i = 0 ; i < members.length; i++) {
				if(members[i] instanceof AcademyGangsa ) {
					count++;
				}
			}
			tempReference = new AcademyMember[count];
			for (int i = 0; i < count; i++) {
				for (int j = jcount ; j < members.length; j++) {
					if(members[j] instanceof AcademyGangsa) {
						tempReference[i] = members[j];
						jcount = j+1;
						break;
					}
				}
			
			}
			break;
		case STAFF:
			count = 0;
			for (int i = 0 ; i < members.length; i++) {
				if(members[i] instanceof AcademyStaff ) {
					count++;
				}
			}
			tempReference = new AcademyMember[count];
			for (int i = 0; i < count; i++) {
				for (int j = jcount ; j < members.length; j++) {
					if(members[j] instanceof AcademyStaff) {
						tempReference[i] = members[j];
						jcount = j+1;
						break;
					}
				}
			}
			break;
		}
		
		return tempReference;
	}

	/*
	 * 4.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘 
	 * 4.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘
	 */
	public AcademyMember[] returnSubReferenceDetail(int subName, int detail) {
		count = 0;
		tempReference = null;
		int jcount=0;
		switch(subName) {
		case STUDENT:
			if(detail==JAVA_BAN) {
				for (int i = 0 ; i < members.length; i++) {
					if(members[i] instanceof AcademyStudent ) {
						AcademyStudent tempStudent = (AcademyStudent)members[i];
						if(tempStudent.getBan().equals("자바")) {
							count++;
						}
					}
				}
				tempReference = new AcademyMember[count];
				for (int i = 0; i < count; i++) {
					for (int j = jcount ; j < members.length; j++) {
						if(members[j] instanceof AcademyStudent) {
							AcademyStudent tempStudent = (AcademyStudent)members[j];
							if(tempStudent.getBan().equals("자바")) {
								tempReference[i] = members[j];
								jcount = j+1;
								break;
							}
						}
					}
				}
			}
			break;
		case GANGSA:
			count=0;
			if(detail==SUBJECT_JAVA) {
				for (int i = 0 ; i < members.length; i++) {
					if(members[i] instanceof AcademyGangsa ) {
						AcademyGangsa tempGangsa = (AcademyGangsa)members[i];
						if(tempGangsa.getSubject().equals("자바")) {
							count++;
						}
					}
				}
			}
			tempReference = new AcademyMember[count];
			for (int i = 0; i < count; i++) {
				for (int j = jcount ; j < members.length; j++) {
					if(members[j] instanceof AcademyGangsa) {
						AcademyGangsa tempGangsa = (AcademyGangsa)members[j];
						if(tempGangsa.getSubject().equals("자바")) {
							tempReference[i] = members[j];
							jcount = j+1;
							break;
						}
					}
				}
			}
			break;
		case STAFF:
			count=0;
			if(detail==DEPART_SALES) {
				for (int i = 0 ; i < members.length; i++) {
					if(members[i] instanceof AcademyStaff ) {
						AcademyStaff tempStaff = (AcademyStaff)members[i];
						if(tempStaff.getDepart().equals("영업")) {
							count++;
							
						}
					}
				}
			}
			tempReference = new AcademyMember[count];
			for (int i = 0; i < count; i++) {
				for (int j = jcount ; j < members.length; j++) {
					if(members[j] instanceof AcademyStaff) {
						AcademyStaff tempStaff = (AcademyStaff)members[j];
						if(tempStaff.getDepart().equals("영업")) {
							tempReference[i] = members[j];
							jcount = j+1;
							break;
						}
					}
				}
			}
			break;
		}
		return tempReference;
	}
	/*
	 * 5.AcademyMember 중에서 자바반인   AcademyStudent 객체들 배열참조변수반환해줘[OPTION]
	 * 5.AcademyMember 중에서 영업부서인 AcademyStaff   객체들 배열참조변수반환해줘[OPTION] 
	 * 5.AcademyMember 중에서 자바과목인 AcademyGangsa  객체들 배열참조변수반환해줘[OPTION]
	 */
	
	private void count(String name) {
		count=0;
		for (int i = 0 ; i < members.length; i++) {
			if(members[i].getName().equals(name)) {
				count++;
			}
		}
	}
	
}