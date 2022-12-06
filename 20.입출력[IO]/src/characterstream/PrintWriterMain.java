package characterstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterMain {

	public static void main(String[] args) throws Exception {
		
		PrintWriter pw = new PrintWriter(new FileWriter("printWriter.txt"));
		pw.write(65);
		pw.write(13);
		pw.print(65);
		pw.write(45645);
		boolean b = true;
		pw.print(b);
		
		String boolStr = b+"";
		for(int i = 0 ; i<boolStr.length();i++) {
			pw.write((int)boolStr.charAt(i));
		}
		pw.println("---------------");
		pw.println("<html>");
		pw.println("<head>");
		pw.println("</head>");
		pw.println("<body>");
		for(int i=0; i<5;i++) {
			pw.println("<h1>");
			pw.println("안녕 !!! HTML"+i);
			pw.println("</h1>");
		}
		pw.println("</body>");
		pw.println("</html>");
		
		pw.flush();
		
		
	}
}
