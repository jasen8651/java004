package java010_abstract_interface.part04;

public interface CarRun {
	int carCount = 5; // 생략 - (public static final) int carCount = 5;
	
	// public CarRun() {} // 생성자 가질 수 없다.
	// static {System.out.println("CarRun");}
	
	void prn(); // abstract public 생략
	// void display() {}
	
	class Sun{ // public static class Sun { }
		public Sun() {
			System.out.println("Sun Constructor");
		}
	}
	
}
