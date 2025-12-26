package javacode;

public class Switchcase {

	public static void main(String[] args) {
	
	String browser="    edge  ";
	
	switch(browser.toLowerCase().trim()) {
	
	case "chrome":
		System.out.println("these is chrome");
		break;
	case "edge":
		System.out.println("these is edge");
		break;
		
		default:
			System.out.println("no browser");
			break;
	}

	}

}
