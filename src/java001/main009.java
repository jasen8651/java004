package java001;

public class main009 {

	public static void main(String[] args) {
		String data1 ="a";
		String data2 ="0";
		
		try {
			int x = Integer.parseInt(data1);
			int y= Integer.parseInt(data2);
			int rec = x/y;
			System.out.println(rec);
		}catch(ArrayIndexOutOfBoundsException ex) {
			System.out.println(ex.toString());
		}catch (NumberFormatException ex) {
			System.out.println(ex.toString());
		}catch (RuntimeException ex) {
			System.out.println(ex.toString());
		}
	}

}
