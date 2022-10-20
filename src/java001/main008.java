package java001;

public class main008 {

	public static void main(String[] args) {
	StringBuffer sb = null;
	
	
	try {
	sb.reverse();
	}catch (NullPointerException ex) {
		sb = new StringBuffer("java");
		System.out.println(sb);
		}finally {
			System.out.println("pg end");
		}
	}

}
