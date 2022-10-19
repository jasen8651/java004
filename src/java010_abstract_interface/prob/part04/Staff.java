package java010_abstract_interface.prob.part04;

public class Staff extends Person {

	public Staff(String name, String jumin) {
		super(name, jumin);
	}

	@Override
	public char gender() {
		// 주민번호를 이용해서 성별을 구한후 반환하는 로직을 구현하세요.
		// String jumin="890426-1056214";
		// char data=jumin.charAt(0);
		char data = getJumin().charAt(6);
		if (data == '1' || data == '3') {
			return '남';
		} else {
			return '여';
		}
	}

	@Override
	public int getYear() {
		// 주민번호를 이용한 년도4자리를 구한후 반환하는 로직을 구현하세요.
		// String jumin="890426-1056214";
		// String year=jumsin.substring(0,2); =>"89"
		// 1,2 => 19+year 3,4=>20+year
		// if(jumin.charAt(7)=='1')
		// int num=Integer.parseInt(year);
		int num;
		String year = getJumin().substring(0, 2);
		if (getJumin().charAt(6) == '1' || getJumin().charAt(6) == '2') {
			num = Integer.parseInt(19 + year);
			return num;
		} else {
			num = Integer.parseInt(20 + year);
			return num;
		}
	}

	@Override
	public int getMonth() {
		return Integer.parseInt(getJumin().substring(2, 4));
	}

	@Override
	public int getDATE() {
		return Integer.parseInt(getJumin().substring(4, 6));
	}

}// end Staff
