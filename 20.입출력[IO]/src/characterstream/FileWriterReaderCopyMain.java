package characterstream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReaderCopyMain {

	public static void main(String[] args) throws Exception {
		FileReader fr = new FileReader("데미안.txt");
		FileWriter fw = new FileWriter("데미안[복사]");
		
		while(true) {
			int readChar = fr.read();
			if(readChar==-1)break;
			
			
		}
		
	}
}
