package java007_class.part07;

public class Java080_class {

	public static void main(String[] args) {
		CountVarg cv = new CountVarg();
		cv.addValue(4,8);
		cv.addValue(2,3,9);
		cv.addValue(7,5,7,9,9,200);
		cv.addValue(2.5,1.3);
		cv.sumValue("홍길동", 70, 80, 65); // 가변매개변수 (고정값, 변하는 값);
	}

}
