package java001_basic;

// 키워드는 보라색, 식별자는 검은색
/*
 * 리터럴(literal) : 그 자체의 값(1, 2, 3, ...., 'a', 'b', 'c', ....., true, false)
 * 변수(variable) : 하나의 값을 저장하기 위한 메모리 공간
 * 자바에서 제공하는 데이터 타입
 * 1. Primitive Data Type(기본 데이터 타입)
 *	문자 - char(2byte)
 * 	숫자 - 정수 : byte(1byte), short(2byte), int(4byte), long(8byte)
 * 	    - 실수 : float(4byte), double(8byte)
 *  논리 - boolean(1byte) 	
 *  
 *  
 * 2. Reference Data Type(참조 데이터 타입)
 * 	Array, Class, Interface
 *  
 *  시스템에서 인식하는 데이터 타입 크기
 *  byte < char, short < int < long < float < double
 */

public class Java003_dataType {
	public static void main(String[] args) {

		// (1) 변수 선언/
		int data; // 데이터타입 변수명;

		// (2) 값을 할당
		data = 3; // data변수에 3값을 할당(저장)

		// (1) + (2) => int data = 3;
		System.out.println(data); // 3

		// data변수에 새로운 값 할당
		data = 10;
		System.out.println(data); // 10

		double avg = 4;
		// Type mismatch: cannot convert from double to int
		// int num = 4.0;

		// Type mismatch: cannot convert from float to long
		// long ko = 4.0F;

		int x = 0101;
		System.out.println(x); // 65 8진수

		int y = 65;
		System.out.println(y); // 65 10진수

		int z = 0B101;
		System.out.println(z); // 5 2진수 (0B101 == 0b101)

		int k = 0x101;
		System.out.println(k); // 257 16진수
	}

}
