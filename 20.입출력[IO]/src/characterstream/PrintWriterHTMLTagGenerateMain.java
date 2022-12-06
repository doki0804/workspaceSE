package characterstream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterHTMLTagGenerateMain {

	public static void main(String[] args) throws Exception {
		PrintWriter out = new PrintWriter(new FileWriter("Hello.html"));
		/*
		 * <html>
				<head>
					<title>나의HTML</title>
				</head>		
				<body>
					<h1>안녕HTML[0]</h1><hr>
				</body>
			</html>
		 */
		out.println("<html>");
		out.println("<head>");
		out.println("<title>나의HTML</title>");
		out.println("</head>");
		out.println("<body>");
		for(int i=0;i<100;i++) {
			out.println("<h1>안녕HTML["+(i+1)+"]</h1><hr>");
		}
		out.println("</body>");
		out.println("</html>");
		out.flush();
		out.close();
		System.out.println("PrintWriter --> hello.html");
	}
}
