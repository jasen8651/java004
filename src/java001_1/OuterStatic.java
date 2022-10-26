package java001_1;

public class OuterStatic {

	private int x;
	static private int y;
	
	static void call() {
		y=9;
		System.out.println(y);
	}
	static class InnerStatic{
		int z; 
		void prn() {
			//x=50; -> 비 스택틱 외부자원을 스택틱 내부클레스에 참조 불가능
			y=20;
			System.out.printf("y= %d z=%d\n", y,z);
		}
	}

}
