package java001;

import java.util.ArrayList;

public class main039 {

	public static void main(String[] args) {
		ArrayList<String> alist = new ArrayList<String>();
		alist.add("oracle");
		alist.add("sql");
		alist.add("mssql");
		String[] arr = display(alist);
		
		for(String data :arr){
			System.out.println(data);
		}
	}
	public static String[] display(ArrayList<String> alist) {
		/*
		 * String[] stn = new String[alist.size()]; for(int i=0; i<stn.length; i++) {
		 * stn[i] =alist.get(i); }
		 * 
		 * return stn;
		 */
		
		/*
		 * String[] stn = new String[alist.size()]; return alist.toArray(stn);
		 */
		
		return alist.toArray(new String[alist.size()]);
		
	}
}
