package java001;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class main017 {

	public static void main(String[] args) {
		
		
		InputStream is = System.in;
		
		InputStreamReader ir = new InputStreamReader(is);
		
		BufferedReader br = new BufferedReader(ir);

		Scanner sc = new Scanner(System.in);
		int x,y;
		System.out.println("x:");
		x= sc.nextInt();
		System.out.println("y:");
		y= sc.nextInt();
		System.out.printf("%d  + %d= %d\n",x,y,x+y);
		sc.close();
	}

}
