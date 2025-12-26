package oops_inheritance;

public class Hond extends Car {
	
	
	@Override
	public void strat() {
		System.out.println("Honda -- start");
	}

	public void fuelEff() {
		System.out.println("Honda -- fuel eff");
	}

	public void parking() {
		Bmw b = new Bmw();
		b.theaftsafety();//Composition
	}
	

}
