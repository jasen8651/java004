package java013_api;

import java.util.Scanner;

/*
 * 단입렵: 5
 * 5 X 1 = 5
 * 5 X 2 = 10
 * . . .
 * 5 X 9 = 45
 * 계속하시겠습니까?(종료:n, 계속:아무키) n
 * 프로그램종료
 */
public class Java143_Scanner {

	public static void main(String[] args) {
		// 답
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.print("단입력:");
			int dan = sc.nextInt();
			for(int i = 0 ; i < 10; i++) {
				System.out.printf("%d X %d = %d \n", dan, i , dan * i);
			}
			System.out.print("계속하시겠습니까?(종료:n/계속:아무키): ");
			String chk = sc.next(); // next() : 값을 바로 입력. new를 의미한다. 새로운 데이터(객체)를 chk에 입력한 것이다.
			// if(chk == "n") : 주소를 가리킨다.
			if(chk.equals("n")) {
				break;
			}
			
		}
		System.out.println("프로그램 종료");
	} // end main()
}
// end class
