package java008_static_access.part02;

/*
 * 클래스명
 *   static{};
 *   생성자();
 *   메서드();
 * }
 */
public class OrderStatic {
	// static은 생성자보다 먼저 실행이 된다. 무조건 실행된다.
	static {
		System.out.println("static");
	}

	public OrderStatic() {
		System.out.println("constructor");
	}
	
	public void display() {
		System.out.println("display");
	}
}
