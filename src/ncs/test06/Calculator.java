package ncs.test06;

public class Calculator {
	
	public double getsum(int data) {
		int sum=0;
		if(data <2 || data>5) {
			throw new InvalidException("입력값에 오류가 있다");
		}else {
			for(int i=1; i<data; i++) {
				sum+=i;
			}
		}
		return sum;
	}
}