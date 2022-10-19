package java012_api;

/*
 * 정규화 표현식(Regular Expression) regex
 * 1. 정규화 표현식(정규식)이란 텍스트 데이터 중에서 원하는 조건(패턴)과 일치하는 문자열을 찾아내기 위해 사용하는 것으로
 *    미리 정의된 기호와 문자를 이용해서 작성한 문자열을 말한다.
 */
public class Java124_RegEx {

	public static void main(String[] args) {
		String sn = "java korea";
		String sg = "";

		// a 또는 r 이면 '_'로 변경

		for (int i = 0; i < sn.length(); i++) {
			char data = sn.charAt(i);
			if (data == 'a' || data == 'r') {
				sg += "_";
			} else {
				sg += data;
			}
		}
		System.out.println(sg);
		
		System.out.println("Regular Expression을 이용한 문자 변경");
		System.out.println(sn.replaceAll("[ar]", "_")); // regex에서 [] 는 or이라는 뜻을 가진다.
		
		// sn변수에 저장된 문자열에서 a이거나 r이 포함되어 있으면 true or false를 리턴
		System.out.println(sn.matches(".*[ar].*")); 
		// matches는 boolean을 의미(true or false)
		// .은 임의의 문자 1개를 의미함. *는 0개 이상을 의미함(여러개)  .* : '임의의 문자 여러개' 라는 뜻 
		// [](대괄호) 없이 쓰면 맨 앞 글자와 맨 뒤 글자를 의미함
		
		// sn변수에 저장된 문자열에서 a이거나 r로 시작하면 true or false를 리턴
		System.out.println(sn.matches("[ar].*"));
		
		// sn변수에 저장된 문자열에서 a이거나 r로 끝나면 true or false를 리턴
		System.out.println(sn.matches(".*[ar]"));
		
		// {2,3} : 2개부터 3개까지의 공백을 "@"으로 변경한다.
		String st = "java    korea";
		String sa = st.replaceAll("\\s{2,3}", "@");
		System.out.println(sa);
		System.out.println(sa.length());
		// \s = 공백 \\(문자열로 인식시키기 위해 역슬래쉬를 2개 적어준다.)
		

	} // end main()

} // end class
