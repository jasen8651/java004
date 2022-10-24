package java001;

public class main052 <T extends Number>{
	
	private T[] list;
	
	public main052() {
	
	}
	
	public main052(T[] list) {
		this.list = list;
	}
	
	public double findmain052() {
		double sum =0.0;
		for(T data : list) {
			sum += data.doubleValue();
			return sum/list.length;
		}
		return sum/list.length;
	}
	
}
