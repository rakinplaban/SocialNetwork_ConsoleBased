
public abstract class User {
	protected String username;
	protected String password;
	
	public String getUserName(String username) throws NullFieldException{
		if(username == " ") {
			throw new NullFieldException("User name cannot be null");
		}
		else {
			return username;
		}
	}
	
	public User(String username, String password) {
		try {
			getUserName(username);
		} catch (NullFieldException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.username = username;
		this.password = password;
	}
	
	public abstract void displayProfile();
	
	
}
