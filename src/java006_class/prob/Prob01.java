package java006_class.prob;

public class Prob01 {
	int x;
	String name;
	double pie = 3.14;

	double area() {
		return (double)((x * x) * pie);
	}

	void display() {
		System.out.printf("자바%s의 면적은 %.2f \n", name, area());
	}

}
