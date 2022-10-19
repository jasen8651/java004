package java1001_ba;

/*
* 동전교환프로그램
* 1 가장 적은 동전으로 교환할 수 있는 프로그램을 작성하시오
* 2 [출력결과]
*   500원: 15개 
    100원: 2개
    50원: 1개
    10원: 2개
    1원: 7개
    */

public class Prob07 {

	public static void main(String[] args) {
		int money = 7777;
		int mok=money/500;		
		
		//여기에 작성하시오.
		int coin500= (int)money/500;
		System.out.println("500원"+coin500);
		money = money - coin500 * 500;
		int coin100= (int)money/100;
		System.out.println("100원"+coin100);
		money = money - coin100 * 100;
		int coin50= (int)money/50;
		System.out.println("50원"+coin50);
		money = money - coin50 * 50;
		int coin10= (int)money/10;
		System.out.println("10원"+coin10);
		money = money - coin10 * 10;
		int coin1= (int)money/1;
		System.out.println("1원"+coin1);
		money = money - coin1 * 1;
		
		
				
	}//end main()

}//end class


