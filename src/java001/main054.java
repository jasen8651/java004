package java001;

import java.util.Vector;

public class main054 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<String> v = new Vector<String>();
		v.add("java");
		v.add("jsp");
		v.add("sping");
		
		System.out.println(v.toString());
		
		Vector<String> t = new Vector<String>();
		t.add("java");
		t.add("mysql");
		System.out.println(t.toString());
		
		System.out.println(t.toString().length());
		
		v.removeAll(t);
		System.out.println(v.toString());
	}

}
