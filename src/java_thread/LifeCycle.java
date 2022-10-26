package java_thread;

public class LifeCycle extends Thread{
	public LifeCycle() {
		// 스레드 생명주기 
		/*State() 실행 준비상태 -> run -> TERMINATED : 종료
		 * 
		 * sleep , wait 대기 상태
		 * 
		 * 
		 * 
		 */
	}
	@Override
	public void run() {
		System.out.println(getState());
	}
}
