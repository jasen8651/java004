package java005_method;

public class Java064_method {

	public static void main(String[] args) {
		char[] arr = { 'j', 'a', 'v', 'a', ' ', 't', 'e', 's', 't' };
		System.out.println(arr);
		System.out.println(reverse(arr));
		System.out.println(arr);
	} // end main()

	public static char[] reverse(char[] data) {
		// data의 요소 앞뒤를 바꿔서 리턴하는 프로그램 구현
		// 기존의 data의 값을 바꾸면 call by reference가 일어나 새로운 주소를 만들어 값을 복사하여 작성해야한다.
		char[] imsi = new char[data.length];
		for (int i = 0; i < data.length; i++) {
			imsi[i] = data[data.length - 1 - i];
		}
		return imsi;
	} // end reverse()
} // end class
