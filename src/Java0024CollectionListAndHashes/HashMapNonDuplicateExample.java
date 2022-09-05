package Java0024CollectionListAndHashes;

import java.util.HashMap;
import java.util.Map;

public class HashMapNonDuplicateExample {

	/*You cannot store duplicate keys in HashMap. However, 
	 * if you try to store duplicate key with another value, it will replace the value.*/
	public static void main(String args[]){  
		HashMap<Integer, String> map = new HashMap<Integer, String>(); //Creating HashMap    
		map.put(1, "Mango"); //Put elements in Map  
		map.put(2, "Apple");    
		map.put(3, "Banana");   
		map.put(1, "Grapes"); //trying duplicate key  

		System.out.println("Iterating Hashmap...");  
		for(@SuppressWarnings("rawtypes") Map.Entry m : map.entrySet()){    
			System.out.println(m.getKey() + " " + m.getValue());    
		}
	}
}