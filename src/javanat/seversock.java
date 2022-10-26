package javanat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class seversock {
	public static void main(String[] args) {
		
		try {
		
		ServerSocket server = new ServerSocket(7777);
		System.out.println("대기");
		Socket socket = server.accept();
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter ow = new OutputStreamWriter(os);
		InputStream is = socket.getInputStream();
		InputStreamReader ir = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(ir);
		
		System.out.println(br.readLine());
		br.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
