package oops_inheritance;

public class Car extends Vehicles {
	
	
	
    int maxSpeed = 100;
	
	static int price = 1000;
	
	final static int minSpeed = 10;
	
	@Override
	public void strat() {
		System.out.println("car---strat");
	}
	@Override
	public void stop() {
		System.out.println("car---stop");
	}
	
	public void refuel() {
		System.out.println("car--refuel");
	}
	public static void carDisplay() {
		System.out.println("Car -- display");
	}
	private void show() {
		System.out.println("car --- show");
	}
}
