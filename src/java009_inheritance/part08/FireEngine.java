package java009_inheritance.part08;

public class FireEngine extends Car {
	private long water;

	public FireEngine() {

	}

	public void setWater(long water) {
		this.water = water;
	}

	void waterSperad() {
		System.out.println(water + "량의 물을 뿌린다.");
	}
	
}
