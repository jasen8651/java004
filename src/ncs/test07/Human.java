package ncs.test07;

public class Human {
	String name;
	int age;
	int height;
	int wight;
	
	public Human() {
		super();
	}

	public Human(String name, int age, int height, int wight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.wight = wight;
	}

	
	@Override
	public String toString() {
		return name +" "+ age + " "+ height+ " "+ wight + " ";
	}
}
