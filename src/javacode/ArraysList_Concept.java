package javacode;

import java.util.ArrayList;

public class ArraysList_Concept {

	public static void main(String[] args) {

		/*
		 * ArrayList ar=new ArrayList(); ar.add("Ranjith"); ar.add(99); ar.remove(0);
		 * System.out.println(ar);
		 * 
		 */
//		ArrayList<Integer> ar = new ArrayList<Integer>();
//		ar.add(49);
//		ar.add(40);
//		ar.add(30);
		// ar.remove(1);
		// ar.set(0, 100);
		// ar.clear();
		// System.out.println(ar);
		// System.out.println(ar.get(1));
//		for (Integer e : ar) {
//			System.out.println(e);
//		}

		/*
		 * for(int k=0; k<=ar.size()-1; k++) { System.out.println(ar.get(k)); }
		 */

		ArrayList<Object> empdata=new ArrayList<Object>();
		empdata.add("serial number:1");
		empdata.add(8683);
		empdata.add(48.48);
		empdata.add("Ranjith");
		System.out.println(empdata.get(2));
		System.out.println(empdata.size());
//		for(Object e:empdata) {
//			System.out.println(e);
//		}
		for (int k=0; k<=empdata.size()-1; k++) {
			System.out.println(empdata.get(k));
		}
		
		
	}

}
