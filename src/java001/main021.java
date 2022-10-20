package java001;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

public class main021 {

	public static void main(String[] args) {
		FileReader fr = null;
		
		LineNumberReader nr = null;
		
		try {
			fr= new FileReader("src/java021/score.txt");
			nr = new LineNumberReader(fr);
			String line = null;
			while ((line=nr.readLine()) !=null) {
				System.out.printf("%d :  %s\n",nr.getLineNumber(),line);
				
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				nr.close();
				fr.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
