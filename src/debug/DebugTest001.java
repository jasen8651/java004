package debug;

public class DebugTest001 {

	public static void main(String[] args) {
		int sum =0;
		for(int i=0; i<5; i++){
			System.out.printf("i=%d\n",i);
			sum = sum + count(i);
		}
		System.out.printf("sum= %d\n",sum);
		
	}
	public static int count(int index) {
		int[] num = new int [] {1,5,2,3,4};
		return num[index];
	}

}
/*
 * 디버깅 종류 f11 
 * 출력문을 이용한 디버깅
 * 디버깅 툴을 이용한 디버깅
 * f6 한라인씩 실행
 */
	