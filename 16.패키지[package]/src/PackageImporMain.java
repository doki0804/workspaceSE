import com.itwill.shop.ShopService;
import com.itwill.shop.member.Member;
import com.itwill.shop.member.MemberService;

public class PackageImporMain {
	
	public static void main(String[] args) {
		
		/*
		 * << 자동 import 단축키>>
		 * ctrl+shift+o
		 */
		ShopService shopService = new ShopService();
		System.out.println(shopService);
		Member m1 = new Member();
		System.out.println(m1);
		MemberService ms = new MemberService();
		System.out.println(ms);
		
	}

}
