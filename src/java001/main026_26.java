package java001;

import java.io.File;
import java.io.IOException;

public class main026_26 {

	public static void main(String[] args) {
		File file = new File("src/java001/test.txt");
		if(!file.exists()) 
			if(file.exists()) {
				file.delete();
				System.out.println("파일삭제");
				}else {
				System.out.println("파일 없음");
				}
		}
	
	
	}


