package javacode;

import java.util.ArrayList;
import java.util.Arrays;

public class Functions_Methods {

	//function with no input and no return
//	public void test() {
//		System.out.println("test auto");
//	}
	
	//function with  input and no return
//	    public void test(int x, int y) {
//		int a=x+y+10;
//	    System.out.println(a);
//	    }
	 
	//function with  input and  return
//	public int sum(int a, int b) {
//		System.out.println("Adding sum of values");
//		int sum=a+b+10;
//		return sum;
//	}
	
//	public String billinfo() {
//		System.out.println("welcome to Tej Hotel");
//		String name="Ranjith";
//		return name;
//	}
//	public Boolean isappexists() {
//		return true;
//	}
	
//	public String[] devicelist() {
//		System.out.println("welcome device List");
//		String devices[] = {"macBook","ipad","THinkpad"};
//		return devices;
//	}
	public ArrayList<String> std() {
		System.out.println("welcome to school");
		ArrayList<String> a1=new ArrayList<String>(Arrays.asList("Ranjith ","kumar ","N"));
		a1.add("XXX");
		return a1;
	}
	
	
	public static void main(String[] args) {
		
		Functions_Methods a1=new Functions_Methods();
//		a1.test();
//		a1.test(50,40);
//		int k=a1.sum(30, 60);
//		System.out.println(k);
//		String client=a1.billinfo();
//		Boolean a2=a1.isappexists();
//		if (a2) {
//			System.out.println("Yes app is there");
//		}
//		String[] a2 = a1.devicelist();
//		System.out.println(Arrays.toString(a2));
		
		ArrayList<String> a2=a1.std();
		System.out.println(a2);

	}

}
