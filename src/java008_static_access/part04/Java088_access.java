package java008_static_access.part04;

public class Java088_access {

	public static void main(String[] args) {
		Java087_access p = new Java087_access(); // 같은 패키지에서 클래스를 가져올때는 import를 해주지 않아도 된다.
		// System.out.printf("var_private : %d\n", p.var_private); // private는 접근할 수 없다.
		System.out.printf("var_default : %d \n", p.var_default);
		System.out.printf("var_proteted : %d \n", p.var_protected);
		System.out.printf("var_public : %d \n", p.var_public);
	}

}
