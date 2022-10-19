package java013_api;

/*
 * 1. 기본자료형을 클래스를 정의해놓은 것을 Wrapper라 한다.
 *   char		-> Character
 *   byte		-> Byte
 *   short		-> Short
 *   int		-> Integer
 *   long		-> Long
 *   float		-> Float
 *   double		-> Double
 *   boolean	-> Boolean
 *   
 * 2. 메모리에 저장된 값을 다른 자료형으로 변환해주는 메서드를 제공하기 위해서 Wrapper클래스를 제공한다.
 * 
 * 3. auto boxing과 auto unboxing은 jdk5.0에서 추가된 기능이다.
 *    auto boxing => 스택 => 힙영역에 복사
 *    auto unboxing => 힙 => 스택영역에 복사
 */
public class Java144_Wrapper {

	public static void main(String[] args) {
		String data = "123";

		// String -> Integer
		Integer it = new Integer(data);

		// Integer -> int
		int num = it.intValue();

		System.out.println(num);

		// String -> Integer
		Integer ig = Integer.valueOf(data);
		int num2 = ig; // auto unboxing
		System.out.println(num2);

		// Integer -> double
		double pro = it.doubleValue();
		System.out.println(pro);

		double pro2 = it; // auto unboxing

		// Integer -> long
		long nn = it.longValue();
		System.out.println(nn);
		long nn2 = it; // auto unboxing
		System.out.println(nn2);

		Double db = new Double(data);
		Double de = Double.valueOf(data);
		int x = de.intValue();
		System.out.println(x);
		// 크기 차이로 auto unboxing이 안됨
		// int x2 = (int) de; // de는 객체이다.
		// System.out.println(x2);

		double y = de.doubleValue();
		System.out.println(y);
		double y2 = de; // auto unboxing
		System.out.println(y2);

		// String => int
		int a = Integer.parseInt(data);
		System.out.println("a=" + a);

		// String => byte
		byte b = Byte.parseByte(data);
		System.out.println("b=" + b);

		// String => double
		double c = Double.parseDouble(data);
		System.out.println("c=" + c);

		boolean numBoolean = Boolean.parseBoolean(data);
		System.out.println("numBoolean=" + numBoolean); // false

		numBoolean = Boolean.parseBoolean("true");
		System.out.println("numBoolean:" + numBoolean); // true boolean에서 true를 제외하고는 모두다 false로 리턴된다.

		numBoolean = Boolean.parseBoolean("false");
		System.out.println("numBoolean:" + numBoolean); // false
		
		String ss = String.valueOf(1);
		System.out.println(ss);
		Double da = Double.valueOf("1");
		System.out.println(da);
		double dt = da; // auto unboxing실 행으로 인해 가능하다.
		System.out.println(dt);
		
		int k = 10;
		Integer in = new Integer(k); // 스택영역에서 힙영역으로 보내는 작업
		Integer is = k; // auto boxing 실행으로 인해 가능하다.
		System.out.println(is);
		System.out.println(is == k );
		
		int m = is; // auto unboxig 실행
		
		///////////////////////////////////////////////////
		
		double dm = 5.4;
		Double valDouble = dm; // auto boxing 실행
		double dn = valDouble; // auto unboxing 실행
		
		String ko = "90";
		Double dp = Double.valueOf(ko); // String -> Double
		String kt = dp.toString(); // Double -> String / toString() : 모든 객체를 String 객체로 바꿔주는 기능
		double kd = Double.parseDouble(ko); // String -> double
		
		
		

	} // end main()

} // end class
