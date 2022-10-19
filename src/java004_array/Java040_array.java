package java004_array;

/*
 * [출력결과]
 * 홀수:3
 * 짝수:42
 */
public class Java040_array {

	public static void main(String[] args) {
		int[] num = new int[] { 22, 3, 8, 12 };
		int odd = 0; // 홀수
		int even = 0; // 짝수

		for (int i = 0; i < num.length; i++) {
			// num[i]의 값이 홀수이면
			if (num[i] % 2 == 1) {
				odd += num[i];
			}else {
				even += num[i];
			}
		}
		System.out.println("홀수:" + odd);
		System.out.println("짝수:" + even);

	} // end main()

} // end class
