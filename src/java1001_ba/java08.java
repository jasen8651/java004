package java1001_ba;

public class java08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * int a =3; int b=4;
		 * 
		 * System.out.println(a+b);//산술연산자 System.out.println(a+"는 3이다");//문자열 연결
		 * System.out.println("a"+a); System.out.println("결과="+(a+b));// 7
		 * System.out.println();
		 
		int x= 3;
		//증강 연산자, 전위 연산자
		++x; // x= x+1
		System.out.println(x);//4
		x++; 
		System.out.println(x);
		System.out.println("-----------------------------------------");
		int y=5;
		//후위 연산자,
		y++; 
		System.out.println(y);
		y--; 
		System.out.println(y);
		System.out.println("-----------------------------------------");
		
		//상수 : 한번만 기억할수있는 메모리 공간, 증강연산자 사용 불가
		final int num=4;
		//num++;
		*/
		int j=5;
		int i = 0;
		  j= ++i;
		System.out.printf("i=%d, j=%d\n",j,i);
		
		i=5;
		j=0;
		
		j=i++;
		System.out.printf("i=%d, j=%d\n",j,i);
		
		
		
	}

}
