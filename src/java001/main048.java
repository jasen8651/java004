package java001;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class main048 {

	public static void main(String[] args) {
		/*
		 * hashmap : 비동기화 처리/ hashtable : 동기화 처리
		 */
		HashMap<Integer, Number> map = new HashMap<Integer, Number>();
		map.put(1,  new Integer(10));
		map.put(2,  new Double(4.5f));
		map.put(3,  new Float(2.3f));
		
		System.out.println(map.get(2));
		
		Set<Integer> set = map.keySet();
		Iterator<Integer> ite = set.iterator();
		while(ite.hasNext()) {
			Integer key = ite.next();
			System.out.printf("%d:%s\n",key,map.get(key));
		}
		
		System.out.println("============================");
		for(Integer key : map.keySet()) {
			System.out.printf("%d:%s\n", key,map.get(key));
		}
			
	}

}
