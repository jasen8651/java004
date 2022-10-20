package java001;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class main016 {

	public static void main(String[] args) {
		//바이트 스트림
		InputStream is = System.in;
		
		//연결
		InputStreamReader ir = new InputStreamReader(is);
		
		
		//문자스트림
		BufferedReader br = new BufferedReader(ir);
		System.out.println("데이터 입력 :");
		try {
			//int data = br.read();
			//System.out.println(data);
			//System.out.println((char)data);\
			int data;
			while((data=br.read())!=13) {
				System.out.println((char)data);
			}
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
			try {
				br.close();
				ir.close();
				is.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
	}

}
