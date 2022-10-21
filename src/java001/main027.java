package java001;

import java.io.File;

public class main027 {

	public static void main(String[] args) {
		File file = new File("src/java001/a");
		deleteFileList(file);
	}
	public static void deleteFileList(File srcFile) {
		File[] fileAll = srcFile.listFiles();
		if(fileAll != null) {
			System.out.println(fileAll.length);
			for(File file : fileAll) {
				System.out.println(file);
				deleteFileList(file);
			}
		}
		System.out.println("Remove File:"+srcFile.getPath());
		srcFile.delete();
	}
}
