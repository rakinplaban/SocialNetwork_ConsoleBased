
public abstract class User {
	protected String username;
	protected String password;
	
	public User(String username, String Ppassword) {
		this.username = username;
		this.password = password;
	}
	
	public abstract void displayProfile();
}
