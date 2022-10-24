package java001;

import java.util.ArrayList;

public class main037 {

	public static void main(String[] args) {
		/*
		 * 컬랙션 클레스를 선언하고 생성할때 선언
		 * 재너릭 : 컬랙션 클레스에 저장된 객체를 가져올때 다운캐스팅하는 작업을 생략 가능기능 제공
		 * 
		 * 
		 * vector와 arraylist  
		 * 백터는 동기화 처리가 되어 있고 어레이 리스트는 비동기화처리
		 * 메모리요소를 처리할때 배열의 구조를 따른다.
		 * 클레스는 처리방법이 비슷함, 수시로 요소의 삽입 삭제를 처리하는것은 좋은 방법 안미
		 */
		ArrayList<Integer> alist = new ArrayList<Integer>();
		alist.add(10); 
		alist.add(20);
		alist.add(30);
		
		for(int i=0; i<alist.size(); i++) {
			System.out.println(alist.get(i));
		}
		System.out.println("========================");
		for(Integer it : alist) { //개선된 for문
			System.out.println(it);
		}
		System.out.println("========================");
		System.out.println(alist.remove(0));
		for(Integer it : alist) { //개선된 for문
			System.out.println(it);
		}
		
		System.out.println("========================");
		System.out.println(alist.remove(new Integer(20)));
		
		
	}

}
