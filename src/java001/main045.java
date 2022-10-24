package java001;

import java.util.TreeSet;

import javax.swing.text.html.HTMLDocument.Iterator;

public class main045 {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<Integer>();
		Integer it1 = new Integer(10);
		Integer it2 = new Integer(40);
		Integer it3 = new Integer(20);
		Integer it4 = new Integer(30);
		Integer it5 = new Integer(20);
		
		ts.add(it1);
		ts.add(it2);
		ts.add(it3);
		ts.add(it4);
		ts.add(it5);
		
		ts.add(new Integer(10));
		ts.add(new Integer(40));
		ts.add(new Integer(20));
		ts.add(new Integer(30));
		ts.add(new Integer(20));
		
		System.out.println("오른차순");
		System.out.println(ts.size());
		int cnt = ts.size();
		
		for(int i=0; i<cnt; i++) {
			int value = ts.pollFirst();
			System.out.println(value==it5);
			System.out.printf("ts[%d]=%d\n",i, value);
		}
		
		
		
	}

}
