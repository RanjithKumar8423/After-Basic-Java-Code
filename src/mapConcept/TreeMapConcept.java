package mapConcept;

import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapConcept {
	public void ure(URL ur) {
		
	}
	public static void main(String[] args) {
		
		TreeMap<String, String> t1=new TreeMap<String, String>(Collections.reverseOrder());
		t1.put("Peter", "SDTE1");
		t1.put("Bsco", "SDTE2");
		t1.put("Lmo", "SDTE3");
		t1.put("Frc", "SDTE4");
		t1.put("ranj", "SDTE5");
		
		for(Map.Entry<String, String> ranji : t1.entrySet()) {
			System.out.println(ranji.getKey()+ ":" +ranji.getValue());
			
			
		}
		
		
		

	}

}
