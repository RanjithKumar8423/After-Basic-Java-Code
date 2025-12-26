package abstraction;

public class TestPage {

	public static void main(String[] args) {
		
		PageLogin p1=new PageLogin();
		p1.dologin("ranjith", 399);
		p1.title();
		p1.url();
		PageLogin.displayLogo();
		p1.footers();

	}

}
