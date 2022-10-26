package java_thread;

public class Therad extends Thread{
	
	public Therad() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.printf("%s i=%d\n", Thread.currentThread().getName(),i);
		}
	}
}
