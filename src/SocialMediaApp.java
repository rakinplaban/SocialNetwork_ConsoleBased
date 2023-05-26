import java.util.ArrayList;

public class SocialMediaApp {
	
	ArrayList<User> user_ob = new ArrayList<User>();
	
	public void addUser(User user_) {
		user_ob.add(user_);
	}
	
	public void removeUser(User user_) {
		user_ob.remove(user_);
	}

	public void displayAllUsers() {
		for(User user: user_ob) {
			System.out.println(user.username);
		}
	}
	
	public void displayUserPosts(String username) {
		RegularUser u = new RegularUser(username, username);
		u.displayPost();
	}
}
