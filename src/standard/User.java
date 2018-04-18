package standard;

public class User {
	private String name;
	private String tel;
	private String email;
	private String gender;
	private int age;

	public User(){
		this.name = "";
		this.tel = "";
		this.email = "";
		this.gender = "";
		this.age = 0;
	}

	public User(String name, String tel, String email, String gender, int age){
		this.name = name;
		this.tel = tel;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}

	public String getGender(){
		return this.gender;
	}

//	public String toString(){
//		return this.name+":"+this.tel+":"+this.email+":"+this.gender+":"+Integer.toString(this.age);
//	}

}
