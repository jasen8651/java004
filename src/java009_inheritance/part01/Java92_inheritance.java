package java009_inheritance.part01;

/*
 * 상속(inheritance) 
 * : 기본 클래스가 가지고 있는 멤버들을 새로 만들 클래스에서 직접 만들지 않고 상속을 받음으로써 새 클래스가 자신의 멤버처럼 사용할 수 있게 만든다.
 * 1. 기본 클래스를 재사용해서 새로운 클래스를 정의하는 것이다.
 * 2. 두 클래스를 조상과 자손 관계를 맺어준다.(extends)
 * 3. 상속을 해주는 클래스 : 수퍼클래스(super), 부모클래스, 기본클래스
 * 4. 상속을 받는 클래스 : 서브클래스(sub), 자식클래스, 유도클래스
 * 5. 자식(손)클래스는 조상의 모든 자원을 상속받는다. (생성자, static{}은 제외)
 * 6. 자식(손)의 자원은 부모보다 크거나 같아야 한다.
 * 7. 상속을 할 때 사용되는 키워드 : extends
 *    클래스에 클래스를 상속 : 단일 상속
 *    인터페이스에 인터페이스 상속 : 다중 상속
 * 
 * class A{ }
 * class B extends A { }
 * 자식클래스 B extends 부모클래스 A
 * => A는 B에게 상속한다. B는 A이다.(상속관계의 클래스를 is a 관계라 한다.)
 * 
 */
public class Java92_inheritance {

	public static void main(String[] args) {
		Child child = new Child();
		System.out.println("b= " + child.b);
		System.out.println("a= " + child.a);
		child.display();
		System.out.println(child.toString());
		// c멤버변수는 private이 선언되어 있기 떄문에 상속이 안된다.
		// System.out.println("c= " + child.c);
	} // end main()

} // end class
