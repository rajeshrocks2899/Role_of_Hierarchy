import java.util.HashMap;

public class UsersManager {

	private User user;
	private Role role;
	static HashMap<String,String>USERS= new HashMap<String,String>();
	static UsersManager users= new UsersManager();
	
	public void setUser(User user) {
		this.user=user;
	}
	
	public void setRole(Role role) {
		this.role=role;
	}

	public static UsersManager getUsersManager() {
		return users;
	}
	
	public void addUsers(String role ,String userName) {
		USERS.put(role,userName);
	}
	
	public HashMap<String,String> getUser() {
		return USERS;
	}
	
	public boolean searchName(String name) {
		if(USERS.containsValue(name)==true) {
			return true;
		}else
			return false;
	}
	
	
	
}
