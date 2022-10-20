package java001;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class main019 {

	public static void main(String[] args) {
		java.io.File file = new File("sample.txt");
		System.out.println(file.exists());
		System.out.println(file.isFile());
		System.out.println(file.length());
		
		
		FileWriter fw = null;
		try {
			//모듈의 값이 참이면 append
			//모듈의 값이 거짓이면 updata
			//모듈의 값이 생략이면 거짓
			fw = new FileWriter(file, false);
			fw.write("java\n");
			fw.flush();
			fw.write("집가 고싶다\n");
			fw.flush();
			fw.write(new char[] {'s','w','d'});
			fw.write("\n");
			fw.flush();
			fw.write(98	);
			fw.flush();
			fw.write(new char[] {'s','w','d'},0,3);
			fw.flush();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
