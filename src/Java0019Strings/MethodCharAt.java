package Java0019Strings;

import java.util.ArrayList;

public class MethodCharAt {
	public static void main(String args[]){  

		/*---------------------------------------------------------------------------------------------*/
		//Returning value of Character at particular index
		String name = "javatpoint";  
		char ch = name.charAt(4); //returns the char value at the 4th index
		System.out.println(ch);
		/*---------------------------------------------------------------------------------------------*/

		/*---------------------------------------------------------------------------------------------*/
		//Accessing First and Last Character by Using the charAt() Method
		String str = "Welcome to Javatpoint portal";      
		int strLength = str.length();      

		// Fetching first character  
		System.out.println("Character at 0 index is: " + str.charAt(0));      

		// The last Character is present at the string length-1 index  
		System.out.println("Character at last index is: " + str.charAt(strLength-1));
		/*---------------------------------------------------------------------------------------------*/


		/*---------------------------------------------------------------------------------------------*/
		//Print Characters Presented at Odd Positions by Using the charAt() Method
		String str1 = "Welcome to Javatpoint portal";          
		for (int i = 0; i <= str1.length() - 1; i++) {  
			if(i % 2 != 0) {  
				System.out.println("Char at " + i + " place " + str1.charAt(i));  
			}  
		}
		/*---------------------------------------------------------------------------------------------*/


		/*---------------------------------------------------------------------------------------------*/
		//Counting Frequency of a character in a String by Using the charAt() Method
		String str2 = "Welcome to Javatpoint portal";  
		int count = 0;  
		for (int i = 0; i <= str2.length() - 1; i++) {  
			if(str2.charAt(i) == 't') {  
				count++;  
			}  
		}  
		
		System.out.println("Frequency of t is: " + count);
		/*---------------------------------------------------------------------------------------------*/
		
		/*---------------------------------------------------------------------------------------------*/
		// creating an object of the class CharAtExample6  
		CharAtExample6 obj = new CharAtExample6();  
		  
		String str3 = "Javatpoint is a great site for learning Java.";    
		  
		int noOfVowel = obj.countVowels(str3);  
		System.out.println("String: " + str3);  
		System.out.println("Total number of vowels in the string are: " + noOfVowel + "\n");    
		  
		str = "One apple in a day keeps doctor away.";  
		System.out.println("String: " + str3);
		noOfVowel = obj.countVowels(str3);
		System.out.println("Total number of vowels in the string are: " + noOfVowel);
		/*---------------------------------------------------------------------------------------------*/


		/*---------------------------------------------------------------------------------------------*/
		//charAt() method where we are passing a greater index value. 
		//In such a case, it throws StringIndexOutOfBoundsException at run time.
		String name1 = "javatpoint";
		char ch1 = name1.charAt(10); //returns the char value at the 10th index
		System.out.println(ch1);
		/*---------------------------------------------------------------------------------------------*/


	}	
}


//counting the number of vowels present in a string with the help of the charAt() method.
class CharAtExample6  
{    
	ArrayList<Character> al;  

	// constructor for creating and   
	// assigning values to the ArrayList al  
	CharAtExample6()  
	{  
		al = new ArrayList<Character>();    
		al.add('A'); 
		al.add('E');  
		al.add('a'); 
		al.add('e');  
		al.add('I'); 
		al.add('O');  
		al.add('i'); 
		al.add('o');  
		al.add('U'); 
		al.add('u');  
	}  

	// a method that checks whether the character c is a vowel or not     
	private boolean isVowel(char c)  
	{  
		for(int i = 0; i < al.size(); i++)  
		{  
			if(c == al.get(i))  
			{  
				return true;  
			}  
		}  
		
		return false;  
	}  

	// a method that calculates vowels in the String s  
	public int countVowels(String s)  
	{  
		int countVowel = 0; // store total number of vowels  
		int size = s.length(); // size of string  
		for(int j = 0; j < size; j++)  
		{  
			char c = s.charAt(j);  
			if(isVowel(c))  
			{  
				// vowel found!  
				// increase the count by 1  
				countVowel = countVowel + 1;  
			}  
		}  

		return countVowel;  
	}
}