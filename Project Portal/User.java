import java.lang.*;

public class User{
	String name;
	String password;
	String ID;
	String dept;
	
	public User(String name, String password, String ID,String dept){
		this.name = name;
		this.password = password;
		this.ID = ID;
		this.dept = dept;
	}
	public String getName(){
		return name;
	}
	public String getPassword(){
		return password;
	}
	public String getID(){
		return ID;
	}
	public String getDept(){
		return dept;
	}

}