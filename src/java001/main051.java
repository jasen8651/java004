package java001;

public class main051 {

	public static void main(String[] args) {
		main050<Integer> intbox = new main050<Integer>();
		intbox.setData(10);
		System.out.println(intbox.getData());
		
		main050<String> srtbox= new main050<String>();
		System.out.println(srtbox.getData());
		
		main050<Double> dlebox = new main050<Double>();
		System.out.println(dlebox.getData());
		
	}

}
