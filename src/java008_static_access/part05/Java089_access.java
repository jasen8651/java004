package java008_static_access.part05;

import java008_static_access.part04.Java087_access;

// import : 다른 곳의 패키지를 가져올 때 클래스 위치를 잡아줘야 한다. 중복 사용이 가능하며 패키지 선언 후 작성해줘야 한다.
/*
 * 클래스 관계
 * 1. has a : 포함 관계
 * 2. is a : 상속 관계
 */
public class Java089_access extends Java087_access {
// extends : 상속. 다른 클래스의 정보를 상속시켜준다.

	public static void main(String[] args) {
		// Java087_access p = new Java087_access();
		Java089_access p = new Java089_access();
		// System.out.printf("var_private : %d\n", p.var_private);
		// System.out.printf("var_default : %d \n", p.var_default);
		System.out.printf("var_proteted : %d \n", p.var_protected);
		System.out.printf("var_public : %d \n", p.var_public);
	}

}
