package bytestream.filterstream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class BufferedOutputInputFileCopyMain {

	public static void main(String[] args) throws Exception {
		
		BufferedInputStream bis = new BufferedInputStream(new FileInputStream("D2Coding.zip"));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("D2Coding_copy.zip"));
		
		int byteCount=0;
		int starCount=0;
		while(true) {
			int readByte = bis.read();
			if(readByte==-1)break;
			byteCount++;
			if(byteCount%(1024*1024)==0) {
				System.out.print("★");
				starCount++;
			}
			bos.write(readByte);
			
		}
		bis.close();
		bos.close();
		System.out.println();
		System.out.println(" BufferedOutputInputFileCopy : "+ byteCount + " bytes copy!!");
		
	}
}
