package java013_api;

import static java.lang.Math.*;

/*
 * 난수를 이용해서 소수점 첫째자리까지 반올림해서 구하시오.
 * ex) 0.5689.... => 5.7
 */
public class Java136_Math {

	public static void main(String[] args) {
		double ran = random();
		ran = ran * 10;
		double num = round(ran * 10);
		System.out.println(num / 10.0);

		System.out.println((double) (round(random() * 100)) / 10.0);

		System.out.println("========================");

		double nan = random();
		System.out.println(nan);

		nan = nan * 100;
		System.out.println(nan);

		long data = round(nan);
		System.out.println(data);

		double res = (double) data / 10;
		System.out.println(res);

		System.out.println("========================");
		double db = random();
		System.out.println(db);
		System.out.println((double) (round(db * 100)) / 10);

	} // end main()

} // end class
