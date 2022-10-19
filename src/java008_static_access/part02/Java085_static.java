package java008_static_access.part02;

public class Java085_static {
	int x = 3;
	static int y = 5;
	public static void main(String[] args) {
		// System.out.printf("x = %d \n", x);
		System.out.printf("y = %d \n", y);
		// process(); // non-static
		Java085_static js = new Java085_static();
		js.process();
		
		display(); // static
		
	} // end main()
	
	public void process() {
		System.out.println("process");
		display(); // non-static 메서드에서 static메서드 호출 가능
	} // end process()
	
	public static void display() {
		System.out.println("display");
	} // end display()
	
} // end class
