
public class PackageMain {
	
	public static void main(String[] args) {
		com.itwill.shop.ShopService shopService = new com.itwill.shop.ShopService();
		System.out.println(shopService);
		com.itwill.shop.member.Member m1 = new com.itwill.shop.member.Member();
		System.out.println(m1);
		com.itwill.shop.member.MemberService ms = new com.itwill.shop.member.MemberService();
		System.out.println(ms);
	}
}
