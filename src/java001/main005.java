package java001;

import java.util.GregorianCalendar;

public class main005 {

	public static void main(String[] args) {
		int year = 2000;
		GregorianCalendar ger = new GregorianCalendar();
		System.out.println(ger);
		
		if(ger.isLeapYear(year)) {
			System.out.println(year+"년도는 윤년입니다.");
		}else {
			System.out.println(year+"년도는 평년입니다.");
		}
	}

}
