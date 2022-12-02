public class RuntimeExceptionCatchMain2 {
	/*
	 * 모든메쏘드는 throws RuntimeException 구문이 생략되어있다
	 *   - 이메쏘드에서는 RuntimeException의 자식Exception들이 발생할수있다.
	 * 
	 */
	public static void main(String[] args) {
		try {
			System.out.println("stmt1");
			String str="";
			System.out.println("stmt2");
			/*
			 * 예외발생예상코드
			 */
			int length = str.length();
			/*
			 1. 예외상황발생하면  NullPointerException객체생성한후 
			    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
			 2. 던져진 예외객체는 catch block에 선언된 변수에 대입된다.   
			 3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
			 */
			System.out.println("length:"+length);
			System.out.println("stmt3");
		
			
			int[] intArray=null;
			intArray=new int[3];
			System.out.println("stmt4");
			/*
			 * 예외발생예상코드
			 */
			intArray[3]=9999;
			/*
			 1. 예외상황발생하면  ArrayIndexOutOfBoundsException객체생성한후 
			    예외발생 코드를 가지고있는 메쏘드를(메인메쏘드) 호출한곳으로 던진다.(throw)
			 2. 던져진 예외객체는 catch block에 선언된 변수에 대입된다.   
			 3. 현재실행흐름은 예외가발생한곳에서 catch block으로 실행흐름이이동한다.
			 */
			 System.out.println("stmt5");
			 
		}catch (NullPointerException e) {
			System.out.println("----------catch start[NullPointerException]------");
			System.out.println("NullPointerException msg==>"+e.getMessage());
			System.out.println("----------catch end[NullPointerException]------");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("----------catch start[ArrayIndexOutOfBoundsException]------");
			System.out.println("ArrayIndexOutOfBoundsException==>"+e.getMessage());
			System.out.println("----------catch end[ArrayIndexOutOfBoundsException]------");
		}
		System.out.println("main end return");
		return;
	}

}