package javacode;

public class Method_overLoading {

	
	public void login(String username) {
		System.out.println("Logged-in the Application only via username: "+username);
	}
	public void login(String username, int pwd) {
		System.out.println("Logged-in the Application  via username and password:  "+username+" & "+pwd);
	}
	public void login( int pwd, String username) {
		System.out.println("Logged-in the Application  via password and username: "+pwd+" & "+username);
			}
	
	public static void login1 (String user ) {
		System.out.println("user name");
		
	}
	public static void main(String[] args) {
		
		Method_overLoading m1=new Method_overLoading();
		m1.login("ranjithkumar");
		m1.login("raju234", 494994);
		Method_overLoading.login1("4pool");
	}

}
