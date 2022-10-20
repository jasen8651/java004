package java001;

import java.io.IOException;
import java.io.InputStream;


public class main014 {

	public static void main(String[] args) {
	System.out.println("데이터 입력");
	InputStream is = System.in;
	
	//한바이트를 잃어 유니코드토 전한
	try {
		int line = is.read();
		System.out.println(line);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}

}
