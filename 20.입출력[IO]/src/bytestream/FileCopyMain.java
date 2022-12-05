package bytestream;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileCopyMain {

	public static void main(String[] args) throws Exception{
		
		String fileName = "D2Coding.zip";
		String copiedFileName = fileName.replace(".", "_copy.");
		
		FileInputStream fis = new FileInputStream(fileName);
		FileOutputStream fos = new FileOutputStream(copiedFileName);
		
		int byteCount=0;
		while(true) {
			int readByte = fis.read();
			if(readByte==-1)break;
			byteCount++;
			if(byteCount%(1024*1024)==0) {
				System.out.print("★");
			}
			fos.write(readByte);
		}
		
		System.out.println("FileCopy : "+byteCount+"bytes copy");
		fis.close();
		fos.close();
	}
	
}
