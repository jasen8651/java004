package java003_01;

import java.awt.dnd.DragSourceListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

import java001.Ascending;

public class main01 {

	public static void main(String[] args) {
		Integer[]it = new Integer[] {3,5,2,4,7};
		
		ArrayList<Integer> aList = new ArrayList<Integer>(Arrays.asList(it));
		System.out.println(aList.toString());
		
		/*
		 * ArrayList<Integer> alList = new ArrayList<Integer>(); for(int i=0;
		 * i<alList.size(); i++) { aList.add(sourceList.get(i)); }
		 */
		
		ArrayList<Integer> desList =(ArrayList<Integer>)aList.clone();
		System.out.println("destlist"+ desList.toString());
		
		
		Predicate<Integer> p = x->x%2==0;
		aList.removeIf(p);
		
		aList.sort(new Ascending());
		System.out.println("sourcelist"+ aList.toString());
		System.out.println("destlidt"+desList.toString());
		System.out.println(aList.toString());
		
	}

}
