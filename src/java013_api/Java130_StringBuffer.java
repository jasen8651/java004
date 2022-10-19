package java013_api;

public class Java130_StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("java test");
		
		// 4인덱스에 ",jsp문자열을 삽입
		sb.insert(4,",jsp"); // java,jsp test
		System.out.println(sb);
		
		// 4인덱스부터 8인덱스미만 사이의 문자열을 삭제
		sb.delete(4, 8); // java test
		System.out.println(sb);
		
		// 마지막에 문자열을 추가
		sb.append(" start"); // java test start
		System.out.println(sb);
		
		// 문자열을 반대로 변경
		sb.reverse(); // trats tset avaj
		System.out.println(sb);
		
		// String -> StringBuffer -> String 하는 작업 순서
		String data = "mybatis orm";
		StringBuffer sf = new StringBuffer(data);
		sf.reverse();
		System.out.println(sf); // mro sitabym
		System.out.println(data);
		String re = sf.toString(); // StringBuffer를 String값으로 바꿔줘야 한다.
		System.out.println(re); // 데이터 String type
		
		// char[] -> String -> StringBuffer
		char[] arr = {'k','o','r','e','a'};
		String sp = String.valueOf(arr);
		StringBuffer se = new StringBuffer(sp);
		// StringBuffer sr = new StringBuffer();
		// sr.append(sp);
		se.reverse();
		System.out.println(se); // aerok
		// 한 문장으로 축약하면 아래와 같다.
		System.out.println(new StringBuffer(String.valueOf(arr)).reverse());
		
		// StringBuffer -> String -> char[]
		String st = se.toString();
		char[] val = st.toCharArray();
		System.out.println(val);
		// 한 문장으로 축약하면 아래와 같다.
		System.out.println(se.toString().toCharArray());
	} // end main())

} // end class
