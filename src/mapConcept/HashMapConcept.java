package mapConcept;

import java.util.HashMap;

public class HashMapConcept {

	public static void main(String[] args) {
		
		
		HashMap<String, String> imp=new HashMap<String, String>();
		imp.put("Ranjith", "BE>>");
		imp.put("Kumar", "03");
		imp.put("N", "mo0");
		imp.remove("Kumar");
		System.out.println(imp);
		
		HashMap<String, Integer > k1=new HashMap<String, Integer >();
		k1.put("Ranjith", 900);
		boolean flag=k1.containsKey("Ranjith");
		System.out.println(flag);
		System.out.println(k1);
		System.out.println(k1.size());
		System.out.println(k1.get("Ranjith"));

	}

}
