package java_thread;

public class main004 {

	public static void main(String[] args) {
		LifeCycle cc=  new LifeCycle();
		
		System.out.println(cc.getState()); 
		
		cc.start();
		
		try {
			cc.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(cc.getState());
		System.out.println("main end");
	}

}
