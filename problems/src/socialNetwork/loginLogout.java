package socialNetwork;

import java.util.*;

public class loginLogout {

	static Scanner sc=new Scanner(System.in);
	ArrayList<user> usersList=new ArrayList<user>();
	
	void getDetails() {
		System.out.println("------------------Social Network------------------");
		System.out.println("Enter a choice:");
		System.out.println("1.Signup");
		System.out.println("2.Login");
		System.out.println("3.Logout");
		System.out.println("4.Make friends");
		System.out.println("5.List the total no of online users");
		System.out.println("6.List the friends who are online");
		System.out.println("7.Exit");
		int ch=sc.nextInt();
		sc.nextLine();
		switch(ch) {
		    case 1:{
		    	   signUp();
		    	   getDetails();
		    }
			case 2:{
			      login();
			   	  getDetails();
			}
			case 3:{
				  logout();
				  getDetails();
			}
			case 4:{
				makeFriends();
				getDetails();
			}
			case 5:{
				  totalNoOfOnlineUsers();
				  getDetails();
			}
			case 6:{
				 friendsOnline();
				 getDetails();
			}
			case 7:{
				 return;
			}
			default:{
				 System.out.println("Enter a valid choice:");
				 getDetails();
			} 
		}
		
	}
	
	void signUp() {
		System.out.println("----------------------------Sign Up----------------------------");
		System.out.println("Enter your email address:");
		String email=sc.nextLine();
		System.out.println("Password:");
		String password=sc.nextLine();
		System.out.println("Confirm Password:");
		String confirmPassword=sc.nextLine();
		if(password.equals(confirmPassword)) {
			user u=new user(email,password);
			usersList.add(u);
			System.out.println("Account Successfully created.");
		}
		else {
			System.out.println("Password and Confirm Password doesn't match,Please enter correctly");
			signUp();
		}
	}
	void login() {
		System.out.println("----------------------------Login----------------------------");
		System.out.println("Enter your email address:");
		String email=sc.nextLine();
		System.out.println("Password:");
		String password=sc.nextLine();
		makeOnline(email,password);
		System.out.println("Login Successfully.");
	}
	
	void logout() {
		System.out.println("----------------------------Login----------------------------");
		System.out.println("Enter your email address:");
		String email=sc.nextLine();
		System.out.println("Password:");
		String password=sc.nextLine();
		makeOffline(email,password);
		System.out.println("Logout Successfully.");
	}
	
	void makeOffline(String email,String password) {
		for(user u:usersList) {
			if(u.email.equals(email) && u.password.equals(password)) {
				u.isOnline=false;
				break;
			}
		}
	}
	void makeOnline(String email,String password) {
		for(user u:usersList) {
			if(u.email.equals(email) && u.password.equals(password)) {
				u.isOnline=true;
				break;
			}
		}
	}
	
	 void totalNoOfOnlineUsers() {
		 int count=0;
		 for(user u:usersList) {
				if(u.isOnline==true) {
					
					count++;
				}
			}
		 System.out.println(count+" people are online now.");
	 }
	 
	 void  friendsOnline() {
		 System.out.println("Enter your email address:");
		 String email=sc.nextLine();
		 System.out.println("Password:");
		 String password=sc.nextLine();
		 listFriends(email,password);
		 
	 }
	 
	 void listFriends(String email,String password) {
		 for(user u:usersList) {
				if(u.email.equals(email) && u.password.equals(password)) {
					for(user p:u.friendsList) {
						if(p.isOnline==true) {
						System.out.println(p.email);
						}
					}
				}
			}
	 }
	 void makeFriends() {
		 System.out.println("Enter your email address:");
		 String email=sc.nextLine();
		 System.out.println("Password:");
		 String password=sc.nextLine();
		 listAll();
		 boolean yes=true;
		 while(yes){
		 System.out.println("Enter a person email to become friends");
		 String emailId=sc.nextLine();
		 for(user u:usersList) {
			 if(u.email.equals(email) && u.password.equals(password)) {
					for(user p:usersList) {
						if(p.email.equals(emailId)) {
							u.friendsList.add(p);
							break;
						}
					}
				}
		 }
		 System.out.println("Do you want to add one more as friend?(Y/N)");
		 char c=sc.next().charAt(0);
		 yes=c=='Y'?true:false;
	 }
		 
	 }
	
	 void listAll() {
		 for(user u:usersList) {
				System.out.println(u.email);
			}
	 }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        loginLogout lg=new loginLogout();
        lg.getDetails();
	}

}
