package java1001_ba;

public class java10 {

	public static void main(String[] args) {
		int a = 3;
		int b = 5;
		int c = 7;
		boolean res = (++a > b) && (++b < c);
		System.out.printf("a=%d, b=%d, c=%d, res=%b", a, b, c, res);

		System.out.printf("\n");
		int x = 4;
		int y = 8;
		int z = 10;
		res = (z > ++y) || (++x < y);
		System.out.printf("x=%d, y=%d, z=%d, res=%b", x, y, z, res);

		System.out.printf("\n");
		// 우선순위 &&, ||
		int k = 1;
		int m = 2;
		int n = 3;
		res = k == 2 && m == 2 || n == 3;
		System.out.printf("k=%d, m=%d, n=%d, res=%b", k, m, n, res);

		System.out.printf("\n");
		k = 1;
		m = 2;
		n = 3;
		res = k == 2 || m == 2 && n == 3;
		System.out.printf("k=%d, m=%d, n=%d, res=%b", k, m, n, res);
		
		
	}

}
