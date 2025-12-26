package javacode;

public class Constructorconcept {

	int age;
	String name;
	double salary;
	boolean isactive;
	char gender;
	
	
	public Constructorconcept (int age, String name) {
		this.age=age;
		this.name=name;
		}
	
	public Constructorconcept(int age, String name, double salary, boolean isactive, char gender) {
		this.age = age;
		this.name = name;
		this.salary = salary;
		this.isactive = isactive;
		this.gender = gender;
	}

	public static void main(String[] args) {
	
		Constructorconcept c1=new Constructorconcept(26, "Ranjith");
		System.out.println(c1.age);
		System.out.println(c1.name);
		Constructorconcept c2=new Constructorconcept(26, "Ranjith kumar N",33.44,true,'m');
		System.out.println(c2.age+"  "+c2.name+"  "+c2.salary+"  "+c2.isactive+"  "+c2.gender);
	}

}
