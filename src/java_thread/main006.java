package java_thread;

public class main006 {

	private static String who;

	public static void main(String[] args) {
		Wahroom wr = new Wahroom();
		Family father = new Family(wr, who);
		
		father.start();

	}

}
