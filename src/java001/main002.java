package java001;

import java.util.Calendar;

public class main002 {

	public static void main(String[] args) {
		// 캘린더
		//test tt= new Testexam();
		//test ts = test.getInstancet();
		//ts.prn();
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.toString());
		int year = cal.get(Calendar.YEAR);
		int month =cal.get(Calendar.MONTH)+1;
		int data = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute  = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		System.out.printf("%d-%d-%d    %d:%d:%d\n", year,month,data, hour, minute, second);
		
		System.out.println(cal.getActualMaximum(Calendar.DATE)); //마지막 일
		System.out.println(cal.get(Calendar.DAY_OF_WEEK));// //이번주 해당 숫자 (일1, 월2,화3,수4,목5,금6,토7
		
		cal.add(Calendar.DATE, -5);
		System.out.println(cal.toString());
		
		cal.set(Calendar.YEAR, 2020);
		System.out.println(cal.toString());
		
		cal.set(2017, 2, 1);
		System.out.println(cal.toString());
		
		
	}

}

	abstract class test {
		private static Testexam te = new Testexam();
		abstract public void prn();
		
		public static test getInstancet() {
			return te;
		}
}
	class Testexam extends test{
		@Override
		public void prn() {
			// TODO Auto-generated method stub
			
		}
	}