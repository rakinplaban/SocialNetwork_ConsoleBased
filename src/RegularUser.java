import java.util.ArrayList;

public class RegularUser extends User {
	
	public RegularUser(String username, String Ppassword) {
		super(username, Ppassword);
		// TODO Auto-generated constructor stub
	}


	@Override
	public void displayProfile() {
		// TODO Auto-generated method stub
		System.out.println(username);
	}
	
	public void addPost(String post) {
		ArrayList<String> postlist = new ArrayList<String>();
		postlist.add(post);
		
		for(String post_item : postlist) {
			System.out.println(post_item);
		}
	}

}
