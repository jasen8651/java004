package java001;

import java.util.Vector;

public class main030 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(new Integer(10));
		v.add(new Integer(20));
		
		v.add(30);
		v.add(40);
		v.add(new String("java"));
		
		Integer it1 = (Integer)v.get(0);
		Integer it2 = (Integer)v.get(1);
		Integer it3 = (Integer)v.get(2);
		Integer it4 = (Integer)v.get(3);
		
		String sn = (String)v.get(4);
		
		System.out.println(it1.intValue());
		System.out.println(it2.intValue());
		System.out.println(it3.intValue());
		System.out.println(it4.intValue());
		System.out.println(sn.toString());
		
	}

}
