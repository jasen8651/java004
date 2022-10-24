package java001;

import java.util.ArrayList;
import java.util.LinkedList;

public class main041 {

	public static void main(String[] args) {
		/*
		 * 배열구조로 데이터 관리 : vector, arraylist,
		 * 
		 *노드로 데이터 관리 : linkedlist
		 *
		 *list로 구현하는 컬랙션 : vector, arraylist , linfedlist은 add 해준 순서로 관리
		 */
		ArrayList<String> aList = new ArrayList<String>();
		aList.add(new String("java"));
		aList.add(new String("jsp"));
		aList.add(new String("string"));
		
		aList.add(1, new String("musql"));
		aList.remove(2);
		
		for(int i=0; i<aList.size(); i++) {
			System.out.printf("aList[%d]=%s\n", i,aList.get(i));
		}
		System.out.println("linkedlist");
		LinkedList<String> aNode = new LinkedList<String>();
		aNode.add(new String("java"));
		aNode.add(new String("jsp"));
		aNode.add(new String("string"));
		
		aNode.add(1, new String("musql"));
		aNode.remove(); //첫번째 요소 삭제
		aNode.removeLast(); //마지막요소삭제
		aNode.remove(1); //특정 요소 삭제
		
		for(int i=0; i<aNode.size(); i++) {
			System.out.printf("aList[%d]=%s\n", i,aNode.get(i));
		}
		
		
		
	}

}
