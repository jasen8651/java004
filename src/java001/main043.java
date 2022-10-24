package java001;

import java.util.LinkedList;

public class main043 {

	public static void main(String[] args) {
		/*
		 * 스택 : 라스트인 퍼스트 아웃 ,
		 * 수식계산 수식 괄호 검사 undo/redoㅡ 뒤로 앞으로
		 *  
		 */
		LinkedList<String> nstack = new LinkedList<String>();
		nstack.push(new String("java"));
		nstack.push(new String("jsp"));
		nstack.push(new String("string"));
		
		 	
		/*
		 * System.out.println(nstack.pop()); System.out.println(nstack.pop());
		 * System.out.println(nstack.pop());
		 */
		
		while(!nstack.isEmpty()) {
			System.out.println(nstack.pop());
		}

	}

}
