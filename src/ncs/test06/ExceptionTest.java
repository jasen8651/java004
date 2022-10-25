package ncs.test06;

import java.util.Scanner;

public class ExceptionTest {

	public static void main(String[] args) {
		ExceptionTest e = new ExceptionTest();
		e.test();
		

	}
	public void test() {
		Calculator c= new Calculator();
		Scanner sc= new Scanner(System.in);
		
		try {
			System.out.println("입력 :");
			int a = sc.nextInt();
			System.out.printf("결과값 :",c.getsum(a));
		}catch (InvalidException e) {
			System.out.println(e);
		}
		
	}

}
