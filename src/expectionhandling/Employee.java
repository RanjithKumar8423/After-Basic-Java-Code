package expectionhandling;

public class Employee {

	
	public void m1() {
		System.out.println("these is m1");
		try {
		m2();
		}
		catch (ArithmeticException e) {
			System.out.println("throws Arithmetic Exception in m3");
			e.printStackTrace();
		}
	}
	public void m2()throws ArithmeticException {
		System.out.println("these is m2");
		m3();
	}
	public void m3() throws ArithmeticException {
		System.out.println("these is m3");
		int i=3/0;
	}
	
	public static void main(String[] args) {
		 Employee e1=new Employee();
		 e1.m1();

	}

}
