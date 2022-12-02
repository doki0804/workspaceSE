import java.io.IOException;
import java.net.Socket;
import java.sql.DriverManager;
import java.sql.SQLException;

public class NoRuntimeExceptionCatchMain1 {

	public static void main(String[] args) {
		try {
			System.out.println("stmt1");
			/*
			 * 예외발생예상코드(IOException)
			 */
			Socket socket=new Socket("www.daum.net", 80);
			System.out.println("stmt2");
			/*
			 * 예외발생예상코드(IOException)
			  1.예외발생시 IOException객체생성 
			    IOException객체가 던져짐
			  2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 IOException객체대입)  
			  3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
			 */
			Class.forName("AClass");
			System.out.println("stmt3");
			
			/*
			 * 예외발생예상코드(SQLException)
			    1.예외발생시 SQLException객체생성 
			    	SQLException객체가 던져짐
			  	2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 SQLException객체대입)  
			  	3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
			 */
			DriverManager.getConnection("");
			System.out.println("stmt4");
			
			/*
			 * 예외발생예상코드(ArithmeticException)
			   	1.예외발생시 ArithmeticException객체생성 
			    	ArithmeticException객체가 던져짐
			  	2.catch블록에서 던져진객체를 잡음(catch 블록에선언된변수에 ArithmeticException객체대입)  
			  	3.현재실행흐름이 예외발생코드에서 정지된후 catch블록을실행
			 */
			int result = 3/0;
			System.out.println("stmt5");
		}catch (IOException e) {
			System.out.println("IOException:"+e.getMessage());
		}catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException:"+e.getMessage());
		}catch (SQLException e) {
			System.out.println("SQLException:"+e.getMessage());
		}catch (Exception e) {
			System.out.println("Exception:"+e.getMessage());
		}
		System.out.println("main end return");

	}

}