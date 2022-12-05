package bytestream.filterstream;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class DataOutputInputStreamMain {

	public static void main(String[] args) throws Exception {
		/*
		 * 자바의기본데이타를 출력스트림에 쉽게 쓸수있도록하는 필터스트림클래스
		 */
		DataOutputStream dos = new DataOutputStream(new FileOutputStream("dataOut.dat"));
		
		int intData = 2147483647;
		dos.writeInt(intData);
		dos.writeByte(127);
		dos.writeBoolean(true);
		dos.writeChar('가');
		dos.writeUTF("오늘은 자바입출력을 공부합니다.");
		dos.close();
		System.out.println("DataOutputStream.writeXXX() --> dataOut.dat");
		/*
		 * 자바의기본데이타를 입력스트림으로부터 쉽게 읽을수있도록하는 필터스트림클래스
		 */
		
		DataInputStream dis = new DataInputStream(new FileInputStream("dataOut.dat"));
		int readInt = dis.readInt();
		System.out.println("int : "+ readInt);
		System.out.println("byte : "+ dis.readByte());
		System.out.println("boolean : "+dis.readBoolean());
		System.out.println("char : "+dis.readChar());
		System.out.println("UTF : "+dis.readUTF());
		dis.close();
		
	}
}
