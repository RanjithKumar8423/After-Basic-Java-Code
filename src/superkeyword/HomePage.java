package superkeyword;

public class HomePage extends WebPage {

	public int speed=40;
	
	public HomePage() {
		System.out.println(super.speed);
		System.out.println("Homepage--default cnstructor");
	}
	public HomePage(int i) {
		super(i);
		System.out.println("Homepage-- cnstructor"+i);
	}
	
	public void test() {
		System.out.println("Homepage---test");
		pagePanel();
		billing();
		logo();
		}
	
	@Override
	public void calculationTime() {
		System.out.println("Homepage---calculationTime");
		super.calculationTime();
		this.test();
	}
	
	
}
