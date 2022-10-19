package java006_class.part01;

public class Java065_class {

	public static void main(String[] args) {
		Person ps; // 객체참조변수 선언 4바이트
		ps = new Person(); // 객체 생성 (생성자) 초기값을 주지 않으면 기본값을 가져온다. JVM 가동

		ps.name = "홍길동";
		ps.age = 30;
		ps.gender = '남';
		ps.develop();
		ps.run(100); // 값을 주게 되면 stack area에 지역변수로(ps.run) 100이 저장된다.

		System.out.printf("%s, %d, %c \n", ps.name, ps.age, ps.gender);
		
		System.out.println("==================");

		Person pn = new Person();
		pn.name = "김영희";
		pn.age = 28;
		pn.gender ='여';
		pn.develop();
		pn.run(200); // 값을 주게 되면 stack area에 지역변수로(pn.run) 200이 저장된다. 
		
		System.out.printf("%s, %d, %c \n", pn.name, pn.age, pn.gender);
		
		// 메인 메소드가 끝나면 메모리에서 모두 없어진다.
	} // end main()

} // end class
