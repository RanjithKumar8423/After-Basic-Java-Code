package javacode;

public class LoginTest {

	public static void main(String[] args) {


		LoginPage l1=new LoginPage("ranjith3949", 404059);
		l1.doLogin();  //-->these point 1st object
		
		LoginPage l2=new LoginPage();
		l2.doLogin();// --->pointing 2nd object, if not decleared any variable means will give blank

	}

}
