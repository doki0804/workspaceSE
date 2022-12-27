package dao.address.third;

public class AddressDao2TestMain {

	public static void main(String[] args) throws Exception {
		/*
		 * AddressDao2TestMain에서
		 * AddressDao2로 파라메타를 전달
		 */
		AddressDao2 addressDao2 = new AddressDao2();
		System.out.println("1.insert");
		addressDao2.insert("이소라","343-9090","경기도민");
		System.out.println("2.update");
		addressDao2.update(16,"삼소라", "888-8888", "대전시 중구");
		System.out.println("3.delete");
		addressDao2.delete(16);
		System.out.println("4.findByPrimaryKey");
		addressDao2.findByPrimaryKey(10);
		System.out.println("5.findAll");
		addressDao2.findAll();
	}

}
