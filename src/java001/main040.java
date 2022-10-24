package java001;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class main040 {

	public static void main(String[] args) {
		/*Enumeration<E>
		 * vector와  hashtable에서만 제공하는 인터페이스
		 */
		Vector<Integer> v = new Vector<Integer>();
		v.add(10);
		v.add(20);
		v.add(30);
		System.out.println("일반 for문");
		for(int i=0; i<v.size(); i++) {
			System.out.println(v.get(i));
		}
		
		
		System.out.println("Enumeration");
		Enumeration<Integer> enu = v.elements();
		while (enu.hasMoreElements()) {
			System.out.println(enu.nextElement());
			
		}
		
		System.out.println("--------------------");
		//반복자
		Iterator<Integer> ite = v.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		
		System.out.println("개선된 루프");
		for(Integer ig : v) {
			System.out.println(ig);
		}
		
		System.out.println("ArrayList<E>");
		ArrayList<Integer> alList = new ArrayList<Integer>();
		alList.add(10);
		alList.add(20);
		alList.add(30);
		
		for(int i=0; i<alList.size(); i++) {
			System.out.println(alList.get(i));
		}
		
		Iterator<Integer> ite2 = alList.iterator();
		while (ite2.hasNext()) {
			System.out.println(ite2.next());
		}
		
		System.out.println("개선된 루프");
		for(Integer it2 : alList) {
			System.out.println(it2);
		}
	}	

}
