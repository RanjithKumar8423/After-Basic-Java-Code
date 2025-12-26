package javacode;

public class EcommApplication {

	
	public EcommApplication login(String username) {
		System.out.println("Logining via username"+ username);
		return this;
		
	}
    public EcommApplication login(String username, int password ) {
    	System.out.println("Logining via username and password  "+ username+password);
    	return this;
	}
    public EcommApplication login(String username, int password, int otp) {
    	System.out.println("Logining via username and password and OPT    "+ username+password+otp);
    	return this;
    }
    public EcommApplication search(String name, double price) {
    	System.out.println("product  details  "+name+price);
    	return this;
    }
    public EcommApplication productid() {
    	System.out.println("product id is   "+444333);
    	return this;
    }
    public EcommApplication logout(double phonenumber) {
    	System.out.println("user loggedout  "+phonenumber);
    	return this;
    	
    }
    
	
	
	
}
