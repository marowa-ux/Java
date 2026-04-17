import java.lang.*;

public class Users{
	User userList[] = new User[100];
	static int userCount = 0;
	
	public Users(){
		User u1 = new User("Marowa","1234","2222222","CSE");
		User u2 = new User("Tisha","1234","5954545","EEE");
		userList[userCount]=u1; userCount++;
		userList[userCount]=u2; userCount++;
	}
	public int userExists(String id){
		int index = -1;
		for(int i=0;i<userCount;i++){
			if(userList[i].getID().equals(id)){
				index = i;
				break;
			}
		}
		return index;
	}
	public void addUser(User u){
		userList[userCount]=u;
		userCount++;
	}
	public User getUser(int index,String pass){
		if((userList[index].getPassword().equals(pass))){
			return userList[index];
		}else{return null;}
	}
	
}