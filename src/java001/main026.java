package java001;

import java.io.File;
import java.io.IOException;

public class main026 {

	public static void main(String[] args) {
		File file = new File("src/java001/test.txt");
		if(!file.exists()) {
			try {
				file.createNewFile();
				System.out.println("파일생성");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
