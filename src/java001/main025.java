package java001;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main025 {

	public static void main(String[] args) throws IOException {
		//File file = new File("src/java001/a/b");
		//File file = new File("src/java001/a");
		File file = new File("src/java001/sample.txt");
		//file.createTempFile("source", "test"); //임시파일 생성
		file.deleteOnExit(); //시스템 종료시 삭제
		Scanner sc = new Scanner(file);
		System.out.println(sc.nextLine());
		System.out.println(sc.nextLine());
		sc.close();
		
		
		
		//if (file.isDirectory()) {
			// file.mkdir();
			//file.delete();//
		//	System.out.println("폴더 삭제");
		//} else {
		//	System.out.println("폴더 없다");
	//	}
	}

}
