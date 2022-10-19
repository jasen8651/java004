package java003_statements;

public class Java031_for_2 {

	public static void main(String[] args) {
		int data = 0;

		label: for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 4; col++) {
				// data++;
				System.out.printf("%4d", ++data);
				if (data % 4 == 0) {
					System.out.println();
					continue label;
				}

			} // end for row
		} // end for col
	} // end main

} // end class
