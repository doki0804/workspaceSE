package dao.address.third;

public class AddressDao3TestMain {

	public static void main(String[] args) throws Exception {
		/*
		 * AddressDao3TestMain에서
		 * AddressDao3로 파라메타객체(DTO,VO)를 전달
		 */
		AddressDao3 addressDao3 = new AddressDao3();
		System.out.println("1.insert");
		Address newAddress = new Address(0,"홍진경","111-3333","대구시민");
		addressDao3.insert(newAddress);
		System.out.println("2.update");
		addressDao3.update(new Address(10,"김변경","000-0000","주소변경"));
		System.out.println("3.delete");
		addressDao3.delete(new Address(16,"","",""));
		System.out.println("4.findByPrimaryKey");
		addressDao3.findByPrimaryKey(new Address(10,"","",""));
		System.out.println("5.findAll");
		addressDao3.findAll();
	}

}
