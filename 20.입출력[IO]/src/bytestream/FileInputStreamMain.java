package bytestream;
/*
 * <<입력스트림(InputStream)사용방법>>
 * 1. 데이타 source 선정(파일)
 * 2. 입력스트림(InputStream)객체생성(FileInputStream)
 * 3. 입력스트림(InputStream)으로부터 한바이트씩  읽는다(read)
 * 4. 입력스트림(InputStream)닫는다.(close) 
 */
import java.io.FileInputStream;

public class FileInputStreamMain {

	public static void main(String[] args) throws Exception {
		
		FileInputStream fis = new FileInputStream("fileOut.dat");
		int readByte = fis.read();
		System.out.println("1.byte:"+Integer.toBinaryString(readByte));
		readByte = fis.read();
		System.out.println("2.byte:"+Integer.toBinaryString(readByte));
		readByte = fis.read();
		System.out.println("3.byte:"+Integer.toBinaryString(readByte));
		readByte = fis.read();
		System.out.println("4.byte:"+Integer.toBinaryString(readByte));
		int byteCount=0;
		while(true) {
			readByte=fis.read();
			if(readByte==-1)
				break;
			byteCount++;
			System.out.println(Integer.toBinaryString(readByte));
		}
		fis.close();
		System.out.println("FileInputStream.read()<-----fileOut.dat: "+byteCount+"바이트 읽음");
		
		
		
	}
}
