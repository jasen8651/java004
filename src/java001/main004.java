package java001;

import java.util.Calendar;
//수능일 계산기 
public class main004 {

	public static void main(String[] args) {
		Calendar examday = Calendar.getInstance();
		int examday_year = 2022;
		int examday_month =11;
		int examday_data = 17;
		
		 
		examday.set(examday_year,examday_month-1,examday_data);
		System.out.println(examday.toString());
		
		Calendar today= Calendar.getInstance();
		System.out.println(today);
		
		long evemtday = examday.getTimeInMillis();
			long nowday= today.getTimeInMillis();
		System.out.println("evemtday : "+evemtday);
		System.out.println("nowday : "+nowday);
		
		long endday = (evemtday-nowday)/(60*60*24*1000);
		System.out.println("남은 일 : "+endday);
		System.out.println(60*60*24*1000);

	}

}
