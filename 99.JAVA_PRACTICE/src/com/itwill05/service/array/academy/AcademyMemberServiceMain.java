package com.itwill05.service.array.academy;

public class AcademyMemberServiceMain {

	public static void main(String[] args) {
		AcademyMemberService service = new AcademyMemberService();
		System.out.println("1.AcademyMember 전체출력");
		service.print();
		System.out.println("2-1.번호 1 번 AcademyMember 객체 참조변수반환해줘");
		service.returnNoReference(1);
		System.out.println(service.returnNoReference(1));
		System.out.println("2-2.이름 KIM 인 AcademyMember 배열객체 참조변수반환해줘");
		service.returnNameReference("KIM");
		System.out.println("3.AcademyMember 중에서 AcademyStudent객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		/*
		 * AcademyStudent = 1, AcademyGangsa = 2, AcademyGangsa = 3 
		 */
		AcademyMember[] members = null;
		members = service.returnSubReference(1);
		for (AcademyMember member : members) {
			System.out.println(member);
		}
		System.out.println("3.AcademyMember 중에서 AcademyStaff객체들  모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		members = service.returnSubReference(2);
		for (AcademyMember member : members) {
			System.out.println(member);
		}
		System.out.println("3.AcademyMember 중에서 AcademyGangsa객체들 모두반환해줘 [ AcademyMember[] 객체주소반환 ]");
		members = service.returnSubReference(3);
		for (AcademyMember member : members) {
			System.out.println(member);
		}
		/*
		 * Instance(subClass) : AcademyStudent = 1, AcademyGangsa = 2, AcademyGangsa = 3 
		 * Field : 자바반 = 4 자바과목 = 5 영업부서 = 6
		 */
		System.out.println(
		"4.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		members = service.returnSubReferenceDetail(1, 4);
		for (AcademyMember member : members) {
			System.out.println(member);
		}
		System.out.println(
		"4.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		members = service.returnSubReferenceDetail(3, 6);
		for (AcademyMember member : members) {
			System.out.println(member);
		}
		System.out.println(
		"4.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		members = service.returnSubReferenceDetail(2, 5);
		for (AcademyMember member : members) {
			System.out.println(member);
		}
		System.out.println("---------------------------------------------");
		System.out.println(
				"5.AcademyMember 중에서 자바반인  AcademyStudent객체들 배열참조변수반환해줘");
		System.out.println(
				"5.AcademyMember 중에서 영업부서인 AcademyStaff  객체들 배열참조변수반환해줘");
		System.out.println(
				"5.AcademyMember 중에서 자바과목인 AcademyGangsa 객체들 배열참조변수반환해줘");
		
	}

}