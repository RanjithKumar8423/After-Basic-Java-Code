package opp_emcapsulation;

public class LoginPage {
	
	private String username;
	private int password;
	
	public LoginPage(String username, int password) {
		this.username=username;
		this.password=password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}
	
	public void doLogin(String username) {
		if (isValidUserName(username)) {
		System.out.println("user enters un: " + username);
		System.out.println("user enters pwd: " + password);
		System.out.println("user is logged in");
		}
	}
	
	private boolean isValidUserName(String username) {
		System.out.println("checking username valid or not");
		if (username.length()>=3) {
			System.out.println("username is valid");
			return true;
		}
		else {
			System.out.println("username not valid");
			return false;
		}
		
	}
	

}
