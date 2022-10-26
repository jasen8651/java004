package java_thread;

public class main005 {

	public static void main(String[] args) {
	Priority p1 = new Priority();
	p1.start();
	
	Priority p2 = new Priority();
	p2.setPriority(10);
	p2.start();
	
	
	Priority p3 = new Priority();
	p3.setPriority(3);
	p3.start();

	
	Priority p4 = new Priority();
	p4.setName("user");
	p4.start();

	Priority p5 = new Priority();
	p5.setPriority(7);
	p5.setName("user");
	p5.start();



	}

}
