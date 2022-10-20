package java001;

public class main012 {

	public static void main(String[] args) {
		// throw : 예외처리를 메소도를 호출한 다른 메소드에서 하도록 전달하는 기능
		//   목적 : 몌외가 발생된 메소드오 이를 초출하는 메소드 양쪽에서 예외처리를 해주는 경우에 사용
		//	  java.lo, java.net패키지에 많이 선언 		
		String data1 = "12";
		String data2 = "6";
		
		try {
			int x = Integer.parseInt(data1);
			int y = Integer.parseInt(data2);
		}catch (NumberFormatException ex) {
			System.out.println(ex.toString());
		}catch (ArithmeticException ex) {
			System.out.println(ex.toString());
		}
	}
	public static void process(int x, int y) throws ArithmeticException{
		int res = x/y;
		System.out.println(res);
		
	}
}
