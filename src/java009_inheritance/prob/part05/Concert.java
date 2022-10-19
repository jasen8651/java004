package java009_inheritance.prob.part05;

public class Concert extends Artist {
	String concert;
	String seat;
	int price;
	
	public Concert(String artist, String enter, String concert, String seat, int price) {
		super(artist, enter);
		this.concert = concert;
		this.seat = seat;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%-10s %-10s %-10s %-10s %d ",artist, enter, concert, seat, price);
	}
	
	@Override
	public void prn() {
		System.out.printf("%s %s %s좌석의 가격은 %d원입니다. \n",artist, concert, seat, price);
	}
}
