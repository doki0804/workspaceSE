package dao.address;

public class AddressSQL {
	private static String insertSQL = "insert into address values(address_no_SEQ.nextval,?,?,?)";
	private static String updateSQL = "update address set name = ?, phone = ?, address = ? where no = ?";
	private static String deleteSQL = "delete address where no= ?";
	private static String selectSQL = "select no,name,phone,address from address where no=?";
	private static String allSelectSQL = "select no,name,phone,address from address";
}
