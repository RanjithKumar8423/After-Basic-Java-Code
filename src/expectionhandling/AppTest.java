package expectionhandling;

public class AppTest {

	public static void main(String[] args) {
	
		String browser="  ui";
		 if (browser.trim().equals("chrome")) {
			System.out.println("chrome launched");
		} 
		 else if(browser.equals("safari")) {
			System.out.println("safari launched");
		}
		 else {
			 System.out.println("please pass Right browser");
			 throw new MyExpection("BROWSERNOTFOUND");
		 }
		 System.out.println("pls proced with URL");
	}}
