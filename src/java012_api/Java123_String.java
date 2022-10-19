package java012_api;

/*
 * [출력결과]
 * 박상원님은 남성입니다.
 * 김연아님은 여성입니다.
 * 잘못입력하셨습니다.
 */
public class Java123_String {

	public static void main(String[] args) {
		String p1 = "박상원,561203-1597650";
		String p2 = "김연아,030628-4056892";
		String p3 = "정해인,900824-8052582";
		display(p1);
		display(p2);
		display(p3);

	} // end main()

	public static void display(String str) {
		// 여기를 구현하세요
		String[] data = str.split(",");
		char gen = data[1].charAt(7);
		if (gen == '1' || gen == '3')
			System.out.println(data[0] + "님은 남성입니다.");
		else if (gen == '2' || gen == '4')
			System.out.println(data[0] + "님은 여성입니다.");
		else
			System.out.println("잘못입력하셨습니다.");
	}

} // end class
