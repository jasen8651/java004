package java001_basic;

public class Java009_operators {

	public static void main(String[] args) {
		int x = 3;

		// 전위 연산자(피연산자 앞에 연산자가 위치하면 전위 연산자라고 부른다.)
		++x; // x = x + 1, x += 1
		System.out.println(x); // 4

		--x; // x = x - 1, x -= 1
		System.out.println(x); // 3

		int y = 5;

		// 후위 연산자(피연산자 뒤에 연산자가 위치하면 후위 연산자라고 부른
		y++;
		System.out.println(y); // 6

		y--;
		System.out.println(y); // 5
		
		// 리터럴은 증강연산자를 사용할 수 없다.
		// 10++;
		
		// 상수 : 한번만 기억할 수 있는 메모리 공간
		final int NUM = 4;
		// 상수는 증감 연산자를 사용할 수 없다.
		// NUM++;

	}

}
