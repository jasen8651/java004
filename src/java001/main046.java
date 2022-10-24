package java001;

import java.util.HashSet;

public class main046 {

	public static void main(String[] args) {
		//중복허용x 순서 유지x
		HashSet<Integer> set = new HashSet<Integer>();
		set.add(new Integer(10));
		set.add(new Integer(30));
		set.add(new Integer(10));
		set.add(new Integer(20));

		for (Integer it : set) {
			System.out.println(it);
		}
		
	}

}
