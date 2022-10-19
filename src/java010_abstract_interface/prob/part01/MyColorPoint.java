package java010_abstract_interface.prob.part01;

public class MyColorPoint extends MyPoint {
	String name;
	int a;

	public MyColorPoint() {

	}

	@Override
	protected void move(int x, int y) {

	}

	@Override
	protected void reverse() {
		a = x;
		x = y;
		y = a;

	}

	public MyColorPoint(int x, int y, String name) {
		super(x, y);
		this.name = name;
	}

	@Override
	protected void show() {
		System.out.println(x + "," + y + "," + name);
	}

}
