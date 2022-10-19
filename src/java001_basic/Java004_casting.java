package java001_basic;
/*
 * 윈도우 + shift + s : 캡쳐
 * Ctrl + F11 : 출력
 * Ctrl + Spacebar : 자동완성
 * Ctrl + / : 한개의 라인 주석 설정 및 해제
 * Ctrl + Shift + / : 여러 라인 주석 설정
 * Ctrl + Shift + \ : 여러 라인 주석 해제
 * Ctrl + Shift + F : 자동 정렬 (Window > Preference > General - Keys - ctrl+shift+F를 ctrl+F로 변경)
 * Ctrl + Alt + up/down : 한 줄 복사
 */

public class Java004_casting {
	public static void main(String[] args) {
		// 1byte = 8bit (1byte의 범위 : -128 ~ 127)
		long bNum = 2;
		short sNum = 4;
		int xNum = 5;
		long lNum = 6L; // L or l
		float fNum = 2.5F; // F or f
		double dNum = 7.4;
		char cData = 'a'; // 문자는 하나만 저장 가능하다. 홑따옴표를 이용한다.
		boolean eNum = true; // true or false

		System.out.println(lNum);
		System.out.println(fNum);

		// 형변환(casting)
		// 묵시적 형변환 : 작은 데이터 타입을 큰 데이터 타입으로 변환할 때 발생
		// 명시적 형변환 : 큰 데이터 타입을 작은 데이터 타입으로 변환할 때 발생

		long gNum = 6; // 묵시적 형변환 : int => long 자동으로 큰 데이터 타입으로 형변환이 일어난다.
		System.out.println(gNum);

		float tNum = (float) 2.5; // 명시적 형변환 : double => float 할당한 값에 casting타입을 명시해 줘야한다.
		System.out.println(tNum);

		// 데이터 손실이 발생되는 경우
		byte data = (byte) 128;
		System.out.println(data); // -128

	} // end main()

} // end class
