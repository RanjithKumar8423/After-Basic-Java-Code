package javacode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Asarray_List {

	public static void main(String[] args) {
		
		ArrayList<Integer> ar=new ArrayList<Integer>(Arrays.asList(83,38,34));
		Collections.sort(ar);
		System.out.println(ar);
		Collections.swap(ar, 0, 1);
		System.out.println(ar);
//		ar.add(58);
//		ar.add(3949);
//		ar.add(49);
//		ar.set(0, 33);
	//	--------------------
//		ar.remove(0);
//		System.out.println(ar);
//		
//		
		ArrayList<Object> a1=new ArrayList<Object>(Arrays.asList("Ranjith",38.4,32,true));
		a1.add("Nann");
		a1.addAll(ar);
		System.out.println(a1);
		a1.removeAll(ar);
		boolean n1=a1.containsAll(ar);
		System.out.println(n1);

	}

}
