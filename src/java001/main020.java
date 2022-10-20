package java001;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class main020 {

	public static void main(String[] args) {
		File file = new File("sample.txt");

		FileReader fr = null;
		int data;

		try {
			fr = new FileReader(file);
			// for(int i=0; i<file.length(); i++)
			// System.out.print((char)fr.read());
			while ((data = fr.read()) != -1) {
				System.out.print((char) data);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
