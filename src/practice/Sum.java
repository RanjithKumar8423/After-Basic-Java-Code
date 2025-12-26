package practice;

import java.util.Scanner;

public class Sum {
	
	public static void main(String[] args) {
		
		Scanner in =new Scanner(System.in);
		int i,s=0;
		int m[]=new int[20];
		 m[1]=30;
		 m[2]=50;
		for(i=0; i<20; i++) {
			System.out.println("Enter Numbers"+i);
			m[i]=in.nextInt();
		}
		for(i=0;i<20;i++) {
			if(m[i]%3==0 || m[i]%5==0) 
				s=s+m[i];
			}
			System.out.println("Sum Numbers divisible BY 3 or 5:  "+s);
		}
	}


