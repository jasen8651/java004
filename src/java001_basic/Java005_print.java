package java001_basic;

public class Java005_print {
	public static void main(String[] args) {
		long bNum = 2;
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L; // L or l
		float fNum = 2.5F; // F or f
		double dNum = 7.4;
		char cData = 'a'; // 문자는 하나만 저장 가능하다. 홑따옴표를 이용한다.
		boolean eNum = true;
		String sData = "j"; // 문자열은 쌍따옴표를 이용한다.
		System.out.println(bNum + "," + sNum); // 2,4 : 문자열이 앞 뒤로 존재하면 '+' 연산자는 문자열 연산자로 인식된다.
		System.out.println(bNum + sNum); // 6 : 문자열이 앞 뒤로 존재하지 않다면 '+' 연산자는 산술 연산자로 인식된다.
		
		/*
		 * System.out.printf()으로 어떤 형식의 문자열을 출력할 수 있습니다.
		 * 
		 * System.out.printf("출력형식", 값1, 값2, 값...)
		 * 출력기호
		 * %d : 정수(byte, short, int, long)
		 * %f : 실수(float, double)
		 * %b : 논리(boolean)
		 * %c : 문자(char)
		 * %s : 문자열(String)
		 * %% : %
		 * \n : 줄바꿈
		 * \t : 탭
		 */
		System.out.printf("%d %d %d %d %f %f %b %c %s \n",bNum, sNum, xNum, lNum, fNum, dNum, eNum, cData, sData);
		System.out.printf("%d %% %d = %d \n", 5, 2, (5%2));
		
		/*
		 * println() : 출력 후 자동 줄바꿈 
		 * print() : 값을 출력
		 */
		
		System.out.print("java");
		System.out.print("program");
		System.out.println();
		System.out.println("jsp");
		System.out.println("test");
		
		// 변수를 선언하기 전에 무조건 데이터 타입을 입력해야 한다.
		// 값의 데이터 타입과 변수의 데이터 타입을 일치 시켜야 한다. 다르다면 형변환(casting)을 해줘야 한다.
	}

}
