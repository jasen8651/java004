package ncs.test01;

public class main {

	public static void main(String[] args) {
		//2차원 배열에 들어 있는 데이터들의 합계와 평균을 구한다
		
		int [][] array = {{12, 41, 36, 56, 21}, {82, 10, 12, 61, 45}, {14, 16, 18, 78, 65}, {45, 26, 72, 23, 34}};
		
		double sum=0;
		double avg =0;
		
		int avg_su=0;
		
		for(int i=0; i<array.length; i++) {
			for(int j=0; j<array[i].length; j++) {
				sum+=array[i][j];
				avg_su+=1;
			}
		}
		avg= sum/avg_su;
		
		System.out.println("합계"+sum);
		System.out.println("평균"+avg);

	}

}
