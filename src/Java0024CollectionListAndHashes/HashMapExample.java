package Java0024CollectionListAndHashes;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String args[]){
		
		/*In this example, we are storing Integer as the key and String as the value, 
		 * so we are using HashMap<Integer,String> as the type. 
		 * The put() method inserts the elements in the map.
		 * To get the key and value elements, we should call the getKey() and getValue() methods. 
		 * The Map.Entry interface contains the getKey() and getValue() methods. 
		 * But, we should call the entrySet() method of Map interface to get the instance of Map.Entry.*/
		HashMap<Integer, String> map = new HashMap<Integer, String>(); //Creating HashMap    
		map.put(1, "Mango"); //Put elements in Map  
		map.put(2, "Apple");    
		map.put(3, "Banana");   
		map.put(4, "Grapes");   

		System.out.println("Iterating Hashmap...");  
		for(@SuppressWarnings("rawtypes") Map.Entry m : map.entrySet()){    
			System.out.println(m.getKey() + " " + m.getValue());    
		}
	}
}