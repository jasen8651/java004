package ncs.test08;

public class User {
	String id;
	String password;
	String name;
	int age;
	char gender;
	String Phon;
	
	
	public User() {
		super();
	}
	
	public User (String id, String password, String name, int age) {
		super();
		this.id= id;
		this.password=password;
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.Phon=Phon;
		
	}
	
	public int hasCode() {
		final int prime =31;
		int resut =1;
		resut =prime *resut+age;
		resut = prime * resut+gender;
		resut = prime*resut+((id==null)? 0: id.hashCode());
		return resut;
	}
	
}
