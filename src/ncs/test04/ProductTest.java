package ncs.test04;

import java.util.Scanner;

public class ProductTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		try {
			System.out.println("제품명 : ");
			String name = sc.nextLine();
			System.out.println("가격 : ");
			int pay = sc.nextInt();
			System.out.println("개수 :");
			int amount = sc.nextInt();
			
			Product pd = new Product(name, pay, amount);
			System.out.println(pd.information());
			System.out.println("총가격 : "+pd.getPay()*pd.getAmount());
		}catch (Exception e) {
			System.out.println("잘못된정보");
		}
		

	}

}
