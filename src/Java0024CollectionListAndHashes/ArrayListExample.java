package Java0024CollectionListAndHashes;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String args[]){

		ArrayList list = new ArrayList(); //Creating arraylist  
		list.add("Ravi"); //Adding object in arraylist  
		list.add("Vijay");  
		list.add("Ravi");  
		list.add("Ajay");  

		//Traversing list through Iterator  
		Iterator itr = list.iterator();  
		while(itr.hasNext()) {  
			System.out.println(itr.next());  
		}
	}
}