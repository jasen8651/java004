package java001;

import java.io.File;

public class main024 {

	public static void main(String[] args) {
		//File file = new File("src/java001/temp");
		File file = new File("src/java001/a/b");
		
		
		if(!file.isDirectory()) {
			//file.mkdir();
			file.mkdirs();
			System.out.println("폴더생성");
		}else {
			System.out.println("폴더 존재");
		}
	}

}
