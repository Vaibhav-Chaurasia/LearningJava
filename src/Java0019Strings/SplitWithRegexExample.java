package Java0019Strings;

public class SplitWithRegexExample {
	public static void main(String args[]){
		
		/*----------------------------------------------Split Example Starts---------------------------------------*/
		String s1 = "welcome to split world";  

		System.out.println("returning words:");
		for(String w:s1.split("\\s", 0)){  
			System.out.println(w);  
		}  

		System.out.println("returning words:");  
		for(String w:s1.split("\\s", 1)){  
			System.out.println(w);  
		}  

		System.out.println("returning words:");
		for(String w:s1.split("\\s", 2)){  
			System.out.println(w);  
		}
		/*----------------------------------------------Split Example Ends---------------------------------------*/

		

		/*----------------------------------------------Split Example 2 Starts---------------------------------------*/
		/*
		 * Example 2
		 * Here, we are passing split limit as a second argument to this function. 
		 * This limits the number of splitted strings. 
		 * */
		String str = "Javatpointtt";  
		System.out.println("Returning words:");  
		String[] arr = str.split("t", 0);  
		for (String w : arr) {  
			System.out.println(w);  
		}  
		System.out.println("Split array length: " + arr.length);
		/*----------------------------------------------Split Example 2 Ends---------------------------------------*/
	}
}