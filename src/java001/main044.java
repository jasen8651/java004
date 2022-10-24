package java001;
import java.util.LinkedList;

public class main044 {

	public static void main(String[] args) {
		/*
		 * 큐 fifo: 선입 선출 
		 */
		LinkedList<String> nq = new LinkedList<String>();
		
		nq.offer(new String("java"));
		nq.offer(new String("jsp"));
		nq.offer(new String("string"));
		
		while(!nq.isEmpty()) {
			System.out.println(nq.poll());
		}
		
		

	}

}
