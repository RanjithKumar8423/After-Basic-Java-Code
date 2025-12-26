package mapConcept;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMapConcept {

	
	public static void main(String[] args) {
		
		LinkedHashMap<String, Integer> empData=new LinkedHashMap<String, Integer>();
		empData.put("peter", 1);
		empData.put("usha", 2);
		empData.put("Om", 3);
		empData.put("poskar", 4);
		empData.put("askar", 5);
		//System.out.println(lm);
		for(Map.Entry<String, Integer> ranjith : empData.entrySet()) {
			System.out.println(ranjith.getKey() + ":" +ranjith.getValue());
			}
//		for(Map.Entry<String, Integer> naveen : empData.entrySet()) {
//			System.out.println(naveen.getKey() + ":" + naveen.getValue());
//		}
	}
}
