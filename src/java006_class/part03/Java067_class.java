package java006_class.part03;

public class Java067_class {

	public static void main(String[] args) {
		Rect r1 = new Rect();
		r1.width = 5;
		r1.height = 3;
		r1.color = "레드";
		
		Rect r2 = new Rect();
		r2.width = 7;
		r2.height = 4;
		r2.color = "블루";
		
		r1.display();
		System.out.println();
		r2.display();
		
	}

}
