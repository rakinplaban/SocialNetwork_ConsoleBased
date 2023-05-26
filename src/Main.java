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
        System.out.print("Enter username : ");
        String username = input.nextLine();
        System.out.print("Enter password : ");
        String password = input.nextLine();
        User user = new RegularUser(username,password);
        System.out.print("Enter username : ");
        String username1 = input.nextLine();
        System.out.print("Enter password : ");
        String password1 = input.nextLine();
        User user2 = new RegularUser(username1,password1);
        my_app.addUser(user);
        System.out.println("User added successfully!");

        my_app.addUser(user2);
        System.out.println("User added successfully!");

        my_app.removeUser(user2);
        System.out.println("User "+username1+" removed!");

        System.out.println("404 user not found!");

        my_app.displayAllUsers();

        RegularUser ruser = new RegularUser(username,password);
        String post = input.nextLine();
        ruser.addPost(post);

        my_app.displayUserPosts(username);

        String post1 = input.nextLine();
        Post userpost = new Post(post1,0);

        userpost.like();
        System.out.println(userpost.likeCount());
        userpost.unlike();
        System.out.println(userpost.likeCount());
    }
}
