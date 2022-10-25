package ncs.test07;

public class StudentTest {

	public static void main(String[] args) {
		
		
		Student[] st = new Student[3];
		st[0] =  new Student("홍길순", 25, 171, 81, "201401", "영문학과");
		st[1] =  new Student("한사랑", 23, 183, 72, "201402", "건축학과");
		st[2] =  new Student("임꺽정", 26, 175, 65, "201403", "체육학과");
		
		for(int i=0; i<st.length; i++) {
			System.out.println(st[i]);
		}

	}

}
