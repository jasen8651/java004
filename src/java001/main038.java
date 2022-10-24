package java001;

import java.util.AbstractList;
import java.util.ArrayList;

public class main038 {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add(new String("java"));
		alist.add(new String("jsp"));
		alist.add(new String("spring"));
		prnDisplay(alist);
	}
	public static void prnDisplay(AbstractList<String> alist) {
		//j요소가 있는 출력하라
		for(String sn : alist) {
			if(sn.toLowerCase().contains("j")) {
				System.out.println(sn);
			}
		}
	
	}
	public static void process(ArrayList<String>alist) {
		System.out.println(alist.contains("jsp"));
	}
}
