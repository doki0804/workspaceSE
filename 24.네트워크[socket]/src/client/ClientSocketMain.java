package client;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientSocketMain {

	public static void main(String[] args) throws Exception{
		/*
		Socket socket = new Socket("www.naver.com", 80);
		System.out.println(socket);
		*/
		Socket socket = new Socket("192.168.15.18", 3333);
		System.out.println(socket);
		InetAddress remoteAddress = socket.getInetAddress();
		InetAddress localAddress = socket.getLocalAddress();
		System.out.println("remote ip : "+remoteAddress.getHostAddress());
		System.out.println("remote port : "+socket.getPort());
		System.out.println("local ip : "+localAddress.getHostAddress());
		System.out.println("local port : "+socket.getLocalPort());
		
		
	}
}
