package java001_1;

public class OuterLocal {
	private int x;
	static int y;
	final private int z= 10;
	
	public void call(int a) {
		final int b =20;
		int c=30;
		//a=300;
		//c=500;
		System.out.printf("a=%d\n",a);
		
		class InnrerLocal{
			void prn() {
				x=5;
				y=150;
				
				
				System.out.println("x="+x);
				System.out.println("y="+y);
				System.out.println("a="+a);
				System.out.println("b="+b);
				System.out.println("c="+c);
			}
		}
		InnrerLocal inner = new InnrerLocal();
		inner.prn();
	}
}
