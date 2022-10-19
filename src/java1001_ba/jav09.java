package java1001_ba;


public class jav09 {

	public static void main(String[] args) {
		
		/*
		 * int x=5; int y=3; int z= 3;
		 * 
		 * System.out.println(x>y);//참 System.out.println(x<y);//거짓
		 * 
		 * System.out.println(x<=y); System.out.println(x>=y); System.out.println(x==z);
		 * System.out.println(x != z);
		 */
		
		//True &&  true -> 참
		// 거짓||거짓 => 거짓
		// !참 => 거짓 -> 거짓
		int x=3; int y=6; int z= 3;
		boolean res;
		res = x<y && x==z;
		System.out.println(res);
		
		res= x>y || x==z;
		System.out.println(res);

	}

}
