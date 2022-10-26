package java001_1;

public class main_class {
	
	private int num;
	private int data;
	
	
	private void display() {
		System.out.println("display");
	}
	
	class InnerInstance{
		public void run() {
			num =10;
			System.out.println(num);
		}
	}

}
