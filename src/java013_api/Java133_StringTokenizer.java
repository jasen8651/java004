package java013_api;

import java.util.StringTokenizer;

public class Java133_StringTokenizer {

	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("java,/jsp/spring", ",/"); // ",/" : '쉼표(,)나 슬래시(/)이면' 이라는 뜻
		System.out.println(st.countTokens());
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

		System.out.println("============================");

		// split에는 정규화표현식 사용이 가능하다.
		String[] data = new String("java,/jsp/spring").split("[,/]");
		System.out.println(data.length);
		for (int i = 0; i < data.length; i++) {
			System.out.printf("data[%d]=%s\n", i, data[i]);
		}

	} // end main()

} // end class
