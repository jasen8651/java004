package java_thread;

public class UserImp implements Runnable{
	
	public UserImp() {
		
	}
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.printf("%s i=%d\n", Thread.currentThread().getName(),i);
		}
		
	}
}
