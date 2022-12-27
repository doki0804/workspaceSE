package dao.address.third;

public class AddressDao3TestMain {

	public static void main(String[] args) throws Exception {
		/*
		 * AddressDao3TestMain에서
		 * AddressDao3로 파라메타객체(DTO,VO)를 전달
		 */
		AddressDao3 addressDao3 = new AddressDao3();
		System.out.println("1.insert");
		addressDao3.insert("이소라","343-9090","경기도민");
		System.out.println("2.update");
		addressDao3.update(16,"삼소라", "888-8888", "대전시 중구");
		System.out.println("3.delete");
		addressDao3.delete(16);
		System.out.println("4.findByPrimaryKey");
		addressDao3.findByPrimaryKey(10);
		System.out.println("5.findAll");
		addressDao3.findAll();
	}

}
