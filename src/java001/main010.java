package java001;

import java.util.InputMismatchException;
import java.util.Scanner;

public class main010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] data = new int[2];
		int sum=0;
		for(int i=0; i<data.length; i++) {
			data[i] = inputDate(sc, i);
			sum += data[i];
		}
		System.out.println("배열 요소 총합 : "+sum);

	}
	public static int inputDate(Scanner sc, int index) {
		int num = 0;
		
		while(true) {
		try {
		System.out.printf("%d 번째 정소를 입력",index +1);
		num =sc.nextInt();
		break;
		}catch (InputMismatchException ex) {
			System.out.println("정수를 입력");
			System.out.println("error:"+sc.next());
		}
		}
		
		return num;
		
		
	}
}
