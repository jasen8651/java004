package java003_statements;

/*
 * 	1	2	3	4
 * 	5	6	7	8	
 * 	9	10	11	12
 */
public class Java031_for {

	public static void main(String[] args) {
		int data = 1;

		for (int row = 1; row <= 3; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.printf("%4d", data++);
				// data++;
			} // end for row
			System.out.println();
		} // end for col
	} // end main

} // end class
