package java008_static_access.part04;

/*
 * modifier
 * Access Modifier 접근제어자 4개
 * public (+), protected(#), default, private(-)
 * 
 * UML(Unified Modeling Language : 통합 모델링 언어)
 * 1. UML은 소프트웨어 시스템을 개발할 떄 팀원 간의 아이디어를 도출하거나,
 *    개발할 시스템의 구조와 시스템의 동적인 관점을 표현할 때 사용하는 모델링 언어이다.
 * 2. 시스템을 시각화 하거나 시스템의 사양이나 설계를 문서화하기 위한 표준 표현 방법이다.
 * 
 * package 패키지명;			package java.lang;
 * import 패키지명.클래스;		import java.util.Random;
 * import 패키지명.인터페이스;	import java.lang.Seriable;
 * 
 * class 클래스{
 *   멤버변수;
 *   생성자;
 *   메소드;
 * }
 * 
 * package
 * 1. 비슷한 작업을 수행하는 클래스 및 인터페이스를 묶어서 사용한다.
 * 2. open API에서 제공하는 클래스 : 클래스 및 인터페이스 중복을 피하기 위해서 사용한다.
 * 	  domain : www.gov.kr
 * 	  package : kr.gov
 * 
 * import : 외부 클래스 및 인터페이스 위치를 JVM에 알려주기 위해서 사용한다.
 *        : 다른 곳의 패키지를 가져올 때 클래스 위치를 잡아줘야 한다. 중복 사용이 가능하며 패키지 선언 후 작성해줘야 한다.
 * 
 * 제어자(modifier)
 * 1. 클래스, 변수, 메서, 생성자의 선언부에 사용되어 부가적인 의미를 부여한다.
 * 2. 제어자는 크게 접근제어자(Access Modifier)와 그 외의 제어자로 구분한다.
 * 3. 하나의 대상에 여러 개의 제어자를 조합해서 사용할 수 있으나, 접근제어자는 단 하나만 사용할 수 있다.
 *    접근제어자 - public, protected, default(=package), private
 *    그 외의 제어자 - static, final, abstract, synchronized...
 *    public static final int data; (접근제어자는 단 하나만 사용 가능)
 * 
 * 접근제어자(Access Modifier)
 *  : 멤버 또는 크랠스에 사용되어, 외부로부터의 접근을 제한한다.
 * 1. private : 정의된 클래스에서만 접근이 가능하다.
 * 2. default : 같은 패키지에서만 접근이 가능하다.
 * 3. protected : 같은 패키지내에서, 그리고 다른 패키지의 자손 클래스에서 접근이 가능하다.
 * 4. public : 접근 제한이 없다.
 * 5. 접근제어자의 범위
 *    public > protected > default > private
 * 접근제어자 사용
 * class : default, public 만 사용 가능하다.
 * variable, method, constructor : private, default, protected, public 전부 사용 가능
 * 
 * 클래스 관계
 * 1. has a : 포함 관계
 * 2. is a : 상속 관계
 */
public class Java087_access {
	private int var_private = 1;
	int var_default = 2;
	protected int var_protected = 3;
	public int var_public = 4;

	public Java087_access() {

	}

//	public static Java087_access() {
//		
//	}
}
