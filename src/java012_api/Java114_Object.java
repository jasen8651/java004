package java012_api;

/*
 * Object
 * 1. 클래스 중에서 최상위 클래스
 * 2. Object를 제외한 모든 클래스드은 Object를 상속받고 있다.
 * 3. java.lang패키지에서 제공하는 클래스이다.
 */
public class Java114_Object {

	public static void main(String[] args) {
		Object obj = new Object();
		System.out.println(obj);
		System.out.println(obj.toString());

		int x = 5;
		int y = 5;
		// 값비교(기본 데이터 타입)
		System.out.printf("x=%d y=%d x==y:%b \n", x, y, x == y);

		Object ojt = new Object();
		// 주소비교(참조 데이터 타입)
		System.out.printf("obj=ojt : %b \n", obj == ojt);
		
		// equals() : 주소비교(객체비교만 가능하다.)
		System.out.printf("obj.equals(ojt) : %b \n", obj.equals(ojt));
		
		// class java.lang.Object
		System.out.println(obj.getClass());
		
		// java.lang.Object
		System.out.println(obj.getClass().getName());
		
		// hashCode() : 메모리값
		int num = obj.hashCode();
		System.out.println(num);
		
				
	}
}
