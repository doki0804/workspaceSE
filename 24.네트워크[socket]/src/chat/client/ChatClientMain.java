package chat.client;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class ChatClientMain {

	public static void main(String[] args) throws Exception{
		
		Socket socket = new Socket("192.168.15.18",8888);
		Thread.sleep(1000000);
		
	}
}
