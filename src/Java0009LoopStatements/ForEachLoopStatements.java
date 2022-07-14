package Java0009LoopStatements;

public class ForEachLoopStatements {

	public static void main(String[] args) {
		
		//For each loop for string
		String[] names = {"Java", "C", "C++", "Python", "JavaScript"};    
		System.out.println("Printing the content of the array names:\n");    
		for(String name:names) {    
			System.out.println(name);    
		}

		//For each loop for array
		int arr[]={12, 23, 44, 56, 78};  
		//Printing array using for-each loop  
		for(int i:arr){  
			System.out.println(i);  
		} 
	}

}
