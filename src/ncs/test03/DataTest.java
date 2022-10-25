package ncs.test03;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DataTest {

	public static void main(String[] args) {
		

			Calendar cal = Calendar.getInstance();
			
			long today_day = cal.getTimeInMillis();
			int day = cal.get(Calendar.DAY_OF_WEEK);
			char[] weekdays = {'일','월','화','수','목','금','토'};
			
			cal.set(1999, 1-1, 12);
			
			long birth_day = cal.getTimeInMillis();
			
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월	dd일");
			
			String today = sdf.format(today_day);
			String birthday = sdf.format(birth_day);
			System.out.println("생일 : "+ birthday+ " "+weekdays[day-1]+"요일");
			System.out.println("현재 : "+today);
			System.out.printf("나이 : %d세",(2022-cal.getWeekYear()-1));
	}
	
	

}
