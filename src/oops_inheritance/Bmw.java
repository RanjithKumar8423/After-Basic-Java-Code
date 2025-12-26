package oops_inheritance;

public class Bmw extends Car{
	
	
	public void start() {
		System.out.println("BMW---super fast start");
	}
	
	public void theaftsafety() {
		System.out.println("BWM--theaftsafety");
	}
	

	// static method can not be overridden
	// method hiding
	public static void carDisplay() {
		System.out.println("BMW -- display");
	}

	// private method can not be overridden
	private void show() {
		System.out.println("BMW --- show");
	}

}
