package opp_emcapsulation;

public class Employee_Test {

	public static void main(String[] args) {
		
		
//		Employee e1=new Employee();
//		e1.setname("ranjith");
//		String actualname=e1.getname();
//		System.out.println(actualname);
//		
//		e1.setAge(28);
//		System.out.println(e1.getAge());
//		
//		e1.setGender('M');
//		System.out.println(e1.getGender());
		
		Employee e1=new Employee("Ranjith", 38, 10, 'M');
		System.out.println(e1.getAge()+"  "+ e1.getname()+ "  "+e1.getSalary()+"   "+e1.getGender());

	}

}
