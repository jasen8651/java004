package javanat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class main003 {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("127.0.0.1",7777);
			
			OutputStream os = socket.getOutputStream();
			OutputStreamWriter ow = new OutputStreamWriter(os);
			InputStream is = socket.getInputStream();
			InputStreamReader ir = new InputStreamReader(is);
			BufferedReader br = new BufferedReader(ir);
			
			
			ow.write("클라이언트의 정보는 보냄");
			ow.flush();
			ow.close();
			
			
		}catch (IOException e) {
			e.printStackTrace();
		}
		

	}

}
