package Java0018Arrays;

/*Let's see the simple example of java array, 
 * where we are going to declare, instantiate, initialize and traverse an array.
 * */

public class ArrayExample {
	public static void main(String args[]){  

		int a[] = new int[5]; //declaration and instantiation  
		a[0] = 10; //initialization  
		a[1] = 20;  
		a[2] = 70;  
		a[3] = 40;  
		a[4] = 50;  

		//traversing array  
		for(int i = 0; i < a.length; i++) //length is the property of array  
			System.out.println(a[i]);  
	}
}