package java006_class.prob;

public class Prob02 {
	String title;
	String author;

	void display() {
		System.out.println(title + " " + author);
	}

	Prob02() {
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	Prob02 (String title){
		this(title,"작자미상");
	}
	
	Prob02 (String title, String author){
		this.title = title;
		this.author = author;			
		
	}

}
