package javacode;

import java.util.Arrays;

public class Arrays_literal {

	public static void main(String[] args) {
		
		
		
		int i[]= {1,2,4,6};
		//System.out.println(Arrays.toString(i));

//		for(int k=0; k<=i.length-1; k++) {
//			System.out.println(i[k]);
//		}
		
		Object data[]= {1,2.3,'A',"Ranjith"};
		//System.out.println(Arrays.toString(data));
		for(Object e:data) {
			System.out.println(e);
		}
		
	}

}
