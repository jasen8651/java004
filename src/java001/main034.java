package java001;

import java.util.Vector;

public class main034 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.addElement(new String("java"));
		v.add(new String("jsp"));
		v.add(1, new String("spring"));
		
		for(int i=0; i<v.size();i++) {
			System.out.printf("v[%d]=%s\n",i,v.get(i));
		}
		v.trimToSize();
		System.out.println("용량크기 : "+v.capacity());
		System.out.println("요소갯수 : "+v.size());
		
	}

}
