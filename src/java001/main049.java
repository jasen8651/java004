package java001;

import java.util.TreeMap;

public class main049 {

	public static void main(String[] args) {
		/*
		 * treemap: 인터페이스를 구현한 클레스
		 * 정렬제공 클레스
		 */
		TreeMap<Integer, String> tmap = new TreeMap<Integer, String>();
		tmap.put(10, "java");
		tmap.put(30, "sping");
		tmap.put(20, "jsp");
		
		for(Integer key : tmap.keySet()) {
			System.out.printf("%d:%s\n", key,tmap.get(key));
		}
	}

}
