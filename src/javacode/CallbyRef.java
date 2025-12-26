package javacode;

public class CallbyRef {

	int age;
	String name;
	
	public static void getinfo(CallbyRef g1) {
		System.out.println(g1.age);
		System.out.println(g1.name);
		g1.age=30;
		g1.name="kumar";
		System.out.println(g1.age);
		System.out.println(g1.name);
	}
		public static void main(String[] args) {
		CallbyRef c1=new CallbyRef();
		c1.age=28;
		c1.name="Ranjith";
		getinfo(c1);
		System.out.println(c1.age);
		System.out.println(c1.name);

	}

}
