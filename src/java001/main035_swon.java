package java001;

public class main035_swon {
	private String name;
	private int one;
	private int two;
	private int three;
	
	public main035_swon() {
		// TODO Auto-generated constructor stub
	}

	public main035_swon(String name, int one, int two, int three) {
		super();
		this.name = name;
		this.one = one;
		this.two = two;
		this.three = three;
	}
	private int jumsiToatal() {
		return one+two+three;
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return String.format("%5s  %5s  %5d  %5d  %7d", name, one, two, three,jumsiToatal());
	}
}
