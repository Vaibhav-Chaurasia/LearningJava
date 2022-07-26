package Java0023Conversion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayToListAndViceVersa {
	public static void main(String args[]){  

		/*-----------------------------------------------Converting Array to List--------------------------------------*/
		/*How to convert Array to List 
		 * We can convert the Array to List by traversing the array and 
		 * adding the element in list one by one using list.add() method.*/
		//Creating Array  
		String[] array = {"Java", "Python", "PHP", "C++"};  
		System.out.println("Printing Array: " + Arrays.toString(array));  

		//Converting Array to List  
		List<String> list = new ArrayList<String>();  
		for(String lang : array){  
			list.add(lang);  
		}  
		System.out.println("Printing List: " + list);
		/*-------------------------------------------------------------------------------------------------------------*/


		/*-----------------------------------------------Converting List to Array--------------------------------------*/
		/*How to convert List to Array
		 * We can convert the List to Array by calling the list.toArray() method.*/
		List<String> fruitList = new ArrayList<>();    
		fruitList.add("Mango");    
		fruitList.add("Banana");    
		fruitList.add("Apple");    
		fruitList.add("Strawberry");    

		//Converting ArrayList to Array  
		String[] array1 = fruitList.toArray(new String[fruitList.size()]);
		System.out.println("Printing List: " + fruitList);
		System.out.println("Printing Array: " + Arrays.toString(array1));  
		/*-------------------------------------------------------------------------------------------------------------*/
	}
}