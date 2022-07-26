package Java0024CollectionListAndHashes;

import java.util.ArrayList;

public class ArrayListSizeAndCapacity {

	public static void main(String[] args)
	{
		//Not define the size
		ArrayList<Integer> al = new ArrayList<Integer>();  
		System.out.println("The size of the array is: " + al.size());


		//Define the size
		ArrayList<Integer> al1 = new ArrayList<Integer>(10);  
		System.out.println("The size of the array is: " + al1.size());
	}
}


/*Explanation for 1st code
 * The output makes sense as we have not done anything with the array list.
 * */


/* Exaplanation for 2nd Code
 * We see that the size is still 0, and the reason behind this is the number 10 represents 
 * the capacity not the size. In fact, the size represents the total number of elements present in the array. 
 * As we have not added any element, therefore, the size of the array list is zero in both programs.
 */

/*Capacity represents the total number of elements the array list can contain. 
 * Therefore, the capacity of an array list is always greater than or equal to the size of the array list. 
 * When we add an element to the array list, it checks whether the size of the array list has become equal 
 * to the capacity or not. If yes, then the capacity of the array list increases. So, in the above example, 
 * the capacity will be 10 till 10 elements are added to the list. When we add the 11th element, the capacity increases. 
 * Note that in both examples, the capacity of the array list is 10. In the first case, the capacity is 10 
 * because the default capacity of the array list is 10. In the second case, we have explicitly mentioned that 
 * the capacity of the array list is 10.*/

/*Note: There is no any standard method to tell how the capacity increases in the array list. 
 * In fact, the way the capacity increases vary from one GDK version to the other version.
 *  Therefore, it is required to check the way capacity increases code is implemented in the GDK. 
 *  There is no any pre-defined method in the ArrayList class that returns the capacity of the array list. 
 *  Therefore, for better understanding, use the capacity() method of the Vector class. 
 *  The logic of the size and the capacity is the same in the ArrayList class and the Vector class.*/