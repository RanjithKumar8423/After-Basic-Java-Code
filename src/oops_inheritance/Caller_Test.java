package oops_inheritance;

public class Caller_Test {

	public static void main(String[] args) {
		
		Bmw b1=new Bmw();
		b1.engine();//inheritance
		b1.theaftsafety();//individual
		b1.start();//override
		b1.stop();//inheritance
		b1.refuel();//inheritance
		//System.out.println(b.maxSpeed);
		
		System.out.println("-------------------");
		Car c1=new Car();
		c1.stop();//individual
		c1.strat();//individual
		c1.refuel();//individual
		c1.engine();//inheritance
		
		System.out.println("-------------------");
		Hond h1=new Hond();
		h1.stop();//inheritance
		h1.refuel();//inheritance
		h1.fuelEff();//individual
		h1.strat();//override
		System.out.println("-------------------");
		Car cr=new Hond();
		cr.refuel();
		cr.strat();
		cr.stop();
		
		System.out.println("-------------------");
		Vehicles v1 = new Hond();
		v1.engine();
		
	}

}
