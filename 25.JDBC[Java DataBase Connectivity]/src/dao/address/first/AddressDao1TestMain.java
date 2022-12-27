package dao.address.first;

public class AddressDao1TestMain {

	public static void main(String[] args) throws Exception {
		AddressDao1 addressDao1 = new AddressDao1();
		addressDao1.findAll();
		addressDao1.findByPrimaryKey();
		addressDao1.insert();
		addressDao1.update();
		addressDao1.delete();
		addressDao1.findAll();
		
	}

}
