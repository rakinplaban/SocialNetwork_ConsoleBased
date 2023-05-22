import java.util.ArrayList;

public class SocialMediaApp {
	
	ArrayList<User> user_ob = new ArrayList<User>();
	
	public void addUser(User user_) {
		user_ob.add(user_);
	}
	
	public void removeUser(User user_) {
		user_ob.remove(user_);
	}

	
}
