package dao.address;

public class AddressSQL {
	public AddressSQL() {
	}

	public final static String ADDRESS_INSERT = "insert into address values(address_no_SEQ.nextval,?,?,?)";
	public final static String ADDRESS_UPDATE = "update address set name = ?, phone = ?, address = ? where no = ?";
	public final static String ADDRESS_DELETE = "delete address where no= ?";
	public final static String ADDRESS_SELECTE_BY_NO = "select no,name,phone,address from address where no=?";
	public final static String ADDRESS_SELECTE_BY_ALL = "select no,name,phone,address from address";
}
