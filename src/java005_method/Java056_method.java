package java005_method;

/*
 * 자바 가상 머신 메모리 구조
 * Method Area(클래스, 상수, 변수, 메소드코드, 생성자코드),  Stack Area,  Heap Area
 */
public class Java056_method {
	
	public static void main(String[] args) {
		int a = 10, b = 20;
		int c = a, d = b; // 값에 의한 복사(call by value)
		
		// c, d 변수의 값을 교환
		int temp = c; // temp에 c값 저장
		c = d; // c에 d값 저장
		d = temp; // d에 temp값 저장
		
		System.out.printf("a=%d, b=%d \n", a, b);
		System.out.printf("c=%d, d=%d \n", c, d );

		System.out.println("=====================");
		
		int[] num = new int[] {10,20}; // 참조 데이터 타입 : 배열 >> 메모리에서 주소값으로 저장이 된다.
		int[] arr = num; // 주소에 의한 복사(call by reference). 메모리에서 주소값을 복사한다.
		// arr[0], arr[1] 값을 교환
		int imsi = arr[0];
		arr[0] = arr[1];
		arr[1] = imsi;
		// arr값을 교환하였더니 num값도 같이 바뀌었다.
		System.out.printf("num[0]=%d, num[1]=%d \n", num[0], num[1]); // num[0]=20, num[1]=10 
		System.out.printf("arr[0]=%d, arr[1]=%d \n", arr[0], arr[1]); // arr[0]=20, arr[1]=10 
		 
				
	} // end main()
} // end class
