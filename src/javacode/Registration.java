package javacode;

public class Registration {

	String name;
	int tel;
	double pwd;
	
	public void userReg(String name, int tel, double pwd) {
		System.out.println("enter username  : " + name);
		System.out.println("enter phone  : " + tel);
		System.out.println("enter pwd  : " + pwd);
		this.name=name;  //--->here we defined global variable=local variable
		this.tel=tel;
		this.pwd=pwd;
	
	}
	public void getifo() {
		System.out.println(name+"  "+tel+"  "+pwd);//--->so here we accessing
	}
	
	public static void main(String[] args) {
		Registration r1=new Registration();
		r1.userReg("ranjith388", 388383, 7373454);
		r1.getifo();
		
		

	}

}
