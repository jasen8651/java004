package java010_abstract_interface.part01;

abstract public class CarAbs {
	int speed;
	String color;

	public CarAbs() {

	}

	/** 오버라이딩해서 사용하시오. */
	abstract public void work(); // 추상메서드(abstract method)

	public void display() {
		System.out.printf("%d %s \n", speed, color);
	}
}
