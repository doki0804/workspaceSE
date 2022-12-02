
public class OperatorUnary {
	
	public static void main(String[] args) {
		int a=1;
		int b=2;
		
		int ar = -a;
		int br = +b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(ar);
		System.out.println(br);
		
		boolean isPlay=true;
		System.out.println(isPlay);
		isPlay=!isPlay;
		System.out.println(isPlay);
		
		int kor=90;
		boolean isValidScore = kor >=0 && kor <= 100;
		System.out.println(isValidScore);
		boolean isInvalidScore =! isValidScore;
		System.out.println(isInvalidScore);
		
		/*
		 * 증가,감소 연산자
		 *  - 항은 반드시 변수여야함
		 *  - 형태 : ++, --
		 *  - 항변수의값을 정수1만큼 증가(감소)시킨후 항변수에 대입
		 */
		
		System.out.println("----------------[++i,--j]-----------------");
		int i=5;
		int j=5;
		
		++i; // i = i+1;
		--j; //j = j-1;
		System.out.println(i);
		System.out.println(j);
		System.out.println("----------------[i++,j--]-----------------");
		
		i=5;
		j=5;
		
		i++;
		j--;
		System.out.println(i);
		System.out.println(j);
		System.out.println("------------[i++,++j]--------------");
		i=5;
		j=5;
		System.out.println(++i);
		System.out.println(j++);// ++의 위치에 따라 증가하고 대입 혹은 대입하고 증가
		System.out.println(i);
		System.out.println(j);
		
		
		
		
		
		
	}

}
