package Java0024CollectionListAndHashes;

import java.util.Hashtable;
import java.util.Map;

public class HashTablePutGetDefaultRemovePutIfAbsent {
	public static void main(String args[]){  

		/*-----------------------------------------Simple Put Example------------------------------------------*/
		Hashtable<Integer,String> hm = new Hashtable<Integer,String>();  

		hm.put(100, "Amit");  
		hm.put(102, "Ravi");  
		hm.put(101, "Vijay");  
		hm.put(103, "Rahul");  

		for(@SuppressWarnings("rawtypes") Map.Entry m:hm.entrySet()){  
			System.out.println(m.getKey() + " " + m.getValue());  
		}
		/*-----------------------------------------------------------------------------------------------------*/

		

		/*--------------------------Java Hashtable Example: getOrDefault()--------------------------------------*/
		//Here, we specify the if and else statement as arguments of the method  
		System.out.println(hm.getOrDefault(101, "Not Found"));  
		System.out.println(hm.getOrDefault(105, "Not Found"));



		/*Java Hashtable Example: remove()*/
		System.out.println("Before remove: " + hm);    

		// Remove value for key 102  
		hm.remove(102);  
		System.out.println("After remove: " + hm);
		/*-----------------------------------------------------------------------------------------------------*/



		/*---------------------Java Hashtable Example: putIfAbsent()-----------------------------------------*/
		System.out.println("Initial Map: " + hm);  

		//Inserts, as the specified pair is unique  
		hm.putIfAbsent(104, "Gaurav");  
		System.out.println("Updated Map: " + hm);  

		//Returns the current value, as the specified pair already exist  
		hm.putIfAbsent(101, "Vijay");  
		System.out.println("Updated Map: " + hm);
		/*-----------------------------------------------------------------------------------------------------*/
	}
}