package java008_static_access.part06;

public class MemberDAO {
	private static MemberDAO dao = new MemberDAO();
	
	private MemberDAO() {
		
	}
	
	public static MemberDAO getInstance() {
		return dao;
		// return new MemberDAO(); new를 줘서 새로운 주소를 생성하기에 singleton pattern이 적용되지 않는다.
	}
	
	public void display() {
		System.out.println("display");
	}
}
