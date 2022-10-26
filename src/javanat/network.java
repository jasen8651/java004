package javanat;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.nio.charset.MalformedInputException;
import java.util.Scanner;


public class network {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection();
			Scanner sc = new Scanner(conn.getInputStream());
			while(sc.hasNext()) {
				System.out.println(sc.nextLine());
			}
		}catch (MalformedInputException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
