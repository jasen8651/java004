package java001;

import java.util.Comparator;

public  class Ascending implements Comparator<Integer> {
	
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		//return o2>o1 ? -1 : o2<o1? 1:0;
		
		return o1.compareTo(o2);
	}

}
