package java001;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Vector;

public class main035 {

	public static void main(String[] args) {
		String path = "./src/java001/score.txt";
		Vector<main035_swon> vt = lines(path);
		prnDisplay(vt);
		
		
	}
	private static Vector<main035_swon> lines(String fileName){
		Vector<main035_swon> vt = new Vector<main035_swon>();
		try (Scanner sc = new Scanner(new File(fileName))){
			while(sc.hasNextLine()) {
				String[] data = sc.nextLine().split("[:/]");
				main035_swon sn = new main035_swon(data[0], Integer.parseInt(data[1]),
															Integer.parseInt(data[2]),
															Integer.parseInt(data[3]));
				vt.add(sn);
			}
		}catch (FileNotFoundException e) {
			System.out.println(e.toString());
		}
		
		
		return vt;
	}
	private static void prnDisplay(Vector<main035_swon>vt) {
	for(main035_swon sn : vt) {
		System.out.println(sn.toString());
	}
	
		
	}
}
