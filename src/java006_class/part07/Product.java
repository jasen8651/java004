package java006_class.part07;

/*
 * this : 객체 자신을 의미한다.
 * 1. this.멤버변수
 * 2. this.메서드()
 * 3. this() : 생성자
 */
public class Product {
	String code;
	String pname;
	int cnt;

	public Product() {
		this("p002", "식품", 3000);
	}

//	public Product(String code, String pname, int cnt) {
//		this.code = code;
//		this.pname = pname;
//		this.cnt = cnt;
//	}
	// 우클릭 > source > generate constructor using field
	public Product(String code, String pname, int cnt) {
		this.code = code;
		this.pname = pname;
		this.cnt = cnt;
	}

	void display() {
		System.out.printf("%s %s %d \n", code, pname, cnt);
	}
	
	void prn() {
		this.display(); // or display(); : this를 안써줘도 자동으로 붙여서 실행된다.
	}
}
