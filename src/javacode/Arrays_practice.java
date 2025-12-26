package javacode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Arrays_practice {

	public static void main(String[] args) {
		
		/*
		 * int i[]=new int[3]; i[0]=10; i[1]=20; i[2]=30;
		 */
		
//		System.out.println(i[0]);
//		System.out.println(Array.getLength(i));
//		System.out.println(Arrays.toString(i));
		
		/*
		 * for(int k=0; k<=i.length-1; k++) { System.out.println(i[k]); if(i[k]==10) {
		 * System.out.println("Hi"); } }
		 */
	
	Object i1[]=new Object[4];
	i1[0]=1;
	i1[1]=27.3;
	i1[2]="Ranjith";
	i1[3]=true;
	
	System.out.println(Arrays.toString(i1));
	
	/*
	 * for(int k=0; k<=i1.length-1; k++) { System.out.println(i1[k]);
	 * 
	 * }
	 */
	
	
	}
	

}
