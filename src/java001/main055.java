package java001;

import java.util.ArrayList;
import java.util.Arrays;

public class main055 {

	public static void main(String[] args) {
		// 정렬
		Integer[] arr = new Integer[] {1,3,5,2,4,1};
		
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(arr));
		aList.sort(new Ascending());
		
		System.out.println(aList.toString());
		
		
		aList.sort(new Descending());
		System.out.println(aList.toString());
	}

}
