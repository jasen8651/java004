package java001;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class main022 {

	public static void main(String[] args) {
		File file = new File("src/java001/score.txt");
			RandomAccessFile raf = null;
			
			try {//읽기만 가능=> 'r'  ,  읽기 쓰기 가능 => 'rw'
				raf = new RandomAccessFile(file, "r" );
				System.out.println(raf.getFilePointer());
				System.out.println((char)raf.read());
				raf.seek(4);
				System.out.println(raf.readLine());
				
				raf.skipBytes(2);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			} /*
				 * finally { raf.close(); }catch (Exception e) { e.printStackTrace(); }
				 */
	}

}
