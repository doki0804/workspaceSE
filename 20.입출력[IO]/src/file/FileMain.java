package file;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {
		/*
		 * 현재파일경로[기준경로]
		 *    eclipse --> C:\01.JAVA_DEVELOPER\workspaceSE\20.입출력[IO]
		 * 
		 * 상대경로(relative)경로
		 * 		현재경로를 기준으로 경로를 기술하는 방법
		 * 		sample\a.txt
		 * 		.\sample\a.txt
		 * 
		 * 절대경로(absolute)경로
		 * 		C:,D: 드라이브를 기준으로 경로를 기술하는 방법		
		 * 
		 */
		
		System.out.println(File.separatorChar);
		File file1 = new File("데미안.txt");
		File file2 = new File("sample\\ball.png");
		File file3 = new File("sample/subSample/00.VariableDeclare.txt");
		File file4 = new File("C:\\01.JAVA_DEVELOPER\\workspaceSE\\20.입출력[IO]\\sample/subSample/00.VariableDeclare.txt");
		
		
	}
}
