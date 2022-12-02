
public class WhileUseChar {

	public static void main(String[] args) {
		/*
		 * 문자출력
		 
		char c1 = 0;
		while(c1 < 65535) {
			++c1;
			System.out.print(c1+" ");
			if(c1%100==0) {
				System.out.println();
			}
		}
		System.out.println();
		*/
		
		/*
		 * - 영문소문자출력
		 */
		char c2 = 'a';
		while (c2<='z') {
			System.out.print(c2);
			System.out.print(", ");
			c2++;
			
		}
		System.out.println();
		
		/*
		 * - 영문소문자출력
		 * a, b, c, d, e
		 * f, g, h, i, j
		 * k, l, m, n, o
		 * p, q, r, s, t
		 * u, v, w, x, y
		 * z
		 */
		System.out.println();
		
		char c3 = 'a';
		int letterCount=0;
		while(c3<='z') {
			++letterCount;
			System.out.print(c3);
			if(c3!='z' && letterCount%5 != 0) {
			System.out.print(", ");
			}
			
			if(letterCount%5==0) {
				System.out.println();
			}
			c3++;
		}
		/*
		 * - 한글출력
		 * - 숫자형물자(0~9)출력
		 */
		
		char han='가';
		while (han <='힣') {
			System.out.print(han);
			if((han-'가'+1)%20==0) {
				System.out.println();
			}
			han++;
		}
		
	}

}
