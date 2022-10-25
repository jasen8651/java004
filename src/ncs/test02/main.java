package ncs.test02;

public class main {

	public static void main(String[] args) {
		String str = "1.22,4.12,5.93,8.71,9.34";
		 double data[]= new double[5];
		 double sum = 0;
		 
		 String[] st = str.split(",");
		 int index=0;
		 for(String s : st) {
			 data[index] = Double.parseDouble(s);
			 sum += data[index++];
		 }
		 
		 System.out.println("합계 : "+sum);
		 System.out.println("평균 : "+(sum/st.length	));

	}
}
