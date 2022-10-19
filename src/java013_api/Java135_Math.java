package java013_api;

import static java.lang.Math.*;

public class Java135_Math {

	public static void main(String[] args) {
		// 임의값 0.0 <= x < 1.0
		double ran = random();
		System.out.println(ran);

		// 임의값 0.0 <= x < 10.0
		ran = ran * 10;
		System.out.println(ran);

		// 소수점 이하는 버림(0.0 ~ 9.0을 리턴)
		int num = (int) floor(ran); // round(반올림), ceil(입력 인자 값보다 크거나 같은 가장 작은 정수 값을 double 형으로 리턴)
		System.out.println(num);

		// 1부터 10까지
		num = num + 1;
		System.out.println(num);

		System.out.println("========================");

		// 한 문장으로 축약하면 아래와 같다.
		System.out.println((int) (floor(random() * 10)) + 1);
	} // end main()

} // end class
