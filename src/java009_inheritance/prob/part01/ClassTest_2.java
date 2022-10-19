package java009_inheritance.prob.part01;

public class ClassTest_2 extends ClassTest_1 {
	String department;

	public ClassTest_2() {

	}

	public ClassTest_2(String name, int salary, String department) {
		super(name, salary);
		this.department = department;
	}

	public void getInformation() {
		System.out.printf("이름:%s 연봉:%d 부서:%s \n", getName(), getSalary(), department);
	}

	public void prn() {
		System.out.println("서브클래스");
	}

	public void callSuperThis() {
		super.prn();
		this.prn();
	}
}
