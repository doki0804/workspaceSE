package bytestream.filterstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStreamPrintMethodMain {

	public static void main(String[] args) throws Exception {
		
		PrintStream pout = new PrintStream(new FileOutputStream("printMethod.txt"));
		pout.write(65);
		pout.write(13); // \n
		pout.write(66);
		pout.write(13);
		pout.print("A");
		pout.print("\n");
		pout.print("B");
		pout.print("\n");
		
		pout.write(65);
		pout.write(66);
		pout.write(67);
		pout.write(13);
		
		pout.println("ABC");
		pout.println(3.141592);
		String doubleStr="3.141592";
		for(int i=0; i<doubleStr.length();i++) {
			int tempChar = doubleStr.charAt(i);
			pout.write(tempChar);
		}
		pout.write(13);
		
	}
}
