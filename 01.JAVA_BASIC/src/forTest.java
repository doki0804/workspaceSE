
public class forTest {

	public static void main(String[] args) {
		int k=0; // 1.반복변수선언 초기화
		while(k<10) { //2.반복변수비교(반복조건)
			//3.반복문
			System.out.println("k="+k);
			k++;//4.반복변수증가(감소)
		}
		System.out.println("----for i증가----");
		for(int i=0; i<10 ; i++) { // for(1.반복변수초기화선언 ; 2반복조건검사 ; 4.반복변수증가) (1~4는 thread흐름순서)
			System.out.println("i="+i); // 3.반복문실행
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("i="+i);
		}
		System.out.println("---- for i감소 ----");
		
		for (int i = 10; i > 0; i--) {
			System.out.println("i="+i);
		}
	    System.out.println(">>홀수만출력[1~100]");
	    
	    for(int i=0; i <= 100; i++) {
	    	if(i%2==1) {
	    		System.out.println(i+"");
	    	}
	    }
	    System.out.println(">>짝수만출력[1~100]");
	    
	    for(int i=0; i <= 100; i++) {
	    	if(i%2==1) {
	    		/*
	    		 *  - 홀수조건을 만족하면 continue문이 실행되고 
	    		 *    현재실행중인 for블록을 실행하지 않고 
	    		 *    다음횟수의 블록을 실행한다.
	    		 */
	    		continue;
	    		/*
	    		 * 1.continue 문 이후의 for 블록코드를 실행하지 않는다.
	    		 * 2.다음 반복을 계속(continue)실행한다.
	    		 */
	    	}
	    	/*
	    	 * 짝수출력
	    	 */
	    	System.out.print(i+" ");
	    }
		
	    System.out.println();
	    System.out.println(">>4d의배수 출력[1~100]");
	    for(int i =1; i<=100; i++) {
	    	if(i%4==0) {
	    		System.out.print(i+" ");
	    	}
	    }
	    System.out.println();
	    System.out.println(">>3과4의 공배수출력[1~100]");
	    for(int i=1; i<=100; i++) {
	    	if(i%4==0 && i%3==0) {
	    		System.out.print(i+" ");
	    	}
	    }
	    System.out.println();
	    System.out.println(">>3과4의 최소공배수출력[1~100]");
	    for(int i=1; i<=10; i++) {
	    	if(i%4==0 && i%3==0) {
	    		System.out.print(i+" ");
	    		break;
	    		/*
	    		 * break문
	    		 *  1. 반복문에서 사용가능
	    		 *  2. break문이후의 for블록코드를 시행하지 않음
	    		 *  3. 다음반복문도 실행하지 않는다. (반복블록을 빠져나옴)
	    		 */
	    	}
	    }
	    
	    System.out.println();
	    System.out.println(">>홀수짝수합[1~100]");
	    
	    int oddTotal=0, evenTotal=0;
	    for(int i=1; i<=100; i++) {
	    	if(i%2==0) {
	    		//짝수 누적
	    		evenTotal+=i;//evenTotal = evenTotal+i
	    	}else {
	    		//홀수 누적
	    		oddTotal+=i;//oddTotal = oddTotal+i
	    	}
	    }
	    System.out.println("짝수합:"+evenTotal);
	    System.out.println("홀수합:"+oddTotal);
	    
	    System.out.println("-----문자출력-----");
	    for(char c='a';c<='z';c++) {
	    	System.out.print(c);
	    	if(c=='z' || (c-'a'+1)%5==0) {	
	    		System.out.println();
	    		continue;
	    	}
	    	
	    	System.out.print(",");
	    	/*
	    	 * 5개문자찍고개행
	    	 */
	    }
	    System.out.println();
	    	
	    
	    
	    
	    
		
		
	}

}
