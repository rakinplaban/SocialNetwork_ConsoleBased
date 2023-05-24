import java.util.*;
import java.io.*;
import java.lang.*;

public class Main {
	public static void main(String[] args) {
		/* 
		 	Add users to the social media application using the "addUser(user: User)" method
			Remove users from the social media application using the "removeUser(user: User)" method
			Display the profile information of all users using the "displayAllUsers()" method
			Add posts to regular user accounts using the "addPost(post: String)" method
			Display the posts of a specific user using the "displayUserPosts(username: String)" method
			Like and unlike posts using the methods from the "Likeable" interface
		*/
		
		SocialMediaApp my_app = new SocialMediaApp();
		Scanner input = new Scanner(System.in);
//		String username = input.nextLine();
//		String password = input.nextLine();
//		RegularUser user = new RegularUser(username,password);
		
		System.out.println("Please, choose an option");
		System.out.print("1--- For adding new user.\n"
				+ "2--- For romoving a user.\n"+
				"3--- Display the profile information of all users.\n"+
				"4--- Add posts to regular user accounts\n"+"5--- Display the posts of a specific user.\n"+
				"6--- Like posts.\n"+"7--- Unlike posts.\n"+"Any key to terminate.\n");
		
		int choice = input.nextInt();
		while(true) {
			switch(choice) {
			case 1:
				String username = input.nextLine();
				String password = input.nextLine();
				User user = new RegularUser(username,password);
				my_app.addUser(user);
			}
		}
		
		
		
	}
}
