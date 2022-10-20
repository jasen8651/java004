package java001;

import java.util.Calendar;

public class main003 {

	public static void main(String[] args) {
		//2016sus 2월 마지막일과 요일을 구하는 프로그램
		Calendar cal = Calendar.getInstance();
		int year = 2016;
		int month =2;
		
		
		cal.set(Calendar.YEAR,2016);
		cal.set(Calendar.MONTH,month-1);
		System.out.println(cal.toString());
		
		int data = cal.getActualMaximum(Calendar.DATE);
		cal.set(Calendar.DATE, data);
		System.out.println(cal.toString());
		
		
		int day = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		char week=' ';
		switch (day) {
		case 1: week='일'; break;
		case 2: week='월'; break;
		case 3: week='화'; break;
		case 4: week='수'; break;
		case 5: week='목'; break;
		case 6: week='금'; break;
		case 7: week='토'; break;
				
		}
		System.out.printf("%d-%d-%d %c요일\n", year, month, data, week);
	}

}
