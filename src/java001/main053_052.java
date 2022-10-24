package java001;

public class main053_052 {

	public static void main(String[] args) {
		Integer[] it = new Integer[] { 1, 5, 3, 2 };
		main052<Integer> av = new main052<Integer>(it);
		System.out.println(av.findmain052());

		Number[] nb = new Number[] { 2, 5.3f, 4.5 };
		main052<Number> ae = new main052<Number>(nb);
		System.out.println(ae.findmain052());

		/*
		 * String[] sn = new String[] {"java", "jsp"}; main052<String> as = new
		 * main052<String>();
		 */// Bound mismatch: The type String is not a valid substitute for the bounded
			// parameter <T extends Number> of the type main052<T>
			// Bound mismatch: The type String is not a valid substitute for the bounded
			// parameter <T extends Number> of the type main052<T>
		
	}

}
