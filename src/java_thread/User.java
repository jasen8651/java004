package java_thread;

public class User extends Thread{
	public User() {
		// TODO Auto-generated constructor stub
	}
	//스레드를 실행할 문장을 구현
	@Override
	public void run() {
		for(int i=0; i<=5; i++) {
			System.out.printf("%s i=%d\n", getName(),i);
		}
	}
}
