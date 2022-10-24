package java001;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.ListIterator;

public class main042 {

	public static void main(String[] args) {
		
		
		System.out.println("ArrayList<E>");
		ArrayList<String> alist = new ArrayList<String>();
		alist.add(new String("java"));
		alist.add(new String("jsp"));
		alist.add(new String("string"));
		
		ListIterator<String> ank = alist.listIterator();
		System.out.println("앞->뒤");
		while (ank.hasNext()) {
			System.out.println(ank.next());
		}
		System.out.println("뒤-> 앞");
		while (ank.hasPrevious()) {
			System.out.println(ank.previous());
		}
		
		
		System.out.println("--------------------------------");
		
		
		
		LinkedList<String> aNode = new LinkedList<String>();
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("string"));
		
		ListIterator<String> ite = aNode.listIterator();
		System.out.println("앞->뒤");
		while (ite.hasNext()) {
			System.out.println(ite.next());
			
		}
		System.out.println("뒤->앞");
		while (ite.hasPrevious()) {
			System.out.println(ite.previous());
			
		}
	}

}
