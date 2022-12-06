package characterstream;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedWriterReaderCopyMain {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new FileReader("죄와벌.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("죄와벌[LINENO].txt"));
		
		int lineNo=0;
		while(true) {
			String readLine = br.readLine();
			if(readLine==null)break;
			lineNo++;
			bw.write("["+lineNo+"]"+readLine);
			bw.newLine();
		}
		bw.flush();
		bw.close();
		br.close();
		System.out.println("--------------BufferedWriterReaderCopy "+lineNo+" line copy");
	}
}
