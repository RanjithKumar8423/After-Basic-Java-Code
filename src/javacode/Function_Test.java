package javacode;

import java.util.ArrayList;

public class Function_Test {

	
//	public Boolean launchbrowser(String browsername) {
//		System.out.println("Given Browser is:  "+ browsername);
//		
//		switch (browsername.toLowerCase().trim()) {
//		case "internet explore": 
//			System.out.println("IE has been launched");
//			return true;
//		case "chrome": 
//			System.out.println("chrome has been launched");
//			return true;
//		default:
//			System.out.println("pls give right browser  "+browsername);
//			return false;
//		}
//	}
//	public int studentmarks(String studentname) {
//		System.out.println("Student name is:  "+studentname);
//		
//		switch(studentname.toLowerCase().trim()) {
//		case "ranjith" :
//			return 92;
//			
//		case "ravi":
//			return 40;
//		case "som" :
//			return 29;
//		default:
//			System.out.println("given student not there Oops something went wrong  "+studentname);
//			return -1;
//		}
//		
		
	//}
	
	public ArrayList<String> product(String username) {
		System.out.println("Nice to have these product:  "+username);
		ArrayList<String> pro= new ArrayList<String>();
		switch (username.toLowerCase().trim()) {
		case "ranjith":
			pro.add("Mac Book");
			pro.add("Ipad");
			pro.add("think pad");
			break;
		
		case "usha":
			pro.add("Mobile");
			pro.add("tab");
			break;
			
		case "lala":
			pro.add("Jio SIM");
		
		}
		return pro;
	}
	
	
	
	
	

	public static void main(String[] args) {
		Function_Test b1=new Function_Test();
//		Boolean url = browser.launchbrowser("chroe   ");
//		if (url) {
//			System.out.println("pls proced with Enter URL");
//		}
//		
//		int marks=b1.studentmarks("soma");
//		System.out.println("Obtained marks is:  "+marks);
//		if(marks>90) {
//			System.out.println("contrats: you desered Distinction");
//		}
//		 else if (marks>39 && marks<60)  {
//			System.out.println("First class");
//		}
//		else {
//			System.out.println("Failed");
//		}
		
		ArrayList<String> a1 = b1.product("ranjith");
		System.out.println(a1);
		System.out.println(a1.size());
		
		

	}

}
