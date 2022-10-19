package java012_api;

public class Java116_String {

	public static void main(String[] args) {
		// heap area에서 같은 주소의 "java"를 가르킨다
		String sn = "java";
		String sg = "java";

		String st = new String("java");
		String ss = new String("java");

		// 주소비교
		System.out.printf("sn==sg : %b \n", sn == sg); // true
		System.out.printf("st==ss : %b \n", st == ss); // false
		
		// 메모리에 저장된 문자열 비교
		System.out.printf("sn.equals(sg) : %b \n",sn.equals(sg)); // true
		System.out.printf("st.equals(ss) : %b \n", st.equals(ss)); // ture
		// equalsIgnoreCase() : 대소문자 비교를 안한다.
		// equals() : 대소문자 비교를 한다.
		
		// 메모리에 저장된 문자열 리턴
		System.out.println(sn.toString());
		System.out.println(sn);

	}

}
