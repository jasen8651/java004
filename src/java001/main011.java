package java001;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main011 {

	public static void main(String[] args) {
		
		File file = new File("smaple.txt");
		
		FileReader fr = null;
		try {
		fr = new FileReader(file);
		System.out.println(fr.read());
		}catch (FileNotFoundException ex) {
			System.out.println(ex.toString());
		}catch (IOException ex) {
			System.out.println(ex.toString());
		}
	}

}
