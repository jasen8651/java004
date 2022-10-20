package java001;


public class main013 {

	public static void main(String[] args) {
		int data =8;
		try {
		if(data<10) 
			throw new Exception("10이상만 입력하라");
			System.out.println(data);
		}catch (Exception ex) {
			System.out.println(ex.toString());
		
		
		}
		
	}

}
