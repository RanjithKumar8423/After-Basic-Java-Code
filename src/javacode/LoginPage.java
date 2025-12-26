package javacode;

public class LoginPage {
	
	String username;
	int password;
	 public LoginPage(String username, int password) {
		 this.username=username;
		 this.password=password;
	 }
	 public LoginPage() {
		 username="Admin303";
		 password=4949;
	 }
	 
	 public void doLogin() {
		 System.out.println("username is"+username);
		 System.out.println("password is  "+password);
		 System.out.println("click Login button");
		 System.out.println("user logged in");
	 }
	

}
