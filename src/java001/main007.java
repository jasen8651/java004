package java001;

public class main007 {

	public static void main(String[] args) {
		int [] num = new int [3];
		num[0]=10;
		try {
		display(num);
		}catch (ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}
		System.out.println(num[0]);
		
		////////////////////////////
		
		
		
	}
	
	
	private static void display(int[] num) throws ArrayIndexOutOfBoundsException {
		System.out.println(num[5]);
	}


	public static void process(int num[]) {
		try {
			//예외 발생가능성
			System.out.println(num[4]);	
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.getMessage());
			//System.out.println(ex.toString());
			//ex.printStackTrace();
		}finally {
			System.out.println("pg end");
		}
	}

}
