package java001;

import java.util.ArrayList;
import java.util.Comparator;

import java001.Person;

public class main060 {

	public static void main(String[] args) {
		//정렬
		ArrayList<Person> ts = new ArrayList<Person>();
		ts.add(new Person("홍길동",40));
		ts.add(new Person("가비",20));
		ts.add(new Person("나비",30));
		ts.add(new Person("나비",150));
	}
	public static void prnDisplay(ArrayList<Person>alList) {
		for(Person ps : alList) {
			System.out.printf("%s %d\n", ps.getName(), ps.getAge());
		}
		
	}
	public static void sortDisplay(ArrayList<Person>alList) {
		System.out.println("====");
		alList.sort(new Person());
		prnDisplay(alList);
	}
	
	

}
