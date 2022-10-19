package java009_inheritance.part01;

// 상속자를 따로 작성 안하면 Object를 상속받는다.
public class Father /*extends Object*/ {
	int a= 3;
	// private은 상속이 안된다.
	private int c = 10; 
	// 생성자는 상속이 안된다.
	public Father() {
		System.out.println("Father");
	}
	
	
	void display () {
		System.out.println("a= " + a);
	}
}
