package ncs.test07;

public class Student extends Human{
	String major;
	String number;
	
	public Student() {
	super();
	}
	
	public Student(String name, int age, int heught, int wight, String number, String major) {
		super(name, age, heught, wight);
		this.major = major;
		this.number = number;
	}
	
	public String toString() {
		return super.toString()+name+" "+major;
	}
	
}
