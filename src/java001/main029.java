package java001;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class main029 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(FileWriter fw = new FileWriter(new File("src/java001/sample.txt"))) {
			fw.write("java\n");
			fw.write("더워\n");
			fw.write("문열어줘\n");
			fw.write("창문\n");
			
		}catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}catch (IOException e) {
			System.out.println(e.toString());
		}
		System.out.println("-0----------------------------");
		try(FileReader fr = new FileReader("src/java001/sample.txt");
				BufferedReader br = new BufferedReader(fr)){
			String line = null;
			while ((line = br.readLine())!=null) {
				System.out.println(line);
			}
			
		}catch (IOException e) {
			e.printStackTrace();
		}
	}

}
