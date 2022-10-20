package java001;

import java.io.IOException;
import java.io.InputStream;

public class main015 {

	public static void main(String[] args) {
		System.out.println("데이터 입력");
		InputStream is = System.in;
		int data;
	
		try {
		while ((data = is.read())!=13) {
			System.out.println((char)data);}
		}catch (IOException ex) {
			ex.printStackTrace();
		} 
		
	
		
		/*
		 * try { int a = is.read(); int b = is.read();
		 * 
		 * System.out.println((char )a); System.out.println((char )b); }catch
		 * (IOException ex) { ex.printStackTrace(); }
		 */
		
		}

}
