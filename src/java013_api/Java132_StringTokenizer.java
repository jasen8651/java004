package java013_api;

// ctrl + shift + o
import java.util.StringTokenizer;

public class Java132_StringTokenizer {

	public static void main(String[] args) {
		// StringTokenizer("문자열", "구분자")
		// 문자열의 구분자가 공백일때는 2번째 인자값(구분자)은 생략할 수 있다.
		// StringTokenizer st = new String("java,jsp",",");

		StringTokenizer st = new StringTokenizer("java jsp");
		// System.out.println(st.countTokens()); // 2
		// System.out.println(st.nextToken()); // java
		// System.out.println(st.countTokens()); // 1
		// System.out.println(st.nextToken()); // jsp
		// System.out.println(st.countTokens()); // 0
		// System.out.println(st.nextToken());
		// Exception in thread "main"java.util.NoSuchElementException

		// for (int i = 0; i < st.countTokens(); i++) {
		// System.out.println(st.nextToken());
		// }

		// int count = st.countTokens();
		// for (int i = 0; i < count; i++) {
		// System.out.println(st.nextToken());
		// }

		// 메모리에 저장된 토큰이 있으면 true, 없으면 false를 리턴한다.
		while (st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
	} // end main()

} // end class
