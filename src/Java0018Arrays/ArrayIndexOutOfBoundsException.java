package Java0018Arrays;

//Java Program to demonstrate the case of   
//ArrayIndexOutOfBoundsException in a Java Array
public class ArrayIndexOutOfBoundsException {
	public static void main(String args[]){  
		int arr[] = {50, 60, 70, 80};  
		
		for(int i = 0; i <= arr.length; i++){  
			System.out.println(arr[i]);  
		}  
	}
}