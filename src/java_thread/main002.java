package java_thread;

public class main002 {

	public static void main(String[] args) {
		UserImp um = new UserImp();
		Thread th = new Thread(um);
		th.start();
		
		for(int j=0; j<=5; j++) {
			System.out.printf("%s j=%d\n",Thread.currentThread(),j);
		}

	}

}
