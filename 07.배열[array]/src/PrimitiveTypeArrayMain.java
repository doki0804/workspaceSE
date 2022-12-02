/*
 배열:  
      - 같은데이타형을 가진 멤버필드(기억장소) 여러개의 모음 
      - 배열변수의 선언형식
           데이타타입[] 이름; ex> int[] ia; , char[] ca;
	  - 사용: 
	       1.배열타입객체의생성
		   2.배열객체멤버필드의 초기화 
      -특징   
		  1.모든 배열형의 변수는 참조변수이다.
		    (배열은 객체다.)
		  2.같은타입만 정의가가능하다 
		  3.길이가 고정되어있다. 
		 
 */
public class PrimitiveTypeArrayMain {

	public static void main(String[] args) {
		int intType;
		intType = 90;
		
		int[] intArray;
		intArray = new int[5];
		System.out.println("int배열객체 주소값 : "+intArray);
		intArray[0] = 90; 
		intArray[1] = 78; 
		intArray[2] = 56; 
		intArray[3] = 67; 
		intArray[4] = 81; 
		System.out.println("---------------for 문---------------");
		for(int i=0; i<5; i++) {
			System.out.println(intArray[i]);
		}
		/*
		 * 모든 배열객체는 public int length;를 멤버변수로 가진다
		 */
		System.out.println("배열객체의 멤버필드 갯수 : "+intArray.length);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("intArray["+i+"] => "+intArray[i]);
		}
		
		System.out.println("-----기본형 1차원[] 배열------");
		System.out.println("-----int[] 배열------");
		int[] korArray=new int[10];
		korArray[0]=80;
		korArray[1]=56;
		korArray[2]=89;
		korArray[3]=94;
		korArray[4]=100;
		korArray[5]=77;
		korArray[6]=78;
		korArray[7]=64;
		korArray[8]=52;
		korArray[9]=93;
		
		int korTot=0;
		
		for (int i = 0; i < korArray.length; i++) {
			korTot += korArray[i];
		}
		System.out.println("우리반 국어총점 : "+korTot);
		
		double korAvg = (double)korTot/korArray.length;
		System.out.println("우리반 국어평균 : "+korAvg);
		
		System.out.println("-----char[]-----");
		char[] ca = new char[6];
		ca[0]='H';
		ca[1]='E';
		ca[2]='L';
		ca[3]='L';
		ca[4]='O';
		ca[5]='!';
		System.out.println(Integer.toHexString(ca.hashCode()));
		for (int i = 0; i < ca.length; i++) {
			System.out.print(ca[i]+" ");
		}
		System.out.println();
		System.out.println("-----boolean[]-----");
		boolean[] ba = new boolean[5];
		ba[0] = true;
		ba[1] = false;
		ba[2] = false;
		ba[3] = true;
		ba[4] = false;
		
		int trueCount=0;
		for(int i =0; i<ba.length; i++) {
			if(ba[i]) {
				trueCount++;
			}
		}
		System.out.println("true count:"+trueCount);
		
		System.out.println("-----String[]-----");
		
		String[] strArray = new String[5];
		strArray[0]="KIM";
		strArray[1]="LEE";
		strArray[2]="SIM";
		strArray[3]="PARK";
		strArray[4]="CHOI";
		
		for(int i=0; i<strArray.length; i++) {
			System.out.println(strArray[i]);
		}
		
		
		
	}

}
