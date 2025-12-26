package abstraction;

public abstract class  Page {
	
	
	
	public abstract void title();
	public abstract void url();
	
	public void pageLoadingpage() {
		System.out.println("page loading 10sec");
	}
	public  static void  displayLogo() {
		System.out.println("page--displaylogo");
	}
	public final void footers() {
		System.out.println("page final footers");
	}
	

}
