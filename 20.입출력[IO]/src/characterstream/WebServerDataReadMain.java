package characterstream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URL;


public class WebServerDataReadMain {

	public static void main(String[] args) throws Exception {
		/*******************html(text)***********************/
		URL urlStr=new URL("https://mblogthumb-phinf.pstatic.net/MjAyMDAyMTNfMjY1/MDAxNTgxNTYwMDU4NzAy.Mov32dmQx__4rEVWkd7Fjwbelc-0SK1sVu5Ce0fHd5kg.nbbLdOQv5ztoZtDDQHpkc6xx1JbgykHS--XYQU5jqJQg.PNG.lccthebox4/image.png?type=w800");
		InputStream in = urlStr.openStream();
		FileOutputStream fo = new FileOutputStream("한지민.png");
		while(true) {
			int readByte = in.read();
			if(readByte==-1)break;
			fo.write(readByte);
		}
		in.close();
		fo.close();
		
	}
}
