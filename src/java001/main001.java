package java001;

import java.text.SimpleDateFormat;



public class main001 {

	public static void main(String[] args) {
		// 깃허브 토큰 : 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
		
		//currentTimeMillis : 1970년 1월1일부터 초단위로 누적한 값을 밀리세컨드로 리턴
		//하루는 86400초 1초당 1000밀리세컨드
		long curr = System.currentTimeMillis();
		System.out.println(curr);
		
		String pattern = "yyyy-MM-dd  HH:mm:ss a EEE";
		SimpleDateFormat sdf = new SimpleDateFormat(pattern);
		String data = sdf.format(curr);
		System.out.println(data);
		
		
		
	}

}
