import java.util.Comparator;

public class AccountOwnerAscComParator implements Comparator<Account> {

	@Override
	public int compare(Account o1, Account o2) {
		
		return o1.getOwner().compareTo(o2.getOwner()) > 0 ? 1 : 
			o1.getOwner().compareTo(o2.getOwner()) < 0 ? -1 :0;
	}

}
