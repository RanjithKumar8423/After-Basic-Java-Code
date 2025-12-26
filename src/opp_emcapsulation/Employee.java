package opp_emcapsulation;

public class Employee {

	private String name;
	private int age;
	private double salary;
	private char gender;
	
	public String getname() {
		return this.name;
	}
	public void setname(String name) {
		this.name=name;
		
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public Employee(String name, int age, double salary, char gender) {
		this.name = name;
		this.age = age;
		this.salary = salary;
		this.gender = gender;
	}
	
	
		

	}


