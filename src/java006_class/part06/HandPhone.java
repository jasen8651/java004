package java006_class.part06;

/*
 * 생성자(constructor)
 * 1. 객체의 초기값 할당
 * 2. 생성자명은 클래스명과 같아야 한다.
 * 3. 생성자는 클래스에서 1개 이상이 존재해야 한다.
 * 4. 클래스에 정의된 생성자가 없으면 JVM에서 기본 생성자를 제공한다.
 * 
 * [기본생성자]
 * - 클래스의 '접근제어자'하고 같으며 파라미터가 없는 구조이다.
 * 	 public HandPhone() {}
 * - 클래스에 정의된 생성자가 1개라도 존재하면 기본 생성자는 JVM에서 제공하지 않는다.
 */
public class HandPhone {
	// 멤버 변수
	String name;
	String number;

	// 기본 생성자 : JVM에서 자동 생성 해준다.
	// : 생성자 명은 클래스 명과 똑같아야한다. 생성자가 하나라도 정의되어 있다면 기본 생성자는 제공되지 않는다.
	// public HandPhone() {}

	HandPhone() {
	}

	HandPhone(String name) {
		this.name = name;
	}

	HandPhone(String name, String number) {
		this.name = name;
		this.number = number;
	}

	// 메소드
	void display() {
		System.out.printf("%s %s \n", name, number);
	}
}
