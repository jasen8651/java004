package java012_api;

import java.util.regex.Pattern;

/*
 * 아이디를 입력할 때 영문자, 숫자 조합으로 합니다. 최소 5자 이상 10자 이하까지만 가능합니다.
 * (반드시 영문자로 시작한다.)
 * 
 * [출력결과]
 * 로그인 되었습니다.
 * 회원이 아닙니다.
 * 
 * https://regexper.com/
 * 레귤러익스프레션 구동 확인 사이트
 */
public class Java128_RegEx {

	public static void main(String[] args) {
		System.out.print("ymy232");
		display(process("y23m1"));

		System.out.println("korea");
		display(process("korea"));
	} // end main()

	public static boolean process(String sn) {
		// 여기를 구현하세요.
		return sn.matches("[a-zA-Z][a-zA-Z0-9]{4,9}") && Pattern.compile("\\d").matcher(sn).find();
		// 첫글자가 영문인지, 그리고 그 다음부터 해서 4번째부터 9번째까지가 숫자&영문인지 확인 && 현재 문장에 숫자가 있는지 확인 후 리턴
	} // end process()

	public static void display(boolean res) {
		if (res) {
			System.out.println(" 로그인이 되었습니다.");
		} else {
			System.out.println(" 회원이 아닙니다.");
		}
	} // end display()
} // end class
