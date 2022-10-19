package java002_statements;

public class Java022_switch {
	// static int num; // (member변수)
	public static void main(String[] args) {
		// 30 : 4, 6, 9, 11
		// 31 : 1, 3, 5, 7, 8, 10, 12
		// 28 or 29 : 2

		int year = 2028; // 년도
		int month = 2; // 월
		int lastDay ; // 마지막일

		if (!(month >= 1 && month <= 12)) {
			System.out.println("1월 ~ 12월만 가능합니다.");
			return; // main() 메소드를 빠져나옴 (void로 인해 retunr에 따로 값을 안주어도 된다.)
		}

		switch (month) {
		case 4:
		case 6:
		case 9:
		case 11:
			lastDay = 30;
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			lastDay = 31;
			break;
		default:
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
				lastDay = 29; // 윤년
			} else {
				lastDay = 28; // 평년
				
			}break;
		}

		System.out.printf("%d년도 %d월의 마지막일은 %d입니다. \n", year, month, lastDay);
		// System.out.println(num);

	} // end main

} // end class
