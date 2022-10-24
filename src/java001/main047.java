package java001;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;

public class main047 {

	public static void main(String[] args) {
		//Hashtable : MAP 인터페이스를 구현해놓은 클레스, 구현한 클레스를 KEY, VAlue싸으로 저장
		// k  = 타입  v = ??
		
		Hashtable<Integer, String> table = new Hashtable<Integer, String>();
		table.put(10, "java");
		table.put(20, "jsp");
		table.put(30, "string");
		table.put(20, "mysql");
		
		System.out.println(table.get(10));
		
		Enumeration<String> enu = table.elements();
		
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
			
			Enumeration<Integer> enukey = table.keys();
			while(enukey.hasMoreElements()) {
				Integer key = enukey.nextElement();
				System.out.printf("%d:%s \n" , key, table.get(key));
			}
		}
		
		System.out.println("===============================");
		Set<Integer> st = table.keySet();
		for(Integer key : st) {
			System.out.printf("%d:%s\n",key,table.get(key));
		}

	}

}
