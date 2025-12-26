package abstraction;

public class PageLogin extends Page {

	@Override
	public void title() {
		System.out.println("page abs title");
		
	}

	@Override
	public void url() {
		System.out.println("page abs url");
		
	}
	
	public void dologin(String un, int pwd) {
		System.out.println("Do login "+un+" "+pwd);
	}

}
