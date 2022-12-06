package bytestream.filterstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamMain {

	public static void main(String[] args) throws Exception {
		PrintStream consoleOut = System.out;

		PrintStream filePrintOut = new PrintStream(new FileOutputStream("printStream.txt")); 
		String str = "프린트스트림을 공부합니다";
		
		
		
		consoleOut.println(str);
		filePrintOut.println(str);
		double d = 3.14159;
		char c = '힣';
		Object o = new Object();
		boolean isMarried = true;
		
		consoleOut.println(d);
		filePrintOut.println(d);
		consoleOut.println(c);
		filePrintOut.println(c);
		consoleOut.println(o);
		filePrintOut.println(o);
		consoleOut.println(isMarried);
		System.out.println("-------PrintStream.println() --> consleOut.println()-------");		
		filePrintOut.println("-------PrintStream.println() --> consleOut.println()-------");
		
		
		System.out.print(65);
		filePrintOut.close();
		
		
	}
}
