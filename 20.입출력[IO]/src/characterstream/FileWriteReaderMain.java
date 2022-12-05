package characterstream;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteReaderMain {

	public static void main(String[] args) throws Exception {
		
		FileWriter fw = new FileWriter("fileWriter.txt");
		
		fw.write(44356);
		fw.write('A');
		fw.write('김');
		
		for(int i=0; i<65536; i++) {
			fw.write(i);
			if(i%100==0) {
				fw.write('\n');
			}
		}
		
		fw.write('\n');
		fw.write("문자열을 맘대로 사용할수있습니다");
		fw.write('\n');
		fw.write("한라인");
		fw.write('\n');
		fw.write("두라인\n");
		fw.write("세라인\n");
		
		/*
		 * 버퍼에 있는 물자열을 출력스트림에 쓴다.
		 */
		fw.flush();
		fw.close();
		System.out.println("FileWriter.write() ---> fileWriter.txt");
		
		
	}
}
