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
		
		System.out.println("---------1.file path[relative]---------");
		System.out.println(file1.getPath());
		System.out.println(file2.getPath());
		System.out.println(file3.getPath());
		System.out.println(file4.getPath());
		System.out.println("---------2.file absolute path[relative]---------");
		System.out.println(file1.getAbsolutePath());
		System.out.println(file2.getAbsolutePath());
		System.out.println(file3.getAbsolutePath());
		System.out.println(file4.getAbsolutePath());
		System.out.println("---------3.file name---------");
		System.out.println(file1.getName());
		System.out.println(file2.getName());
		System.out.println(file3.getName());
		System.out.println(file4.getName());
		System.out.println("---------4.file parent[directory]---------");
		System.out.println(file1.getParent());
		System.out.println(file2.getParent());
		System.out.println(file3.getParent());
		System.out.println(file4.getParent());
		
		File dir1 = new File("sample");
		File dir2 = new File("sample/subSample");
		File dir3 = new File("sample/subSample2");
		
		System.out.println("---------5.isDirectory,isFile----------");
		System.out.println(dir1.isDirectory());
		System.out.println(dir2.isDirectory());
		System.out.println(dir3.isDirectory());
		System.out.println(file1.isDirectory());
		System.out.println(file2.isDirectory());
		System.out.println(file3.isDirectory());
		System.out.println(dir1.isFile());
		System.out.println(dir2.isFile());
		System.out.println(dir3.isFile());
		System.out.println("---------6.디렉토리안에 파일(디렉토리)목록(String[])----------");
		String[] fileNameList = dir1.list();
		for(String fileName : fileNameList) {
			System.out.println(fileName);
		}
		System.out.println("---------7.디렉토리안에 파일(디렉토리)목록(File[])----------");
		File[] fileList = dir1.listFiles();
		for (File file : fileList) {
			if(file.isDirectory()) {
				//Directory
				
			}else {
				//File
				
			}
		}
		
		
		
		
		
		
	}
}
