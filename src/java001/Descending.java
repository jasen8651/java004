package java001;

import java.util.Comparator;

public class Descending implements Comparator<Integer>{
	
	
	
	@Override
	public int compare(Integer o1, Integer o2) {
		
		return o2>o1 ? -1 : o2<o1? 1:0;
		
		
	}
}
