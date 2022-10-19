package java010_abstract_interface.part01;

/*
 * 클래스 종류 : 클래스, 추상클래스, 인터페이스
 * 
 * 메서드 정의 : 메서드 선언부 + 메서드 구현부
 *            public void prn() { '구현부' }
 * 
 * 추상메서드 : 선언부만 정의된 메서드이다.
 *           abstract public void prn();
 * 
 * 추상클래스 : 추상 메서드를 가지고 있는 클래스이다.
 *           abstract public class Test{ }
 * 
 * 추상클래스 제공 목적 : 추상메서드를 강제적으로 오버라이딩하고 객체 생성을 할 수 있도록 하기 위해서
 * 
 * 추상메서드를 사용하기 위해서는 abstract를 클래스에 반드시 써줘야 한다.
 * 
 */
public class Java102_abstract {

	public static void main(String[] args) {
		// CarAbs car = new CarAbs(); // 추상클래스는 객체 생성이 불가능 하다.
		SenndaAbs sa = new SenndaAbs();
		sa.work();
		
		TruckAbs ta = new TruckAbs();
		ta.work();
	}

}
