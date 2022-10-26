package java_thread;

public class Priority extends Thread{
	public Priority() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.printf("%s Priority=%d\n",getName(),getPriority(),i);
		}
	}
}
