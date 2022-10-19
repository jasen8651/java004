package java009_inheritance.prob.part02;

public class StudentExam extends Human {
	String num;

	public StudentExam() {

	}

	public StudentExam(String name, int age, int height, int width, String num) {
		super(name, age, height, width);
		this.num = num;
	}

	@Override
	public String toString() {
		String data = name + "\t" + age + "\t" + height + "\t" + weight + "\t" + num;
		return data;
	}

}
