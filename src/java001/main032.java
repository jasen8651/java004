package java001;

import java.util.Vector;

public class main032 {

	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		v.add(new String("java"));
		v.add(new String("jsp"));
		v.add(new String("spring"));
		
		for(int i=0; i<v.size(); i++) {
			String data = v.get(i);
			System.out.println(data);
		}
		for(String data : v){
			System.out.println(data);
		}
		Vector<Number> vt = new Vector<Number>();
		vt.add(new Integer(10));
		vt.add(new Double(10.4));
		vt.add(new Float(4.8f));
		
		for(Number ne : vt) {
			if(ne instanceof Integer) {
				Integer it = (Integer)ne;
						System.out.println(it);
			}else if(ne instanceof Float) {
				float ft = (float)ne;
				System.out.println(ft);
			}
		}
		
	}

}
