package practice;

import java.util.Iterator;
import java.util.Scanner;

public class Selection_Sort {

	public static void main(String[] args) {
		
		Scanner in=new Scanner(System.in);
		int i,j,t,min;
		int m[]=new int[10];
		for(i=0;i<10; i++) {
			System.out.println("Enter The Number In The Cellls  "+i);
			m[i]=in.nextInt();
		}
		for (i=0;i<9;i++) {
			min=i;
			for(j=i+1; j<10; j++) {
				if(m[j]<m[min]) {
					min=j;
				}
				t=m[i];
				m[i]=m[min];
				m[min]=t;
			}
			System.out.println("The Number Arranged in Ascending");
			for(i=0; i<10; i++) {
				System.out.println(m[i]);
			}
		}
		
		

	}

}
