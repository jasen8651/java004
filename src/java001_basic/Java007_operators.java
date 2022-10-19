package java001_basic;

public class Java007_operators {

	public static void main(String[] args) {
		int a = 10;
		int b = 3;
		System.out.println(a/b); // int/int => 3
		System.out.println((double)a/b); // 3.3333333.... : a값이 double타입으로 바뀐 후 10.0이 되고 그 뒤에 연산자가 진행이 된다.
		System.out.println((double)(a/b)); // 3.0 : (a/b)가 이루어지고 그 값이 double타입으로 출력된다.
		
	}

}
