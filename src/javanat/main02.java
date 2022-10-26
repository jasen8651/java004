package javanat;

import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.UnknownHostException;

public class main02 {

	public static void main(String[] args) {
		/*
		 *네트워크, 클라이언트,서버, 서버, 클라이언트, 서비스 , 네트워크 정보 java.net 
		 */
		try {
			InetAddress ip = InetAddress.getByName("daum.net");	
			System.out.println(ip.getHostName());
			System.out.println(ip.getHostAddress());
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}

}
