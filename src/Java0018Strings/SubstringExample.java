package Java0018Strings;

public class SubstringExample {
	public static void main(String args[]){    
		String s = "SachinTendulkar";    

		System.out.println("Original String: " + s);  
		System.out.println("Substring starting from index 6: " + s.substring(6)); //Tendulkar    
		System.out.println("Substring starting from index 0 to 6: " + s.substring(0,6)); //Sachin  
	}
}

/*demonstrates variants of the substring() method of String class. The startindex is inclusive and endindex is exclusive.*/