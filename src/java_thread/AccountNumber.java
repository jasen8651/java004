package java_thread;

import java.util.Scanner;

public class AccountNumber {
	private long depositMoney = 100000;
	private long balace; //카드금액
	private Scanner sc= new Scanner(System.in);
	
	
	synchronized public void input() {
		System.out.printf("%s 지점 입장\n",Thread.currentThread().getName());
		try {
			System.out.print("출금금액입력 :");
			balace = sc.nextLong();
		}catch (NullPointerException ex) {
			System.out.println(ex.toString());
		}withDraw();
	}
	
	synchronized public void withDraw() {
		if(depositMoney>= balace) {
			depositMoney = depositMoney - balace;
			System.out.printf("남은 금액은 : %d입니다.\n", depositMoney);
		}else {
			System.out.printf("잔액이 부족하다",depositMoney);
		}
	}
}
