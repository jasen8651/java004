package javanat;

import java.net.MalformedURLException;
import java.net.URL;

public class main002 {

	public static void main(String[] args) {
		
		try {
			URL url = new URL("https://namu.wiki/w/%EA%B0%90%EA%B8%B0%EB%AA%B8%EC%82%B4");
			System.out.println("gethost"+ url.getHost());
			System.out.println("getport"+ url.getPort());
			System.out.println("getportocol"+ url.getProtocol());
			System.out.println("getpath"+url.getPath());
			System.out.println("getquery"+ url.getQuery());
		}catch (MalformedURLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	

	}

}
