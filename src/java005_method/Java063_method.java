package java005_method;

public class Java063_method {

	public static void main(String[] args) {
		int[] num = new int[] { 5, 2, 7, 8, 4 };
		System.out.printf("최대값: %d \n", max(num));
		System.out.printf("최소값: %d \n", min(num));
		System.out.printf("배열의 크기: %d \n", size(num));
	} // end main()

	// 최대값
	public static int max(int[] arr) {
		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (max < arr[i])
				max = arr[i];
		}
		return max;
	} // end max()

	// 최소값
	public static int min(int[] arr) {
		int min = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (min > arr[i])
				min = arr[i];
		}
		return min;
	} // end min()

	// 배열의 크기
	public static int size(int[] arr) {
		return arr.length;
	} // end size()

} // end class
