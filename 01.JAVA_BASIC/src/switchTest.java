 /*
		switch 문
		 - 형식
		    switch(변수){
		    	case 값_1:
		    	  stmt1;
		    	  break;
		    	case 값_2:
		    	  stmt2;
		    	  break;  
		        case 값_n:
		          stmt3;
		    	  break;
		        default:
		          stmt4;
		    }
		switch(변수)  변수값은 byte,short,int char 
		              값이올수있다.(long 은안됨)
*/
public class switchTest {

	public static void main(String[] args) {
		int level = 3; // 게임레벨 1~5사이의 정수
		
		switch (level) {
		case 1:
			//명령문기술위치
			System.out.println("뉴비시군요.");
			break; // switch block을 빠져나간다. for block 에서도 사용함
		case 2:
			System.out.println("아직 초보입니다.");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("썩은물입니다.");
			break;
		default:			
			System.out.println("레벨은 1~5사이의 정수입니다.");
			break;
		}
		

	}

}
