package java009_inheritance.part05;
// import java.lang.Override;
// import java.lang.System;
// import java.lang.String;

public class Second extends First {
	int b = 20;
	
	@Override // 오버라이딩 했다는 표시. 메서드명이 다르게 입력되면 알려준다.
	void display() {
		System.out.println("b=" + b);
	}
	
	void superThisMethod() {
		super.display();
		this.display();
	}
	
	@Override
	public String toString() {
		return String.format("b=%d",b);
	}
}
