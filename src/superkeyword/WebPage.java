package superkeyword;

public class WebPage extends Page {

	public int speed=20;
	
	public WebPage() {
		System.out.println("Webpage ---Default constructor");
	}
	public WebPage(int i) {
		System.out.println("Webpage --- constructor"+i);
	}
	
	public void calculationTime() {
		System.out.println("Webpage--calculationTime");
	}
	public final void logo() {
		System.out.println("webpage--logo");
	}
	public static void billing() {
		System.out.println("Webpage---billing");
	}
	@Override
	public void pagePanel() {
		System.out.println("webpage--pagepanel");
		
		
	}
	
}
