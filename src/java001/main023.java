package java001;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class main023 {

	public static void main(String[] args) {
		File file = new File("src/java001/song.txt");
		
		RandomAccessFile raf = null;
		String stn = new String("\r\nMoron\5 - Daylight, sunday Moring \r\n");
		
		try {
			raf = new RandomAccessFile(file, "rw");
			System.out.println(raf.getFilePointer());
			long size = raf.length();
			raf.seek(size);
			raf.writeUTF(stn);
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				raf.close();
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
