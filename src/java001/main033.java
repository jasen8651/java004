package java001;



public class main033 {

	public static void main(String[] args) {
		/*
		 * 홍길도 : 30
		 * 이영의 : 25
		 */
		main033_033 p1 = new main033_033("홍길동",30);
		main033_033 p2 = new main033_033("이영희",20);
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		
		main033_033[] ps = new main033_033[2];
		ps[0] = new main033_033("홍길동",30);
		ps[1] = new main033_033("이영희",20);
		for(main033_033 pn : ps) {
			System.out.println(pn.toString());
		}
	}

}
