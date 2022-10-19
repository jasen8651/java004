package java003_statements;

/*
 * while(true){
 * 	반복 수행할 문장
 * }
 * true : 수행 문장이 true가 될때까지 반복해서 수행한다.
 */
public class Java035_while {

	public static void main(String[] args) {
		int cnt = 1;
		while (true) {
			System.out.println(cnt++);
			if (cnt == 6) {
				break;
			}
		}
	} // end main()

} // end class
