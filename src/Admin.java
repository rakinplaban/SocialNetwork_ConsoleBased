
public class Admin extends User{
	private String role;
	public Admin(String username, String Ppassword, String role) {
		super(username, Ppassword);
		this.role = role;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void displayProfile() {
		// TODO Auto-generated method stub
		System.out.println(username+" "+role);
	}
	
}
